import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eya extends eye {
   private static final aez a = new aez("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final tl n = tl.c("menu.returnToGame");
   private static final tl o = tl.c("gui.advancements");
   private static final tl p = tl.c("gui.stats");
   private static final tl q = tl.c("menu.sendFeedback");
   private static final tl s = tl.c("menu.reportBugs");
   private static final tl t = tl.c("menu.options");
   private static final tl u = tl.c("menu.shareToLan");
   private static final tl v = tl.c("menu.playerReporting");
   private static final tl w = tl.c("menu.returnToMenu");
   private static final tl x = tl.c("menu.savingLevel");
   private static final tl y = tl.c("menu.game");
   private static final tl z = tl.c("menu.paused");
   private final boolean A;
   @Nullable
   private esk B;

   public eya(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aH_() {
      if (this.A) {
         this.D();
      }

      this.d(new etr(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void D() {
      evt $$0 = new evt();
      $$0.c().a(4, 4, 4, 0);
      evt.b $$1 = $$0.d(2);
      $$1.a(esk.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new eyu(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new eyn(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new exw(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eyf(this)));
      } else {
         $$1.a(this.a(v, fcn::new));
      }

      tl $$2 = this.f.R() ? w : tk.p;
      this.B = $$1.a(esk.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      evs.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void E() {
      boolean $$0 = this.f.R();
      fjd $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new exl(x));
      } else {
         this.f.z();
      }

      eyj $$2 = new eyj();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new elu($$2));
      } else {
         this.f.a(new fbb($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.r() + this.B.l() - 17, this.B.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(erz $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private esk a(tl $$0, Supplier<eye> $$1) {
      return esk.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private esk a(tl $$0, String $$1) {
      return this.a($$0, () -> new ewx($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
