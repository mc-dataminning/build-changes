import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eya extends eyf {
   private static final aeu a = new aeu("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final ti n = ti.c("menu.returnToGame");
   private static final ti o = ti.c("gui.advancements");
   private static final ti p = ti.c("gui.stats");
   private static final ti q = ti.c("menu.sendFeedback");
   private static final ti s = ti.c("menu.reportBugs");
   private static final ti t = ti.c("menu.options");
   private static final ti u = ti.c("menu.shareToLan");
   private static final ti v = ti.c("menu.playerReporting");
   private static final ti w = ti.c("menu.returnToMenu");
   private static final ti x = ti.c("menu.savingLevel");
   private static final ti y = ti.c("menu.game");
   private static final ti z = ti.c("menu.paused");
   private final boolean A;
   @Nullable
   private esl B;

   public eya(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aD_() {
      if (this.A) {
         this.C();
      }

      this.d(new etr(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      evt $$0 = new evt();
      $$0.c().a(4, 4, 4, 0);
      evt.b $$1 = $$0.d(2);
      $$1.a(esl.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new eyu(this.f.s.cl.q())));
      $$1.a(this.a(p, () -> new eyn(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new exw(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eyg(this)));
      } else {
         $$1.a(this.a(v, fcn::new));
      }

      ti $$2 = this.f.R() ? w : th.p;
      this.B = $$1.a(esl.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      evs.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.R();
      fjc $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new exl(x));
      } else {
         this.f.z();
      }

      eyk $$2 = new eyk();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new elv($$2));
      } else {
         this.f.a(new fbb($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.r() + this.B.l() - 17, this.B.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private esl a(ti $$0, Supplier<eyf> $$1) {
      return esl.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private esl a(ti $$0, String $$1) {
      return this.a($$0, () -> new ewx($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
