import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evc extends gnd {
   private static final Logger a = LogUtils.getLogger();
   private static final vq b = vq.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final vq c = vq.c("mco.configure.world.players.inviting").b(-6250336);
   private static final vq v = vq.c("mco.configure.world.players.error").b(-65536);
   private ezx w;
   private ezo x;
   private final eto y;
   private final eux z;
   private final ffl A;
   @Nullable
   private vq B;

   public evc(eux $$0, ffl $$1, eto $$2) {
      super(exg.a);
      this.z = $$0;
      this.A = $$1;
      this.y = $$2;
   }

   @Override
   public void aQ_() {
      this.w = new ezx(this.f.h, this.g / 2 - 100, g(2), 200, 20, null, vq.c("mco.configure.world.invite.profile.name"));
      this.d(this.w);
      this.x = this.c(ezo.a(vq.c("mco.configure.world.buttons.invite"), $$0 -> this.E()).a(this.g / 2 - 100, g(10), 200, 20).a());
      this.c(ezo.a(vp.e, $$0 -> this.f.a(this.A)).a(this.g / 2 - 100, g(12), 200, 20).a());
   }

   @Override
   protected void aH_() {
      this.b(this.w);
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
         CompletableFuture.<eto>supplyAsync(() -> {
            try {
               return esx.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.y.h = $$0x.h;
               this.f.a(new evj(this.z, this.y));
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
      this.f.aX().c($$0);
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
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, b, this.g / 2 - 100, g(1), -1, false);
      if (this.B != null) {
         $$0.a(this.i, this.B, this.g / 2, g(5), -1);
      }

      this.w.a($$0, $$1, $$2, $$3);
   }
}
