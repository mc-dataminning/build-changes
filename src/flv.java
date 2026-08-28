import com.mojang.logging.LogUtils;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flv extends hol {
   private static final Logger a = LogUtils.getLogger();
   private static final ww b = ww.c("mco.configure.world.buttons.invite");
   private static final ww c = ww.c("mco.configure.world.invite.profile.name").b(-6250336);
   private static final ww C = ww.c("mco.configure.world.players.inviting").b(-6250336);
   private static final ww D = ww.c("mco.configure.world.players.error").b(-65536);
   private final fve E = new fve(this);
   private frz F;
   private frq G;
   private final fkh H;
   private final flq I;
   private final fxi J;
   @Nullable
   private ww K;

   public flv(flq $$0, fxi $$1, fkh $$2) {
      super(b);
      this.I = $$0;
      this.J = $$1;
      this.H = $$2;
   }

   @Override
   public void aN_() {
      this.E.a(b, this.p);
      fvi $$0 = this.E.c(fvi.d().a(8));
      this.F = new frz(this.m.h, 200, 20, ww.c("mco.configure.world.invite.profile.name"));
      $$0.a(fva.a(this.p, this.F, c));
      this.G = $$0.a(frq.a(b, $$0x -> this.E()).a(200).a());
      this.E.b(frq.a(wv.k, $$0x -> this.aK_()).a(200).a());
      this.E.a($$1 -> {
         fro var10000 = this.c($$1);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.E.a();
   }

   @Override
   protected void aB_() {
      this.b(this.F);
   }

   private void E() {
      if (baj.h(this.F.a())) {
         this.a(D);
      } else {
         long $$0 = this.H.a;
         String $$1 = this.F.a().trim();
         this.G.j = false;
         this.F.e(false);
         this.a(C);
         CompletableFuture.<fkh>supplyAsync(() -> {
            try {
               return fjg.a().a($$0, $$1);
            } catch (Exception var4) {
               a.error("Couldn't invite user");
               return null;
            }
         }, af.i()).thenAcceptAsync($$0x -> {
            if ($$0x != null) {
               this.H.h = $$0x.h;
               this.m.a(new fmb(this.I, this.H));
            } else {
               this.a(D);
            }

            this.F.e(true);
            this.G.j = true;
         }, this.r);
      }
   }

   private void a(ww $$0) {
      this.K = $$0;
      this.m.aY().c($$0);
   }

   @Override
   public void aK_() {
      this.m.a(this.J);
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.K != null) {
         $$0.a(this.p, this.K, this.n / 2, this.G.G() + this.G.y() + 8, -1);
      }
   }
}
