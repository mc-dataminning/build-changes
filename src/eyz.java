import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eyz extends ezd {
   private static final afw a = new afw("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final ui n = ui.c("menu.returnToGame");
   private static final ui o = ui.c("gui.advancements");
   private static final ui p = ui.c("gui.stats");
   private static final ui q = ui.c("menu.sendFeedback");
   private static final ui s = ui.c("menu.reportBugs");
   private static final ui t = ui.c("menu.options");
   private static final ui u = ui.c("menu.shareToLan");
   private static final ui v = ui.c("menu.playerReporting");
   private static final ui w = ui.c("menu.returnToMenu");
   private static final ui x = ui.c("menu.savingLevel");
   private static final ui y = ui.c("menu.game");
   private static final ui z = ui.c("menu.paused");
   private final boolean A;
   @Nullable
   private etj B;

   public eyz(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aM_() {
      if (this.A) {
         this.C();
      }

      this.d(new euq(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      ews $$0 = new ews();
      $$0.c().a(4, 4, 4, 0);
      ews.b $$1 = $$0.d(2);
      $$1.a(etj.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new ezt(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new ezm(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new eyv(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eze(this)));
      } else {
         $$1.a(this.a(v, fdm::new));
      }

      ui $$2 = this.f.R() ? w : uh.p;
      this.B = $$1.a(etj.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      ewr.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.R();
      fkc $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new eyk(x));
      } else {
         this.f.z();
      }

      ezi $$2 = new ezi();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new ems($$2));
      } else {
         this.f.a(new fca($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private etj a(ui $$0, Supplier<ezd> $$1) {
      return etj.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private etj a(ui $$0, String $$1) {
      return this.a($$0, () -> new exw($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
