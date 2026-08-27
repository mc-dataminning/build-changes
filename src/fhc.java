import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fhc extends fhh {
   private static final ajh a = new ajh("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final vu n = vu.c("menu.returnToGame");
   private static final vu o = vu.c("gui.advancements");
   private static final vu p = vu.c("gui.stats");
   private static final vu q = vu.c("menu.sendFeedback");
   private static final vu r = vu.c("menu.reportBugs");
   private static final vu t = vu.c("menu.options");
   private static final vu u = vu.c("menu.shareToLan");
   private static final vu v = vu.c("menu.playerReporting");
   private static final vu w = vu.c("menu.returnToMenu");
   private static final vu x = vu.c("menu.savingLevel");
   private static final vu y = vu.c("menu.game");
   private static final vu z = vu.c("menu.paused");
   private final boolean A;
   @Nullable
   private fbi B;

   public fhc(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean o() {
      return this.A;
   }

   @Override
   protected void aO_() {
      if (this.A) {
         this.E();
      }

      this.c(new fcp(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void E() {
      feu $$0 = new feu();
      $$0.c().a(4, 4, 4, 0);
      feu.b $$1 = $$0.d(2);
      $$1.a(fbi.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fhx(this.f.s.cu.q())));
      $$1.a(this.a(p, () -> new fhq(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).j = !aa.b().d().a();
      $$1.a(this.a(t, () -> new fgy(this, this.f.m)));
      if (this.f.U() && !this.f.V().r()) {
         $$1.a(this.a(u, () -> new fhi(this)));
      } else {
         $$1.a(this.a(v, flr::new));
      }

      vu $$2 = this.f.T() ? w : vt.p;
      this.B = $$1.a(fbi.a($$2, $$0x -> {
         $$0x.j = false;
         this.f.ba().a(this.f, this, this::H, true);
      }).a(204).a(), 2);
      $$0.a();
      fet.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::c);
   }

   private void H() {
      boolean $$0 = this.f.T();
      fso $$1 = this.f.S();
      this.f.r.W();
      if ($$0) {
         this.f.b(new fgn(x));
      } else {
         this.f.y();
      }

      fhm $$2 = new fhm();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eum($$2));
      } else {
         this.f.a(new fkf($$2));
      }
   }

   @Override
   public void e() {
      super.e();
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.ba().c() && this.B != null) {
         $$0.a(a, this.B.B() + this.B.w() - 17, this.B.C() + 3, 15, 15);
      }
   }

   @Override
   public void b(fav $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private fbi a(vu $$0, Supplier<fhh> $$1) {
      return fbi.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private fbi a(vu $$0, String $$1) {
      return fbi.a($$0, ffy.b(this, $$1)).a(98).a();
   }
}
