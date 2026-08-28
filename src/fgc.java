import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgc extends hdp {
   private static final Logger a = LogUtils.getLogger();
   private static final xe b = xe.c("mco.configure.world.buttons.invite");
   private static final xe c = xe.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xe B = xe.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xe C = xe.c("mco.configure.world.players.error").b(-65536);
   private final foc D = new foc(this);
   private fkx E;
   private fko F;
   private final fep G;
   private final ffx H;
   private final fqh I;
   @Nullable
   private xe J;

   public fgc(ffx $$0, fqh $$1, fep $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aS_() {
      this.D.a(b, this.p);
      fog $$0 = this.D.c(fog.d().a(8));
      this.E = new fkx(this.m.h, 200, 20, xe.c("mco.configure.world.invite.profile.name"));
      $$0.a(fny.a(this.p, this.E, c));
      this.F = $$0.a(fko.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(fko.a(xd.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fkm var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aH_() {
      this.b(this.E);
   }

   private void D() {
      if (bac.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fep>supplyAsync(() -> {
            try {
               return fdy.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fgi(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xe $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
