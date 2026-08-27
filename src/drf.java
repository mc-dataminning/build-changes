import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class drf extends dqc implements bpr, eyf.a {
   private static final int b = 20;
   private cuh c = cuh.i;
   private int d;
   private long e;
   private long f;
   private boolean g;

   public drf(ir $$0, dtc $$1) {
      super(dqe.f, $$0, $$1);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.c = cuh.a($$1, (vh)$$0.p("RecordItem")).orElse(cuh.i);
      } else {
         this.c = cuh.i;
      }

      this.g = $$0.q("IsPlaying");
      this.f = $$0.i("RecordStartTick");
      this.e = $$0.i("TickCount");
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      if (!this.f().d()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.g);
      $$0.a("RecordStartTick", this.f);
      $$0.a("TickCount", this.e);
   }

   public boolean j() {
      return !this.f().d() && this.g;
   }

   private void a(@Nullable brv $$0, boolean $$1) {
      if (this.n.a_(this.az_()) == this.n()) {
         this.n.a(this.az_(), this.n().a(djj.b, Boolean.valueOf($$1)), 2);
         this.n.a(dxv.c, this.az_(), dxv.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.f = this.e;
      this.g = true;
      this.n.a(this.az_(), this.n().b());
      this.n.a(null, 1010, this.az_(), cuc.a(this.f().f()));
      this.e();
   }

   private void t() {
      this.g = false;
      this.n.a(dxv.F, this.az_(), dxv.a.a(this.n()));
      this.n.a(this.az_(), this.n().b());
      this.n.c(1011, this.az_(), 0);
      this.e();
   }

   private void b(dca $$0, ir $$1, dtc $$2) {
      this.d++;
      if (this.j() && this.f().f() instanceof cvk $$3) {
         if (this.a($$3)) {
            this.t();
         } else if (this.v()) {
            this.d = 0;
            $$0.a(dxv.E, $$1, dxv.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.e++;
   }

   private boolean a(cvk $$0) {
      return this.e >= this.f + (long)$$0.j() + 20L;
   }

   private boolean v() {
      return this.d >= 20;
   }

   @Override
   public cuh f() {
      return this.c;
   }

   @Override
   public cuh c(int $$0) {
      cuh $$1 = this.c;
      this.c = cuh.i;
      if (!$$1.d()) {
         this.a(null, false);
         this.t();
      }

      return $$1;
   }

   @Override
   public void b(cuh $$0) {
      if ($$0.a(awm.aS) && this.n != null) {
         this.c = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.d()) {
         this.c(1);
      }
   }

   @Override
   public int ai_() {
      return 1;
   }

   @Override
   public dqc u() {
      return this;
   }

   @Override
   public boolean b(int $$0, cuh $$1) {
      return $$1.a(awm.aS) && this.a($$0).d();
   }

   @Override
   public boolean a(bpt $$0, int $$1, cuh $$2) {
      return $$0.b(cuh::d);
   }

   private void a(dca $$0, ir $$1) {
      if ($$0 instanceof aqt $$2) {
         ewu $$3 = ewu.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.F_().a(4) / 24.0F;
         $$2.a(lb.Y, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.n != null && !this.n.C) {
         ir $$0 = this.az_();
         cuh $$1 = this.f();
         if (!$$1.d()) {
            this.h();
            ewu $$2 = ewu.a($$0, 0.5, 1.01, 0.5).a(this.n.A, 0.7F);
            cuh $$3 = $$1.r();
            cig $$4 = new cig(this.n, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.u();
            this.n.b($$4);
         }
      }
   }

   public static void a(dca $$0, ir $$1, dtc $$2, drf $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void c(cuh $$0) {
      this.c = $$0;
      this.n.a(this.az_(), this.n().b());
      this.e();
   }
}
