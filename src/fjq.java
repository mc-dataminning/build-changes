import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjq extends hhs {
   private static final Logger a = LogUtils.getLogger();
   private static final xk b = xk.c("mco.configure.world.buttons.invite");
   private static final xk c = xk.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xk C = xk.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xk D = xk.c("mco.configure.world.players.error").b(-65536);
   private final frn E = new frn(this);
   private foh F;
   private fny G;
   private final fic H;
   private final fjl I;
   private final ftr J;
   @Nullable
   private xk K;

   public fjq(fjl $$0, ftr $$1, fic $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aT_() {
      this.E.a(b, this.p);
      frr $$0 = this.E.c(frr.d().a(8));
      this.F = new foh(this.m.h, 200, 20, xk.c("mco.configure.world.invite.profile.name"));
      $$0.a(frj.a(this.p, this.F, c));
      this.G = $$0.a(fny.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(fny.a(xj.k, $$0x -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         fnw var10000 = this.c($$1);
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
      if (bar.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fic>supplyAsync(() -> {
            try {
               return fhb.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ae.h()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fjw(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(xk $$0) {
      this.K = $$0;
      this.m.aZ().c($$0);
   }

   @Override
   public void aP_() {
      this.m.a(this.J);
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.E() + this.G.w() + 8, -1);
      }
   }
}
