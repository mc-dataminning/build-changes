import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fot extends hrm {
   private static final Logger a = LogUtils.getLogger();
   private static final xa b = xa.c("mco.configure.world.buttons.invite");
   private static final xa c = xa.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final xa C = xa.c("mco.configure.world.players.inviting").b(-6250336);
   private static final xa D = xa.c("mco.configure.world.players.error").b(-65536);
   private final fxz E = new fxz(this);
   private fuu F;
   private ful G;
   private final fne H;
   private final fon I;
   private final gad J;
   @Nullable
   private xa K;

   public fot(fon $$0, gad $$1, fne $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aS_() {
      this.E.a(b, this.p);
      fyd $$0 = this.E.c(fyd.d().a(8));
      this.F = new fuu(this.m.h, 200, 20, xa.c("mco.configure.world.invite.profile.name"));
      $$0.a(fxv.a(this.p, this.F, c));
      this.G = $$0.a(ful.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(ful.a(wz.k, $$0x -> this.aP_()).a(200).a());
      this.E.a($$1 -> {
         fuj var10000 = this.c($$1);
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
      if (ban.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fne>supplyAsync(() -> {
            try {
               return fmd.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, ag.i()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new foz(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(xa $$0) {
      this.K = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void aP_() {
      this.m.a(this.J);
   }

   @Override
   public void a(ftx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.G() + this.G.y() + 8, -1);
      }
   }
}
