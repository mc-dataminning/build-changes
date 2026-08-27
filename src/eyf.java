import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eyf extends eyk {
   private static final aex a = new aex("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final tm n = tm.c("menu.returnToGame");
   private static final tm o = tm.c("gui.advancements");
   private static final tm p = tm.c("gui.stats");
   private static final tm q = tm.c("menu.sendFeedback");
   private static final tm s = tm.c("menu.reportBugs");
   private static final tm t = tm.c("menu.options");
   private static final tm u = tm.c("menu.shareToLan");
   private static final tm v = tm.c("menu.playerReporting");
   private static final tm w = tm.c("menu.returnToMenu");
   private static final tm x = tm.c("menu.savingLevel");
   private static final tm y = tm.c("menu.game");
   private static final tm z = tm.c("menu.paused");
   private final boolean A;
   @Nullable
   private esq B;

   public eyf(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aI_() {
      if (this.A) {
         this.D();
      }

      this.d(new etw(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void D() {
      evy $$0 = new evy();
      $$0.c().a(4, 4, 4, 0);
      evy.b $$1 = $$0.d(2);
      $$1.a(esq.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new eyz(this.f.s.cn.q())));
      $$1.a(this.a(p, () -> new eys(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new eyb(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eyl(this)));
      } else {
         $$1.a(this.a(v, fcs::new));
      }

      tm $$2 = this.f.R() ? w : tl.p;
      this.B = $$1.a(esq.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      evx.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void E() {
      boolean $$0 = this.f.R();
      fjh $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new exq(x));
      } else {
         this.f.z();
      }

      eyp $$2 = new eyp();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new ema($$2));
      } else {
         this.f.a(new fbg($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(esf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.r() + this.B.l() - 17, this.B.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(esf $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private esq a(tm $$0, Supplier<eyk> $$1) {
      return esq.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private esq a(tm $$0, String $$1) {
      return this.a($$0, () -> new exc($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
