import java.util.function.Supplier;
import javax.annotation.Nullable;

public class exq extends exv {
   private static final aep a = new aep("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final te n = te.c("menu.returnToGame");
   private static final te o = te.c("gui.advancements");
   private static final te p = te.c("gui.stats");
   private static final te q = te.c("menu.sendFeedback");
   private static final te s = te.c("menu.reportBugs");
   private static final te t = te.c("menu.options");
   private static final te u = te.c("menu.shareToLan");
   private static final te v = te.c("menu.playerReporting");
   private static final te w = te.c("menu.returnToMenu");
   private static final te x = te.c("menu.savingLevel");
   private static final te y = te.c("menu.game");
   private static final te z = te.c("menu.paused");
   private final boolean A;
   @Nullable
   private esi B;

   public exq(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   @Override
   protected void aE_() {
      if (this.A) {
         this.l();
      }

      this.d(new etn(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void l() {
      evj $$0 = new evj();
      $$0.c().a(4, 4, 4, 0);
      evj.b $$1 = $$0.d(2);
      $$1.a(esi.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new eyk(this.f.t.cl.q())));
      $$1.a(this.a(p, () -> new eyd(this, this.f.t.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new exm(this, this.f.m)));
      if (this.f.R() && !this.f.S().p()) {
         $$1.a(this.a(u, () -> new exw(this)));
      } else {
         $$1.a(this.a(v, fbz::new));
      }

      te $$2 = this.f.Q() ? w : td.p;
      this.B = $$1.a(esi.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aW().a(this.f, this, this::B, true);
      }).a(204).a(), 2);
      $$0.a();
      evi.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void B() {
      boolean $$0 = this.f.Q();
      fin $$1 = this.f.P();
      this.f.s.U();
      if ($$0) {
         this.f.b(new exb(x));
      } else {
         this.f.y();
      }

      eya $$2 = new eya();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new els($$2));
      } else {
         this.f.a(new far($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aW().c() && this.B != null) {
         $$0.a(a, this.B.p() + this.B.k() - 17, this.B.r() + 3, 15, 15);
      }
   }

   @Override
   public void b(erx $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private esi a(te $$0, Supplier<exv> $$1) {
      return esi.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private esi a(te $$0, String $$1) {
      return this.a($$0, () -> new ewn($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
