import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class aqq extends aqp implements aao, vu {
   private static final Logger e = LogUtils.getLogger();
   private static final wg f = wg.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<aqi> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private aqi i;
   private aph j;
   @Nullable
   private arb k;

   public aqq(MinecraftServer $$0, ve $$1, aqh $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(wg $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new yu(new zm(this.c.getServerModName())));
      is<akc> $$0 = this.c.be();
      List<asj> $$1 = this.c.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new aal(cmi.e.b(this.c.bc().K())));
      this.k = new arb($$1, $$0);
      this.h.add(this.k);
      this.o();
      this.h.add(new aqz());
      this.p();
   }

   public void n() {
      this.h.add(new aqz());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new ara($$0)));
   }

   @Override
   public void a(zf $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(zj $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(ara.a);
      }
   }

   @Override
   public void a(aaq $$0) {
      yq.a($$0, this, this.c);
      if (this.k == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.k.a($$0.b(), this::b);
         this.a(arb.a);
      }
   }

   @Override
   public void a(aap $$0) {
      yq.a($$0, this, this.c);
      this.a(aqz.a);
      this.d.a(afk.b.bind(vr.a(this.c.bd())));

      try {
         atp $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(atp.g);
            return;
         }

         wg $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         apt $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new yv(f));
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
         aqi $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(aqi.a $$0) {
      aqi.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
