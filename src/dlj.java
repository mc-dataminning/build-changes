import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dlj extends dki implements bmu, ere.a {
   private static final int c = 20;
   private cqm d = cqm.h;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dlj(ib $$0, dnb $$1) {
      super(dkk.e, $$0, $$1);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = cqm.a($$0.p("RecordItem"));
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.f().b()) {
         $$0.a("RecordItem", this.f().b(new ta()));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean j() {
      return !this.f().b() && this.h;
   }

   private void a(@Nullable box $$0, boolean $$1) {
      if (this.o.a_(this.aC_()) == this.n()) {
         this.o.a(this.aC_(), this.n().a(dee.b, Boolean.valueOf($$1)), 2);
         this.o.a(drp.c, this.aC_(), drp.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aC_(), this.n().b());
      this.o.a(null, 1010, this.aC_(), cqh.a(this.f().d()));
      this.e();
   }

   private void s() {
      this.h = false;
      this.o.a(drp.F, this.aC_(), drp.a.a(this.n()));
      this.o.a(this.aC_(), this.n().b());
      this.o.c(1011, this.aC_(), 0);
      this.e();
   }

   private void b(cxb $$0, ib $$1, dnb $$2) {
      this.e++;
      if (this.j() && this.f().d() instanceof cre $$3) {
         if (this.a($$3)) {
            this.s();
         } else if (this.u()) {
            this.e = 0;
            $$0.a(drp.E, $$1, drp.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(cre $$0) {
      return this.f >= this.g + (long)$$0.y() + 20L;
   }

   private boolean u() {
      return this.e >= 20;
   }

   @Override
   public cqm f() {
      return this.d;
   }

   @Override
   public cqm c(int $$0) {
      cqm $$1 = this.d;
      this.d = cqm.h;
      if (!$$1.b()) {
         this.a(null, false);
         this.s();
      }

      return $$1;
   }

   @Override
   public void a(cqm $$0) {
      if ($$0.a(auv.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.b()) {
         this.c(1);
      }
   }

   @Override
   public int ak_() {
      return 1;
   }

   @Override
   public dki t() {
      return this;
   }

   @Override
   public boolean b(int $$0, cqm $$1) {
      return $$1.a(auv.aq) && this.a($$0).b();
   }

   @Override
   public boolean a(bmw $$0, int $$1, cqm $$2) {
      return $$0.a_(cqm::b);
   }

   private void a(cxb $$0, ib $$1) {
      if ($$0 instanceof apf $$2) {
         ept $$3 = ept.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(kc.Y, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.o != null && !this.o.B) {
         ib $$0 = this.aC_();
         cqm $$1 = this.f();
         if (!$$1.b()) {
            this.h();
            ept $$2 = ept.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            cqm $$3 = $$1.q();
            cfe $$4 = new cfe(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.s();
            this.o.b($$4);
         }
      }
   }

   public static void a(cxb $$0, ib $$1, dnb $$2, dlj $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(cqm $$0) {
      this.d = $$0;
      this.o.a(this.aC_(), this.n().b());
      this.e();
   }
}
