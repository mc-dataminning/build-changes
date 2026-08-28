import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fgv extends hep {
   private static final Logger a = LogUtils.getLogger();
   private static final xi b = xi.c("mco.configure.world.buttons.invite");
   private static final xi c = xi.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xi B = xi.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xi C = xi.c("mco.configure.world.players.error").b(-65536);
   private final fow D = new fow(this);
   private flq E;
   private flh F;
   private final ffi G;
   private final fgq H;
   private final fra I;
   @Nullable
   private xi J;

   public fgv(fgq $$0, fra $$1, ffi $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aR_() {
      this.D.a(b, this.p);
      fpa $$0 = this.D.c(fpa.d().a(8));
      this.E = new flq(this.m.h, 200, 20, xi.c("mco.configure.world.invite.profile.name"));
      $$0.a(fos.a(this.p, this.E, c));
      this.F = $$0.a(flh.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(flh.a(xh.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         flf var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aG_() {
      this.b(this.E);
   }

   private void D() {
      if (bah.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<ffi>supplyAsync(() -> {
            try {
               return fer.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ae.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fhb(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xi $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
