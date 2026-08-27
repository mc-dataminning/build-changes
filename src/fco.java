import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fco extends fct {
   private static final ahd a = new ahd("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vd n = vd.c("menu.returnToGame");
   private static final vd o = vd.c("gui.advancements");
   private static final vd p = vd.c("gui.stats");
   private static final vd q = vd.c("menu.sendFeedback");
   private static final vd r = vd.c("menu.reportBugs");
   private static final vd t = vd.c("menu.options");
   private static final vd u = vd.c("menu.shareToLan");
   private static final vd v = vd.c("menu.playerReporting");
   private static final vd w = vd.c("menu.returnToMenu");
   private static final vd x = vd.c("menu.savingLevel");
   private static final vd y = vd.c("menu.game");
   private static final vd z = vd.c("menu.paused");
   private final boolean A;
   @Nullable
   private ewy B;

   public fco(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean n() {
      return this.A;
   }

   @Override
   protected void aN_() {
      if (this.A) {
         this.C();
      }

      this.d(new eyf(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      fah $$0 = new fah();
      $$0.c().a(4, 4, 4, 0);
      fah.b $$1 = $$0.d(2);
      $$1.a(ewy.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fdj(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new fdc(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fck(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new fcu(this)));
      } else {
         $$1.a(this.a(v, fhd::new));
      }

      vd $$2 = this.f.Q() ? w : vc.p;
      this.B = $$1.a(ewy.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.aW().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      fag.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.Q();
      fnv $$1 = this.f.P();
      this.f.r.W();
      if ($$0) {
         this.f.b(new fbz(x));
      } else {
         this.f.y();
      }

      fcy $$2 = new fcy();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eqe($$2));
      } else {
         this.f.a(new ffr($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ewy a(vd $$0, Supplier<fct> $$1) {
      return ewy.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private ewy a(vd $$0, String $$1) {
      return ewy.a($$0, fbl.b(this, $$1)).a(98).a();
   }
}
