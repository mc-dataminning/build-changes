import java.util.function.Supplier;
import javax.annotation.Nullable;

public class flt extends fly {
   private static final akm a = new akm("icon/draft_report");
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
   private ffz H;

   public flt(boolean $$0) {
      super($$0 ? E : F);
      this.G = $$0;
   }

   public boolean m() {
      return this.G;
   }

   @Override
   protected void aM_() {
      if (this.G) {
         this.C();
      }

      this.c(new fhg(0, this.G ? 40 : 10, this.n, 9, this.l, this.p));
   }

   private void C() {
      fjl $$0 = new fjl();
      $$0.c().a(4, 4, 4, 0);
      fjl.b $$1 = $$0.d(2);
      $$1.a(ffz.a(u, $$0x -> {
         this.m.a(null);
         this.m.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(v, () -> new fmn(this.m.s.h.q(), this)));
      $$1.a(this.a(w, () -> new fmh(this, this.m.s.j())));
      $$1.a(this.a(x, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(y, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(z, () -> new flp(this, this.m.m)));
      if (this.m.U() && !this.m.V().r()) {
         $$1.a(this.a(A, () -> new flz(this)));
      } else {
         $$1.a(this.a(B, () -> new fqi(this)));
      }

      wx $$2 = this.m.T() ? C : ww.p;
      this.H = $$1.a(ffz.a($$2, $$0x -> {
         $$0x.j = false;
         this.m.bb().a(this.m, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fjk.a($$0, 0, 0, this.n, this.o, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void D() {
      boolean $$0 = this.m.T();
      fxf $$1 = this.m.S();
      this.m.r.X();
      if ($$0) {
         this.m.b(new fle(D));
      } else {
         this.m.y();
      }

      fmd $$2 = new fmd();
      if ($$0) {
         this.m.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.m.a(new ezd($$2));
      } else {
         this.m.a(new fow($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ffm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.G && this.m != null && this.m.bb().c() && this.H != null) {
         $$0.a(a, this.H.C() + this.H.x() - 17, this.H.D() + 3, 15, 15);
      }
   }

   @Override
   public void b(ffm $$0, int $$1, int $$2, float $$3) {
      if (this.G) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ffz a(wx $$0, Supplier<fly> $$1) {
      return ffz.a($$0, $$1x -> this.m.a($$1.get())).a(98).a();
   }

   private ffz a(wx $$0, String $$1) {
      return ffz.a($$0, fkp.b(this, $$1)).a(98).a();
   }
}
