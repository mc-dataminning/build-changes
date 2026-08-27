import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fap extends fau {
   private static final agi a = new agi("icon/draft_report");
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
   private euz B;

   public fap(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aP_() {
      if (this.A) {
         this.C();
      }

      this.d(new ewg(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      eyi $$0 = new eyi();
      $$0.c().a(4, 4, 4, 0);
      eyi.b $$1 = $$0.d(2);
      $$1.a(euz.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fbk(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new fbd(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fal(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new fav(this)));
      } else {
         $$1.a(this.a(v, ffe::new));
      }

      ur $$2 = this.f.Q() ? w : uq.p;
      this.B = $$1.a(euz.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aW().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      eyh.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.Q();
      flu $$1 = this.f.P();
      this.f.r.V();
      if ($$0) {
         this.f.b(new faa(x));
      } else {
         this.f.y();
      }

      faz $$2 = new faz();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eoh($$2));
      } else {
         this.f.a(new fds($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private euz a(ur $$0, Supplier<fau> $$1) {
      return euz.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private euz a(ur $$0, String $$1) {
      return euz.a($$0, ezm.b(this, $$1)).a(98).a();
   }
}
