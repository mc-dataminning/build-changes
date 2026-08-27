import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class euv extends gmw {
   private static final Logger a = LogUtils.getLogger();
   private static final vq b = vq.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vq c = vq.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vq v = vq.c("mco.configure.world.players.error").b(-65536);
   private ezq w;
   private ezh x;
   private final eth y;
   private final euq z;
   private final ffe A;
   @Nullable
   private vq B;

   public euv(euq $$0, ffe $$1, eth $$2) {
      super(ewz.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aQ_() {
      this.w = new ezq(this.f.h, this.g / 2 - 100, g(2), 200, 20, null, vq.c("mco.configure.world.invite.profile.name"));
      this.e(this.w);
      this.x = this.d(ezh.a(vq.c("mco.configure.world.buttons.invite"), $$0 -> this.E()).a(this.g / 2 - 100, g(10), 200, 20).a());
      this.d(ezh.a(vp.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   protected void aH_() {
      this.c(this.w);
   }

   private void E() {
      if (ac.b(this.w.a())) {
         this.a(v);
      } else {
         long $$0 = this.y.a;
         String $$1 = this.w.a().trim();
         this.x.j = false;
         this.w.e(false);
         this.a(c);
         CompletableFuture.<eth>supplyAsync(() -> {
            try {
               return esq.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new evc(this.z, this.y));
            } else {
               this.a(v);
            }

            this.w.e(true);
            this.x.j = true;
         }, this.j);
      }
   }

   private void a(vq $$0) {
      this.B = $$0;
      this.f.aW().c($$0);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.A);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, g(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, g(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
