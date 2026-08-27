import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dkm extends djl implements bmc, eqg.a {
   private static final int c = 20;
   private cpq d = cpq.h;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dkm(ib $$0, dme $$1) {
      super(djn.e, $$0, $$1);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cpq.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.f().b()) {
         $$0.a("RecordItem", this.f().b(new sy()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean j() {
      return !this.f().b() && this.h;
   }

   private void a(@Nullable bof $$0, boolean $$1) {
      if (this.o.a_(this.aD_()) == this.n()) {
         this.o.a(this.aD_(), this.n().a(ddh.b, Boolean.valueOf($$1)), 2);
         this.o.a(dqr.c, this.aD_(), dqr.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aD_(), this.n().b());
      this.o.a(null, 1010, this.aD_(), cpl.a(this.f().d()));
      this.e();
   }

   private void s() {
      this.h = false;
      this.o.a(dqr.F, this.aD_(), dqr.a.a(this.n()));
      this.o.a(this.aD_(), this.n().b());
      this.o.c(1011, this.aD_(), 0);
      this.e();
   }

   private void b(cwe $$0, ib $$1, dme $$2) {
      this.e++;
      if (this.j() && this.f().d() instanceof cqi $$3) {
         if (this.a($$3)) {
            this.s();
         } else if (this.u()) {
            this.e = 0;
            $$0.a(dqr.E, $$1, dqr.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cqi $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean u() {
      return this.e >= 20;
   }

   @Override
   public cpq f() {
      return this.d;
   }

   @Override
   public cpq c(int $$0) {
      cpq $$1 = this.d;
      this.d = cpq.h;
      if (!$$1.b()) {
         this.a(null, false);
         this.s();
      }

      return $$1;
   }

   @Override
   public void a(cpq $$0) {
      if ($$0.a(aum.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int al_() {
      return 1;
   }

   @Override
   public djl t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cpq $$1) {
      return $$1.a(aum.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bme $$0, int $$1, cpq $$2) {
      return $$0.a_(cpq::b);
   }

   private void a(cwe $$0, ib $$1) {
      if ($$0 instanceof apa $$2) {
         eov $$3 = eov.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(kb.X, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.o != null && !this.o.B) {
         ib $$0 = this.aD_();
         cpq $$1 = this.f();
         if (!$$1.b()) {
            this.h();
            eov $$2 = eov.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cpq $$3 = $$1.q();
            cel $$4 = new cel(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.o.b($$4);
         }
      }
   }

   public static void a(cwe $$0, ib $$1, dme $$2, dkm $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(cpq $$0) {
      this.d = $$0;
      this.o.a(this.aD_(), this.n().b());
      this.e();
   }
}
