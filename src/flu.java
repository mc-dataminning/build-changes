import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flu extends flz {
   private static final akn a = new akn("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int d = 4;
   private static final int r = 204;
   private static final int s = 98;
   private static final wx u = wx.c("menu.returnToGame");
   private static final wx v = wx.c("gui.advancements");
   private static final wx w = wx.c("gui.stats");
   private static final wx x = wx.c("menu.sendFeedback");
   private static final wx y = wx.c("menu.reportBugs");
   private static final wx z = wx.c("menu.options");
   private static final wx A = wx.c("menu.shareToLan");
   private static final wx B = wx.c("menu.playerReporting");
   private static final wx C = wx.c("menu.returnToMenu");
   private static final wx D = wx.c("menu.savingLevel");
   private static final wx E = wx.c("menu.game");
   private static final wx F = wx.c("menu.paused");
   private final boolean G;
   @Nullable
   private fga H;

   public flu(boolean $$0) {
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

      this.c(new fhh(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void C() {
      fjm $$0 = new fjm();
      $$0.c().a(4, 4, 4, 0);
      fjm.b $$1 = $$0.d(2);
      $$1.a(fga.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fmo(this.m.s.cz.q(), this)));
      $$1.a(this.a(w, () -> new fmi(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new flq(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new fma(this)));
      } else {
         $$1.a(this.a(B, () -> new fqi(this)));
      }

      wx $$2 = this.m.T() ? C : ww.p;
      this.H = $$1.a(fga.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.aZ().a(this.m, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fjl.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.m.T();
      fxf $$1 = this.m.S();
      this.m.r.X();
      if ($$0) {
         this.m.b(new flf(D));
      } else {
         this.m.y();
      }

      fme $$2 = new fme();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new ezf($$2));
      } else {
         this.m.a(new fox($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.aZ().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fga a(wx $$0, Supplier<flz> $$1) {
      return fga.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private fga a(wx $$0, String $$1) {
      return fga.a($$0, fkq.b(this, $$1)).a(98).a();
   }
}
