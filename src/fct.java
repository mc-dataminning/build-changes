import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fct extends gvg {
   private static final Logger a = LogUtils.getLogger();
   private static final xp b = xp.c("mco.configure.world.buttons.invite");
   private static final xp c = xp.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xp B = xp.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xp C = xp.c("mco.configure.world.players.error").b(-65536);
   private final fkr D = new fkr(this);
   private fhn E;
   private fhe F;
   private final fbf G;
   private final fco H;
   private final fnd I;
   @Nullable
   private xp J;

   public fct(fco $$0, fnd $$1, fbf $$2) {
      super(b);
      this.H = $$0;
      this.I = $$1;
      this.G = $$2;
   }

   @Override
   public void aM_() {
      this.D.a(b, this.p);
      fkv $$0 = this.D.c(fkv.d().a(8));
      this.E = new fhn(this.m.h, 200, 20, xp.c("mco.configure.world.invite.profile.name"));
      $$0.a(fkn.a(this.p, this.E, c));
      this.F = $$0.a(fhe.a(b, $$0x -> this.E()).a(200).a());
      this.D.b(fhe.a(xo.k, $$0x -> this.d()).a(200).a());
      this.D.a($$1 -> {
         fhc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.D.a();
   }

   @Override
   protected void aB_() {
      this.b(this.E);
   }

   private void E() {
      if (azv.h(this.E.a())) {
         this.a(C);
      } else {
         long $$0 = this.G.a;
         String $$1 = this.E.a().trim();
         this.F.j = false;
         this.E.e(false);
         this.a(B);
         CompletableFuture.<fbf>supplyAsync(() -> {
            try {
               return fao.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ac.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.G.h = $$0x.h;
               this.m.a(new fda(this.H, this.G));
            } else {
               this.a(C);
            }

            this.E.e(true);
            this.F.j = true;
         }, this.q);
      }
   }

   private void a(xp $$0) {
      this.J = $$0;
      this.m.aX().c($$0);
   }

   @Override
   public void d() {
      this.m.a(this.I);
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.J != null) {
         $$0.a(this.p, this.J, this.n / 2, this.F.D() + this.F.v() + 8, -1);
      }
   }
}
