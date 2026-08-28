import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fmx extends fnc {
   private static final ale a = new ale("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final xo u = xo.c("menu.returnToGame");
   private static final xo v = xo.c("gui.advancements");
   private static final xo w = xo.c("gui.stats");
   private static final xo x = xo.c("menu.sendFeedback");
   private static final xo y = xo.c("menu.reportBugs");
   private static final xo z = xo.c("menu.options");
   private static final xo A = xo.c("menu.shareToLan");
   private static final xo B = xo.c("menu.playerReporting");
   private static final xo C = xo.c("menu.returnToMenu");
   private static final xo D = xo.c("menu.savingLevel");
   private static final xo E = xo.c("menu.game");
   private static final xo F = xo.c("menu.paused");
   private final boolean G;
   @Nullable
   private fhd H;

   public fmx(boolean $$0) {
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

      this.c(new fik(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void E() {
      fkp $$0 = new fkp();
      $$0.c().a(4, 4, 4, 0);
      fkp.b $$1 = $$0.d(2);
      $$1.a(fhd.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fnr(this.m.s.cz.p(), this)));
      $$1.a(this.a(w, () -> new fnl(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new fmt(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fnd(this)));
      } else {
         $$1.a(this.a(B, () -> new frl(this)));
      }

      xo $$2 = this.m.T() ? C : xn.p;
      this.H = $$1.a(fhd.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.aZ().a(this.m, this, this::F, true);
      }).a(204).a(), 2);
      $$0.a();
      fko.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void F() {
      boolean $$0 = this.m.T();
      fyi $$1 = this.m.S();
      this.m.r.Y();
      if ($$0) {
         this.m.b(new fmi(D));
      } else {
         this.m.y();
      }

      fnh $$2 = new fnh();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new fai($$2));
      } else {
         this.m.a(new fqa($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.aZ().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(fgq $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fhd a(xo $$0, Supplier<fnc> $$1) {
      return fhd.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private fhd a(xo $$0, String $$1) {
      return fhd.a($$0, flt.b(this, $$1)).a(98).a();
   }
}
