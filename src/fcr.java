import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fcr extends gve {
   private static final Logger a = LogUtils.getLogger();
   private static final xo b = xo.c("mco.configure.world.buttons.invite");
   private static final xo c = xo.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xo B = xo.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xo C = xo.c("mco.configure.world.players.error").b(-65536);
   private final fkp D = new fkp(this);
   private fhl E;
   private fhc F;
   private final fbd G;
   private final fcm H;
   private final fnb I;
   @Nullable
   private xo J;

   public fcr(fcm $$0, fnb $$1, fbd $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.D.a(b, this.p);
      fkt $$0 = this.D.c(fkt.d().a(8));
      this.E = new fhl(this.m.h, 200, 20, xo.c("mco.configure.world.invite.profile.name"));
      $$0.a(fkl.a(this.p, this.E, c));
      this.F = $$0.a(fhc.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(fhc.a(xn.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fha var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aC_() {
      this.b(this.E);
   }

   private void D() {
      if (azt.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fbd>supplyAsync(() -> {
            try {
               return fam.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fcy(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(xo $$0) {
      this.J = $$0;
      this.m.aX().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fgp $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
