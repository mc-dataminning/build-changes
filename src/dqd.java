import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dqd extends dpc implements bqg, ewx.a {
   private static final int b = 20;
   private cuk c = cuk.l;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public dqd(iz $$0, drx $$1) {
      super(dpe.e, $$0, $$1);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cuk.a($$1, (vo)$$0.p("RecordItem")).orElse(cuk.l);
      } else {
         this.c = cuk.l;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      if (!this.f().e()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.g);
      $$0.a("RecordStartTick", this.f);
      $$0.a("TickCount", this.e);
   }

   public boolean j() {
      return !this.f().e() && this.g;
   }

   private void a(@Nullable bsp $$0, boolean $$1) {
      if (this.n.a_(this.aA_()) == this.n()) {
         this.n.a(this.aA_(), this.n().a(dix.b, Boolean.valueOf($$1)), 2);
         this.n.a(dwq.c, this.aA_(), dwq.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.aA_(), this.n().b());
      this.n.a(null, 1010, this.aA_(), cuf.a(this.f().g()));
      this.e();
   }

   private void u() {
      this.g = false;
      this.n.a(dwq.F, this.aA_(), dwq.a.a(this.n()));
      this.n.a(this.aA_(), this.n().b());
      this.n.c(1011, this.aA_(), 0);
      this.e();
   }

   private void b(dbt $$0, iz $$1, drx $$2) {
      this.d++;
      if (this.j() && this.f().g() instanceof cvf $$3) {
         if (this.a($$3)) {
            this.u();
         } else if (this.w()) {
            this.d = 0;
            $$0.a(dwq.E, $$1, dwq.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvf $$0) {
      return this.e >= this.f + (long)$$0.m() + 20L;
   }

   private boolean w() {
      return this.d >= 20;
   }

   @Override
   public cuk f() {
      return this.c;
   }

   @Override
   public cuk c(int $$0) {
      cuk $$1 = this.c;
      this.c = cuk.l;
      if (!$$1.e()) {
         this.a(null, false);
         this.u();
      }

      return $$1;
   }

   @Override
   public void b(cuk $$0) {
      if ($$0.a(awu.aR) && this.n != null) {
         this.c = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.e()) {
         this.c(1);
      }
   }

   @Override
   public int ai_() {
      return 1;
   }

   @Override
   public dpc v() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuk $$1) {
      return $$1.a(awu.aR) && this.a($$0).e();
   }

   @Override
   public boolean a(bqi $$0, int $$1, cuk $$2) {
      return $$0.a_(cuk::e);
   }

   private void a(dbt $$0, iz $$1) {
      if ($$0 instanceof arb $$2) {
         evm $$3 = evm.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(lj.aa, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.B) {
         iz $$0 = this.aA_();
         cuk $$1 = this.f();
         if (!$$1.e()) {
            this.h();
            evm $$2 = evm.a($$0, 0.5, 1.01, 0.5).a(this.n.z, 0.7F);
            cuk $$3 = $$1.s();
            cjc $$4 = new cjc(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.n.b($$4);
         }
      }
   }

   public static void a(dbt $$0, iz $$1, drx $$2, dqd $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cuk $$0) {
      this.c = $$0;
      this.n.a(this.aA_(), this.n().b());
      this.e();
   }
}
