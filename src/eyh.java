import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eyh extends eym {
   private static final aey a = new aey("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final tn n = tn.c("menu.returnToGame");
   private static final tn o = tn.c("gui.advancements");
   private static final tn p = tn.c("gui.stats");
   private static final tn q = tn.c("menu.sendFeedback");
   private static final tn s = tn.c("menu.reportBugs");
   private static final tn t = tn.c("menu.options");
   private static final tn u = tn.c("menu.shareToLan");
   private static final tn v = tn.c("menu.playerReporting");
   private static final tn w = tn.c("menu.returnToMenu");
   private static final tn x = tn.c("menu.savingLevel");
   private static final tn y = tn.c("menu.game");
   private static final tn z = tn.c("menu.paused");
   private final boolean A;
   @Nullable
   private ess B;

   public eyh(boolean $$0) {
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

      this.d(new ety(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void D() {
      ewa $$0 = new ewa();
      $$0.c().a(4, 4, 4, 0);
      ewa.b $$1 = $$0.d(2);
      $$1.a(ess.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new ezb(this.f.s.cn.q())));
      $$1.a(this.a(p, () -> new eyu(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new eyd(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eyn(this)));
      } else {
         $$1.a(this.a(v, fcu::new));
      }

      tn $$2 = this.f.R() ? w : tm.p;
      this.B = $$1.a(ess.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::E, true);
      }).a(204).a(), 2);
      $$0.a();
      evz.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void E() {
      boolean $$0 = this.f.R();
      fjj $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new exs(x));
      } else {
         this.f.z();
      }

      eyr $$2 = new eyr();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new emc($$2));
      } else {
         this.f.a(new fbi($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.r() + this.B.l() - 17, this.B.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ess a(tn $$0, Supplier<eym> $$1) {
      return ess.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private ess a(tn $$0, String $$1) {
      return this.a($$0, () -> new exe($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
