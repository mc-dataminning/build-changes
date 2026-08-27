import java.util.function.Supplier;
import javax.annotation.Nullable;

public class ffg extends ffl {
   private static final aiy a = new aiy("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vq n = vq.c("menu.returnToGame");
   private static final vq o = vq.c("gui.advancements");
   private static final vq p = vq.c("gui.stats");
   private static final vq q = vq.c("menu.sendFeedback");
   private static final vq r = vq.c("menu.reportBugs");
   private static final vq t = vq.c("menu.options");
   private static final vq u = vq.c("menu.shareToLan");
   private static final vq v = vq.c("menu.playerReporting");
   private static final vq w = vq.c("menu.returnToMenu");
   private static final vq x = vq.c("menu.savingLevel");
   private static final vq y = vq.c("menu.game");
   private static final vq z = vq.c("menu.paused");
   private final boolean A;
   @Nullable
   private ezo B;

   public ffg(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean o() {
      return this.A;
   }

   @Override
   protected void aQ_() {
      if (this.A) {
         this.E();
      }

      this.c(new fav(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void E() {
      fcz $$0 = new fcz();
      $$0.c().a(4, 4, 4, 0);
      fcz.b $$1 = $$0.d(2);
      $$1.a(ezo.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fgb(this.f.s.cq.q())));
      $$1.a(this.a(p, () -> new ffu(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new ffc(this, this.f.m)));
      if (this.f.T() && !this.f.U().p()) {
         $$1.a(this.a(u, () -> new ffm(this)));
      } else {
         $$1.a(this.a(v, fjv::new));
      }

      vq $$2 = this.f.S() ? w : vp.p;
      this.B = $$1.a(ezo.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.aZ().a(this.f, this, this::H, true);
      }).a(204).a(), 2);
      $$0.a();
      fcy.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void H() {
      boolean $$0 = this.f.S();
      fqq $$1 = this.f.R();
      this.f.r.W();
      if ($$0) {
         this.f.b(new fer(x));
      } else {
         this.f.z();
      }

      ffq $$2 = new ffq();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new ess($$2));
      } else {
         this.f.a(new fij($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aZ().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(ezb $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private ezo a(vq $$0, Supplier<ffl> $$1) {
      return ezo.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private ezo a(vq $$0, String $$1) {
      return ezo.a($$0, fed.b(this, $$1)).a(98).a();
   }
}
