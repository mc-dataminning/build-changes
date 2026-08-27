import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fdh extends fdm {
   private static final ahh a = new ahh("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vg n = vg.c("menu.returnToGame");
   private static final vg o = vg.c("gui.advancements");
   private static final vg p = vg.c("gui.stats");
   private static final vg q = vg.c("menu.sendFeedback");
   private static final vg r = vg.c("menu.reportBugs");
   private static final vg t = vg.c("menu.options");
   private static final vg u = vg.c("menu.shareToLan");
   private static final vg v = vg.c("menu.playerReporting");
   private static final vg w = vg.c("menu.returnToMenu");
   private static final vg x = vg.c("menu.savingLevel");
   private static final vg y = vg.c("menu.game");
   private static final vg z = vg.c("menu.paused");
   private final boolean A;
   @Nullable
   private exr B;

   public fdh(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean o() {
      return this.A;
   }

   @Override
   protected void aP_() {
      if (this.A) {
         this.E();
      }

      this.d(new eyy(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void E() {
      fba $$0 = new fba();
      $$0.c().a(4, 4, 4, 0);
      fba.b $$1 = $$0.d(2);
      $$1.a(exr.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fec(this.f.s.cr.r())));
      $$1.a(this.a(p, () -> new fdv(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fdd(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new fdn(this)));
      } else {
         $$1.a(this.a(v, fhw::new));
      }

      vg $$2 = this.f.R() ? w : vf.p;
      this.B = $$1.a(exr.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.aY().a(this.f, this, this::H, true);
      }).a(204).a(), 2);
      $$0.a();
      faz.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void H() {
      boolean $$0 = this.f.R();
      fop $$1 = this.f.Q();
      this.f.r.W();
      if ($$0) {
         this.f.b(new fcs(x));
      } else {
         this.f.y();
      }

      fdr $$2 = new fdr();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eqv($$2));
      } else {
         this.f.a(new fgk($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aY().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private exr a(vg $$0, Supplier<fdm> $$1) {
      return exr.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private exr a(vg $$0, String $$1) {
      return exr.a($$0, fce.b(this, $$1)).a(98).a();
   }
}
