import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezd extends grl {
   private static final Logger a = LogUtils.getLogger();
   private static final wg b = wg.c("mco.configure.world.buttons.invite");
   private static final wg c = wg.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wg y = wg.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wg z = wg.c("mco.configure.world.players.error").b(-65536);
   private final fhc A = new fhc(this);
   private fdy B;
   private fdp C;
   private final exp D;
   private final eyy E;
   private final fjo F;
   @Nullable
   private wg G;

   public ezd(eyy $$0, fjo $$1, exp $$2) {
      super(b);
      this.E = $$0;
      this.F = $$1;
      this.D = $$2;
   }

   @Override
   public void aN_() {
      this.A.a(b, this.m);
      fhg $$0 = this.A.c(fhg.d().a(8));
      this.B = new fdy(this.j.h, 200, 20, wg.c("mco.configure.world.invite.profile.name"));
      $$0.a(fgy.a(this.m, this.B, c));
      this.C = $$0.a(fdp.a(b, $$0x -> this.C()).a(200).a());
      this.A.b(fdp.a(wf.k, $$0x -> this.d()).a(200).a());
      this.A.a($$1 -> {
         fdn var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.A.a();
   }

   @Override
   protected void aD_() {
      this.b(this.B);
   }

   private void C() {
      if (ayf.h(this.B.a())) {
         this.a(z);
      } else {
         long $$0 = this.D.a;
         String $$1 = this.B.a().trim();
         this.C.j = false;
         this.B.e(false);
         this.a(y);
         CompletableFuture.<exp>supplyAsync(() -> {
            try {
               return ewy.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.g()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.D.h = $$0x.h;
               this.j.a(new ezk(this.E, this.D));
            } else {
               this.a(z);
            }

            this.B.e(true);
            this.C.j = true;
         }, this.n);
      }
   }

   private void a(wg $$0) {
      this.G = $$0;
      this.j.aY().c($$0);
   }

   @Override
   public void d() {
      this.j.a(this.F);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G != null) {
         $$0.a(this.m, this.G, this.k / 2, this.C.D() + this.C.v() + 8, -1);
      }
   }
}
