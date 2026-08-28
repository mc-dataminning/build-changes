import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fho extends hff {
   private static final Logger a = LogUtils.getLogger();
   private static final xl b = xl.c("mco.configure.world.buttons.invite");
   private static final xl c = xl.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xl B = xl.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xl C = xl.c("mco.configure.world.players.error").b(-65536);
   private final fpl D = new fpl(this);
   private fmf E;
   private flw F;
   private final fgb G;
   private final fhj H;
   private final frp I;
   @Nullable
   private xl J;

   public fho(fhj $$0, frp $$1, fgb $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aS_() {
      this.D.a(b, this.p);
      fpp $$0 = this.D.c(fpp.d().a(8));
      this.E = new fmf(this.m.h, 200, 20, xl.c("mco.configure.world.invite.profile.name"));
      $$0.a(fph.a(this.p, this.E, c));
      this.F = $$0.a(flw.a(b, $$0x -> this.D()).a(200).a());
      this.D.b(flw.a(xk.k, $$0x -> this.aP_()).a(200).a());
      this.D.a($$1 -> {
         flu var10000 = this.c($$1);
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
      if (bak.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fgb>supplyAsync(() -> {
            try {
               return ffa.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ae.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fhu(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.r);
      }
   }

   private void a(xl $$0) {
      this.J = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void aP_() {
      this.m.a(this.I);
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.E() + this.F.w() + 8, -1);
      }
   }
}
