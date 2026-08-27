import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqc extends aqb implements aac, vi {
   private static final Logger e = LogUtils.getLogger();
   private static final vu f = vu.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<apv> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private apv i;
   private aou j;
   @Nullable
   private aqn k;

   public aqc(MinecraftServer $$0, us $$1, apu $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(vu $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new yi(new za(this.c.getServerModName())));
      is<ajq> $$0 = this.c.be();
      List<arv> $$1 = this.c.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new zz(clj.e.b(this.c.bc().K())));
      this.k = new aqn($$1, $$0);
      this.h.add(this.k);
      this.o();
      this.h.add(new aql());
      this.p();
   }

   public void n() {
      this.h.add(new aql());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new aqm($$0)));
   }

   @Override
   public void a(yt $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(yx $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(aqm.a);
      }
   }

   @Override
   public void a(aae $$0) {
      ye.a($$0, this, this.c);
      if (this.k == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.k.a($$0.b(), this::b);
         this.a(aqn.a);
      }
   }

   @Override
   public void a(aad $$0) {
      ye.a($$0, this, this.c);
      this.a(aql.a);
      this.d.a(aey.b.bind(vf.a(this.c.bd())));

      try {
         atb $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(atb.g);
            return;
         }

         vu $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         apg $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new yj(f));
         this.d.a(f);
      }
   }

   @Override
   public void e() {
      this.f();
   }

   private void p() {
      if (this.i != null) {
         throw new IllegalStateException("Task " + this.i.a().a() + " has not finished yet");
      } else if (this.c()) {
         apv $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(apv.a $$0) {
      apv.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
