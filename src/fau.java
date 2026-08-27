import java.util.function.Supplier;
import javax.annotation.Nullable;

public class fau extends faz {
   private static final agm a = new agm("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final uv n = uv.c("menu.returnToGame");
   private static final uv o = uv.c("gui.advancements");
   private static final uv p = uv.c("gui.stats");
   private static final uv q = uv.c("menu.sendFeedback");
   private static final uv r = uv.c("menu.reportBugs");
   private static final uv t = uv.c("menu.options");
   private static final uv u = uv.c("menu.shareToLan");
   private static final uv v = uv.c("menu.playerReporting");
   private static final uv w = uv.c("menu.returnToMenu");
   private static final uv x = uv.c("menu.savingLevel");
   private static final uv y = uv.c("menu.game");
   private static final uv z = uv.c("menu.paused");
   private final boolean A;
   @Nullable
   private eve B;

   public fau(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aQ_() {
      if (this.A) {
         this.C();
      }

      this.d(new ewl(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      eyn $$0 = new eyn();
      $$0.c().a(4, 4, 4, 0);
      eyn.b $$1 = $$0.d(2);
      $$1.a(eve.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new fbp(this.f.s.cn.r())));
      $$1.a(this.a(p, () -> new fbi(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(r, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new faq(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new fba(this)));
      } else {
         $$1.a(this.a(v, ffj::new));
      }

      uv $$2 = this.f.Q() ? w : uu.p;
      this.B = $$1.a(eve.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aW().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      eym.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.Q();
      flz $$1 = this.f.P();
      this.f.r.V();
      if ($$0) {
         this.f.b(new faf(x));
      } else {
         this.f.y();
      }

      fbe $$2 = new fbe();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new eom($$2));
      } else {
         this.f.a(new fdx($$2));
      }
   }

   @Override
   public void d() {
      super.d();
   }

   @Override
   public void a(eut $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(eut $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private eve a(uv $$0, Supplier<faz> $$1) {
      return eve.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private eve a(uv $$0, String $$1) {
      return eve.a($$0, ezr.b(this, $$1)).a(98).a();
   }
}
