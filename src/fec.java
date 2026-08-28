import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fec extends gwq {
   private static final Logger a = LogUtils.getLogger();
   private static final wz b = wz.c("mco.configure.world.buttons.invite");
   private static final wz c = wz.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final wz B = wz.c("mco.configure.world.players.inviting").b(-6250336);
   private static final wz C = wz.c("mco.configure.world.players.error").b(-65536);
   private final flz D = new flz(this);
   private fiv E;
   private fim F;
   private final fcp G;
   private final fdx H;
   private final fod I;
   @Nullable
   private wz J;

   public fec(fdx $$0, fod $$1, fcp $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aT_() {
      this.D.a(b, this.o);
      fmd $$0 = this.D.c(fmd.d().a(8));
      this.E = new fiv(this.l.h, 200, 20, wz.c("mco.configure.world.invite.profile.name"));
      $$0.a(flv.a(this.o, this.E, c));
      this.F = $$0.a(fim.a(b, $$0x -> this.C()).a(200).a());
      this.D.b(fim.a(wy.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fik var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aI_() {
      this.b(this.E);
   }

   private void C() {
      if (azl.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fcp>supplyAsync(() -> {
            try {
               return fby.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ad.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.l.a(new fei(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(wz $$0) {
      this.J = $$0;
      this.l.aV().c($$0);
   }

   @Override
   public void d() {
      this.l.a(this.I);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.o, this.J, this.m / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
