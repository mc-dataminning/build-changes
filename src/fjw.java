import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjw extends hhv {
   private static final Logger a = LogUtils.getLogger();
   private static final xv b = xv.c("mco.configure.world.buttons.invite");
   private static final xv c = xv.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xv C = xv.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xv D = xv.c("mco.configure.world.players.error").b(-65536);
   private final frt E = new frt(this);
   private fon F;
   private foe G;
   private final fii H;
   private final fjr I;
   private final ftx J;
   @Nullable
   private xv K;

   public fjw(fjr $$0, ftx $$1, fii $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aT_() {
      this.E.a(b, this.p);
      frx $$0 = this.E.c(frx.d().a(8));
      this.F = new fon(this.m.h, 200, 20, xv.c("mco.configure.world.invite.profile.name"));
      $$0.a(frp.a(this.p, this.F, c));
      this.G = $$0.a(foe.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(foe.a(xu.k, $$0x -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         foc var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   protected void aG_() {
      this.b(this.F);
   }

   private void E() {
      if (bbb.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fii>supplyAsync(() -> {
            try {
               return fhh.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ae.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fkc(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(xv $$0) {
      this.K = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void aP_() {
      this.m.a(this.J);
   }

   @Override
   public void a(fnr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.E() + this.G.w() + 8, -1);
      }
   }
}
