import java.util.function.Supplier;
import javax.annotation.Nullable;

public class eul extends euq {
   private static final int a = 2;
   private static final int b = 50;
   private static final int c = 4;
   private static final int k = 204;
   private static final int l = 98;
   private static final sw m = sw.c("menu.returnToGame");
   private static final sw n = sw.c("gui.advancements");
   private static final sw o = sw.c("gui.stats");
   private static final sw p = sw.c("menu.sendFeedback");
   private static final sw q = sw.c("menu.reportBugs");
   private static final sw r = sw.c("menu.options");
   private static final sw s = sw.c("menu.shareToLan");
   private static final sw t = sw.c("menu.playerReporting");
   private static final sw u = sw.c("menu.returnToMenu");
   private static final sw v = sw.c("menu.disconnect");
   private static final sw w = sw.c("menu.savingLevel");
   private static final sw x = sw.c("menu.game");
   private static final sw y = sw.c("menu.paused");
   private final boolean z;
   @Nullable
   private epi A;

   public eul(boolean $$0) {
      super($$0 ? x : y);
      this.z = $$0;
   }

   @Override
   protected void b() {
      if (this.z) {
         this.l();
      }

      this.d(new eqk(0, this.z ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void l() {
      esf $$0 = new esf();
      $$0.b().a(4, 4, 4, 0);
      esf.b $$1 = $$0.d(2);
      $$1.a(epi.a(m, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.a().c(50));
      $$1.a(this.a(n, () -> new evg(this.f.t.cl.l())));
      $$1.a(this.a(o, () -> new euz(this, this.f.t.v())));
      $$1.a(this.a(p, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(q, "https://aka.ms/snapshotbugs?ref=game")).r = !aa.b().d().a();
      $$1.a(this.a(r, () -> new euh(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(s, () -> new eur(this)));
      } else {
         $$1.a(this.a(t, eyu::new));
      }

      sw $$2 = this.f.Q() ? u : v;
      this.A = $$1.a(epi.a($$2, $$0x -> {
         $$0x.r = false;
         this.f.aW().a(this.f, this, this::B, true);
      }).a(204).a(), 2);
      $$0.c();
      ese.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void B() {
      boolean $$0 = this.f.Q();
      boolean $$1 = this.f.ar();
      this.f.s.U();
      if ($$0) {
         this.f.b(new etx(w));
      } else {
         this.f.y();
      }

      euw $$2 = new euw();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1) {
         this.f.a(new eiu($$2));
      } else {
         this.f.a(new exn($$2));
      }
   }

   @Override
   public void f() {
      super.f();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      if (this.z) {
         this.a($$0);
      }

      super.a($$0, $$1, $$2, $$3);
      if (this.z && this.f != null && this.f.aW().c() && this.A != null) {
         $$0.a(epf.m, this.A.p() + this.A.k() - 17, this.A.r() + 3, 182, 24, 15, 15);
      }
   }

   private epi a(sw $$0, Supplier<euq> $$1) {
      return epi.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private epi a(sw $$0, String $$1) {
      return this.a($$0, () -> new etj($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
