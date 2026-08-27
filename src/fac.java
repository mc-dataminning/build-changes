import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fac extends fah {
   private static final agg a = new agg("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final ur n = ur.c("menu.returnToGame");
   private static final ur o = ur.c("gui.advancements");
   private static final ur p = ur.c("gui.stats");
   private static final ur q = ur.c("menu.sendFeedback");
   private static final ur r = ur.c("menu.reportBugs");
   private static final ur t = ur.c("menu.options");
   private static final ur u = ur.c("menu.shareToLan");
   private static final ur v = ur.c("menu.playerReporting");
   private static final ur w = ur.c("menu.returnToMenu");
   private static final ur x = ur.c("menu.savingLevel");
   private static final ur y = ur.c("menu.game");
   private static final ur z = ur.c("menu.paused");
   private final boolean A;
   @Nullable
   private eum B;

   public fac(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aO_() {
      if (this.A) {
         this.C();
      }

      this.d(new evt(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      exv $$0 = new exv();
      $$0.c().a(4, 4, 4, 0);
      exv.b $$1 = $$0.d(2);
      $$1.a(eum.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fax(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new faq(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new ezy(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new fai(this)));
      } else {
         $$1.a(this.a(v, fer::new));
      }

      ur $$2 = this.f.Q() ? w : uq.p;
      this.B = $$1.a(eum.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aW().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      exu.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.Q();
      flh $$1 = this.f.P();
      this.f.r.U();
      if ($$0) {
         this.f.b(new ezn(x));
      } else {
         this.f.y();
      }

      fam $$2 = new fam();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new env($$2));
      } else {
         this.f.a(new fdf($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private eum a(ur $$0, Supplier<fah> $$1) {
      return eum.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private eum a(ur $$0, String $$1) {
      return eum.a($$0, eyz.b(this, $$1)).a(98).a();
   }
}
