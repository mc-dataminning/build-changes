import java.util.function.Supplier;
import javax.annotation.Nullable;

public class exv extends eya {
   private static final aer a = new aer("icon/draft_report");
   private static final int b = 2;
   private static final int c = 50;
   private static final int k = 4;
   private static final int l = 204;
   private static final int m = 98;
   private static final tf n = tf.c("menu.returnToGame");
   private static final tf o = tf.c("gui.advancements");
   private static final tf p = tf.c("gui.stats");
   private static final tf q = tf.c("menu.sendFeedback");
   private static final tf s = tf.c("menu.reportBugs");
   private static final tf t = tf.c("menu.options");
   private static final tf u = tf.c("menu.shareToLan");
   private static final tf v = tf.c("menu.playerReporting");
   private static final tf w = tf.c("menu.returnToMenu");
   private static final tf x = tf.c("menu.savingLevel");
   private static final tf y = tf.c("menu.game");
   private static final tf z = tf.c("menu.paused");
   private final boolean A;
   @Nullable
   private esg B;

   public exv(boolean $$0) {
      super($$0 ? y : z);
      this.A = $$0;
   }

   public boolean l() {
      return this.A;
   }

   @Override
   protected void aC_() {
      if (this.A) {
         this.C();
      }

      this.d(new etm(0, this.A ? 40 : 10, this.g, 9, this.e, this.i));
   }

   private void C() {
      evo $$0 = new evo();
      $$0.c().a(4, 4, 4, 0);
      evo.b $$1 = $$0.d(2);
      $$1.a(esg.a(n, $$0x -> {
         this.f.a(null);
         this.f.n.i();
      }).a(204).a(), 2, $$0.b().c(50));
      $$1.a(this.a(o, () -> new eyp(this.f.s.cl.q())));
      $$1.a(this.a(p, () -> new eyi(this, this.f.s.j())));
      $$1.a(this.a(q, aa.b().g() ? "https://aka.ms/javafeedback?ref=game" : "https://aka.ms/snapshotfeedback?ref=game"));
      $$1.a(this.a(s, "https://aka.ms/snapshotbugs?ref=game")).i = !aa.b().d().a();
      $$1.a(this.a(t, () -> new exr(this, this.f.m)));
      if (this.f.S() && !this.f.T().p()) {
         $$1.a(this.a(u, () -> new eyb(this)));
      } else {
         $$1.a(this.a(v, fci::new));
      }

      tf $$2 = this.f.R() ? w : te.p;
      this.B = $$1.a(esg.a($$2, $$0x -> {
         $$0x.i = false;
         this.f.aX().a(this.f, this, this::D, true);
      }).a(204).a(), 2);
      $$0.a();
      evn.a($$0, 0, 0, this.g, this.h, 0.5F, 0.25F);
      $$0.a(this::d);
   }

   private void D() {
      boolean $$0 = this.f.R();
      fix $$1 = this.f.Q();
      this.f.r.U();
      if ($$0) {
         this.f.b(new exg(x));
      } else {
         this.f.z();
      }

      eyf $$2 = new eyf();
      if ($$0) {
         this.f.a($$2);
      } else if ($$1 != null && $$1.e()) {
         this.f.a(new elq($$2));
      } else {
         this.f.a(new faw($$2));
      }
   }

   @Override
   public void c() {
      super.c();
   }

   @Override
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if (this.A && this.f != null && this.f.aX().c() && this.B != null) {
         $$0.a(a, this.B.r() + this.B.l() - 17, this.B.t() + 3, 15, 15);
      }
   }

   @Override
   public void b(erv $$0, int $$1, int $$2, float $$3) {
      if (this.A) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   private esg a(tf $$0, Supplier<eya> $$1) {
      return esg.a($$0, $$1x -> this.f.a($$1.get())).a(98).a();
   }

   private esg a(tf $$0, String $$1) {
      return this.a($$0, () -> new ews($$1x -> {
            if ($$1x) {
               ac.i().a($$1);
            }

            this.f.a(this);
         }, $$1, true));
   }
}
