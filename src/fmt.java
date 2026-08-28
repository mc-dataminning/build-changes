import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmt extends fmy {
   private static final alb a = new alb("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final xl u = xl.c("menu.returnToGame");
   private static final xl v = xl.c("gui.advancements");
   private static final xl w = xl.c("gui.stats");
   private static final xl x = xl.c("menu.sendFeedback");
   private static final xl y = xl.c("menu.reportBugs");
   private static final xl z = xl.c("menu.options");
   private static final xl A = xl.c("menu.shareToLan");
   private static final xl B = xl.c("menu.playerReporting");
   private static final xl C = xl.c("menu.returnToMenu");
   private static final xl D = xl.c("menu.savingLevel");
   private static final xl E = xl.c("menu.game");
   private static final xl F = xl.c("menu.paused");
   private final boolean G;
   @Nullable
   private fgz H;

   public fmt(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aN_() {
      if (this.G) {
         this.C();
      }

      this.c(new fig(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void C() {
      fkl $$0 = new fkl();
      $$0.c().a(4, 4, 4, 0);
      fkl.b $$1 = $$0.d(2);
      $$1.a(fgz.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fnn(this.m.s.cz.q(), this)));
      $$1.a(this.a(w, () -> new fnh(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fmp(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fmz(this)));
      } else {
         $$1.a(this.a(B, () -> new frh(this)));
      }

      xl $$2 = this.m.T() ? C : xk.p;
      this.H = $$1.a(fgz.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.aZ().a(this.m, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fkk.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.m.T();
      fye $$1 = this.m.S();
      this.m.r.Y();
      if ($$0) {
         this.m.b(new fme(D));
      } else {
         this.m.y();
      }

      fnd $$2 = new fnd();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fae($$2));
      } else {
         this.m.a(new fpw($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.aZ().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fgz a(xl $$0, Supplier<fmy> $$1) {
      return fgz.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private fgz a(xl $$0, String $$1) {
      return fgz.a($$0, flp.b(this, $$1)).a(98).a();
   }
}
