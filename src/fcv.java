import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fcv extends fda {
   private static final ahg a = new ahg("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vf n = vf.c("menu.returnToGame");
   private static final vf o = vf.c("gui.advancements");
   private static final vf p = vf.c("gui.stats");
   private static final vf q = vf.c("menu.sendFeedback");
   private static final vf r = vf.c("menu.reportBugs");
   private static final vf t = vf.c("menu.options");
   private static final vf u = vf.c("menu.shareToLan");
   private static final vf v = vf.c("menu.playerReporting");
   private static final vf w = vf.c("menu.returnToMenu");
   private static final vf x = vf.c("menu.savingLevel");
   private static final vf y = vf.c("menu.game");
   private static final vf z = vf.c("menu.paused");
   private final boolean A;
   @Nullable
   private exf B;

   public fcv(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean n() {
      return this.A;
   }

   @Override
   protected void aN_() {
      if (this.A) {
         this.D();
      }

      this.d(new eym(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void D() {
      fao $$0 = new fao();
      $$0.c().a(4, 4, 4, 0);
      fao.b $$1 = $$0.d(2);
      $$1.a(exf.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fdq(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new fdj(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fcr(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new fdb(this)));
      } else {
         $$1.a(this.a(v, fhk::new));
      }

      vf $$2 = this.f.R() ? w : ve.p;
      this.B = $$1.a(exf.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.aX().a(this.f, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      fan.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void E() {
      boolean $$0 = this.f.R();
      foc $$1 = this.f.Q();
      this.f.r.W();
      if ($$0) {
         this.f.b(new fcg(x));
      } else {
         this.f.y();
      }

      fdf $$2 = new fdf();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eql($$2));
      } else {
         this.f.a(new ffy($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ewt $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private exf a(vf $$0, Supplier<fda> $$1) {
      return exf.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private exf a(vf $$0, String $$1) {
      return exf.a($$0, fbs.b(this, $$1)).a(98).a();
   }
}
