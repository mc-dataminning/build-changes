import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmy extends fnd {
   private static final alf a = new alf("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final xp u = xp.c("menu.returnToGame");
   private static final xp v = xp.c("gui.advancements");
   private static final xp w = xp.c("gui.stats");
   private static final xp x = xp.c("menu.sendFeedback");
   private static final xp y = xp.c("menu.reportBugs");
   private static final xp z = xp.c("menu.options");
   private static final xp A = xp.c("menu.shareToLan");
   private static final xp B = xp.c("menu.playerReporting");
   private static final xp C = xp.c("menu.returnToMenu");
   private static final xp D = xp.c("menu.savingLevel");
   private static final xp E = xp.c("menu.game");
   private static final xp F = xp.c("menu.paused");
   private final boolean G;
   @Nullable
   private fhe H;

   public fmy(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aM_() {
      if (this.G) {
         this.E();
      }

      this.c(new fil(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fkq $$0 = new fkq();
      $$0.c().a(4, 4, 4, 0);
      fkq.b $$1 = $$0.d(2);
      $$1.a(fhe.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fns(this.m.s.cz.p(), this)));
      $$1.a(this.a(w, () -> new fnm(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fmu(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fne(this)));
      } else {
         $$1.a(this.a(B, () -> new frm(this)));
      }

      xp $$2 = this.m.T() ? C : xo.p;
      this.H = $$1.a(fhe.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.aZ().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fkp.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void F() {
      boolean $$0 = this.m.T();
      fyj $$1 = this.m.S();
      this.m.r.Y();
      if ($$0) {
         this.m.b(new fmj(D));
      } else {
         this.m.y();
      }

      fni $$2 = new fni();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new faj($$2));
      } else {
         this.m.a(new fqb($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.aZ().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fgr $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fhe a(xp $$0, Supplier<fnd> $$1) {
      return fhe.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private fhe a(xp $$0, String $$1) {
      return fhe.a($$0, flu.b(this, $$1)).a(98).a();
   }
}
