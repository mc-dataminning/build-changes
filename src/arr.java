import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.annotation.Nullable;
import net.minecraft.server.MinecraftServer;
import org.slf4j.Logger;

public class arr extends arq implements abm, ws {
   private static final Logger e = LogUtils.getLogger();
   private static final xe f = xe.c("multiplayer.disconnect.invalid_player_data");
   private final GameProfile g;
   private final Queue<arj> h = new ConcurrentLinkedQueue<>();
   @Nullable
   private arj i;
   private aqi j;
   @Nullable
   private asc k;

   public arr(MinecraftServer $$0, wc $$1, ari $$2) {
      super($$0, $$1, $$2);
      this.g = $$2.a();
      this.j = $$2.c();
   }

   @Override
   protected GameProfile j() {
      return this.g;
   }

   @Override
   public void a(xe $$0) {
      e.info("{} lost connection: {}", this.g, $$0.getString());
      super.a($$0);
   }

   @Override
   public boolean c() {
      return this.d.i();
   }

   public void m() {
      this.b(new zs(new aak(this.c.getServerModName())));
      jh<alc> $$0 = this.c.bd();
      List<atk> $$1 = this.c.bg().b().flatMap($$0x -> $$0x.a().d().stream()).toList();
      this.b(new abj(cor.e.b(this.c.bb().K())));
      this.k = new asc($$1, $$0);
      this.h.add(this.k);
      this.o();
      this.h.add(new asa());
      this.p();
   }

   public void n() {
      this.h.add(new asa());
      this.p();
   }

   private void o() {
      this.c.X().ifPresent($$0 -> this.h.add(new asb($$0)));
   }

   @Override
   public void a(aad $$0) {
      this.j = $$0.b();
   }

   @Override
   public void a(aah $$0) {
      super.a($$0);
      if ($$0.e().a()) {
         this.a(asb.a);
      }
   }

   @Override
   public void a(abo $$0) {
      zo.a($$0, this, this.c);
      if (this.k == null) {
         throw new IllegalStateException("Unexpected response from client: received pack selection, but no negotiation ongoing");
      } else {
         this.k.a($$0.b(), this::b);
         this.a(asc.a);
      }
   }

   @Override
   public void a(abn $$0) {
      zo.a($$0, this, this.c);
      this.a(asa.a);
      this.d.a(agk.b.bind(wp.a(this.c.bc())));

      try {
         auq $$1 = this.c.ah();
         if ($$1.a(this.g.getId()) != null) {
            this.b(auq.g);
            return;
         }

         xe $$2 = $$1.a(this.d.d(), this.g);
         if ($$2 != null) {
            this.b($$2);
            return;
         }

         aqu $$3 = $$1.a(this.g, this.j);
         $$1.a(this.d, $$3, this.a(this.j));
      } catch (Exception var5) {
         e.error("Couldn't place player in world", var5);
         this.d.a(new zt(f));
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
         arj $$0 = this.h.poll();
         if ($$0 != null) {
            this.i = $$0;
            $$0.a(this::b);
         }
      }
   }

   private void a(arj.a $$0) {
      arj.a $$1 = this.i != null ? this.i.a() : null;
      if (!$$0.equals($$1)) {
         throw new IllegalStateException("Unexpected request for task finish, current task: " + $$1 + ", requested: " + $$0);
      } else {
         this.i = null;
         this.p();
      }
   }
}
