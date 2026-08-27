import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fgc extends fgh {
   private static final ajc a = new ajc("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vs n = vs.c("menu.returnToGame");
   private static final vs o = vs.c("gui.advancements");
   private static final vs p = vs.c("gui.stats");
   private static final vs q = vs.c("menu.sendFeedback");
   private static final vs r = vs.c("menu.reportBugs");
   private static final vs t = vs.c("menu.options");
   private static final vs u = vs.c("menu.shareToLan");
   private static final vs v = vs.c("menu.playerReporting");
   private static final vs w = vs.c("menu.returnToMenu");
   private static final vs x = vs.c("menu.savingLevel");
   private static final vs y = vs.c("menu.game");
   private static final vs z = vs.c("menu.paused");
   private final boolean A;
   @Nullable
   private fak B;

   public fgc(boolean $$0) {
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

      this.c(new fbr(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void E() {
      fdv $$0 = new fdv();
      $$0.c().a(4, 4, 4, 0);
      fdv.b $$1 = $$0.d(2);
      $$1.a(fak.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fgx(this.f.s.cr.q())));
      $$1.a(this.a(p, () -> new fgq(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new ffy(this, this.f.m)));
      if (this.f.T() && !this.f.U().r()) {
         $$1.a(this.a(u, () -> new fgi(this)));
      } else {
         $$1.a(this.a(v, fkr::new));
      }

      vs $$2 = this.f.S() ? w : vr.p;
      this.B = $$1.a(fak.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.aZ().a(this.f, this, this::H, true);
      }).a(204).a(), 2);
      $$0.a();
      fdu.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void H() {
      boolean $$0 = this.f.S();
      frn $$1 = this.f.R();
      this.f.r.W();
      if ($$0) {
         this.f.b(new ffn(x));
      } else {
         this.f.x();
      }

      fgm $$2 = new fgm();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eto($$2));
      } else {
         this.f.a(new fjf($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aZ().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fak a(vs $$0, Supplier<fgh> $$1) {
      return fak.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private fak a(vs $$0, String $$1) {
      return fak.a($$0, fez.b(this, $$1)).a(98).a();
   }
}
