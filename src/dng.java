import com.google.common.annotations.VisibleForTesting;
import javax.annotation.Nullable;

public class dng extends dmf implements bnr, etl.a {
   private static final int c = 20;
   private crj d = crj.i;
   private int e;
   private long f;
   private long g;
   private boolean h;

   public dng(ib $$0, doz $$1) {
      super(dmh.e, $$0, $$1);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      if ($$0.b("RecordItem", 10)) {
         this.d = crj.a($$1, (uj)$$0.p("RecordItem")).orElse(crj.i);
      } else {
         this.d = crj.i;
      }

      this.h = $$0.q("IsPlaying");
      this.g = $$0.i("RecordStartTick");
      this.f = $$0.i("TickCount");
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      if (!this.f().d()) {
         $$0.a("RecordItem", this.f().a($$1));
      }

      $$0.a("IsPlaying", this.h);
      $$0.a("RecordStartTick", this.g);
      $$0.a("TickCount", this.f);
   }

   public boolean j() {
      return !this.f().d() && this.h;
   }

   private void a(@Nullable bpv $$0, boolean $$1) {
      if (this.o.a_(this.aA_()) == this.n()) {
         this.o.a(this.aA_(), this.n().a(dga.b, Boolean.valueOf($$1)), 2);
         this.o.a(dts.c, this.aA_(), dts.a.a($$0, this.n()));
      }
   }

   @VisibleForTesting
   public void k() {
      this.g = this.f;
      this.h = true;
      this.o.a(this.aA_(), this.n().b());
      this.o.a(null, 1010, this.aA_(), cre.a(this.f().f()));
      this.e();
   }

   private void t() {
      this.h = false;
      this.o.a(dts.F, this.aA_(), dts.a.a(this.n()));
      this.o.a(this.aA_(), this.n().b());
      this.o.c(1011, this.aA_(), 0);
      this.e();
   }

   private void b(cyx $$0, ib $$1, doz $$2) {
      this.e++;
      if (this.j() && this.f().f() instanceof csb $$3) {
         if (this.a($$3)) {
            this.t();
         } else if (this.v()) {
            this.e = 0;
            $$0.a(dts.E, $$1, dts.a.a($$2));
            this.a($$0, $$1);
         }
      }

      this.f++;
   }

   private boolean a(csb $$0) {
      return this.f >= this.g + (long)$$0.k() + 20L;
   }

   private boolean v() {
      return this.e >= 20;
   }

   @Override
   public crj f() {
      return this.d;
   }

   @Override
   public crj c(int $$0) {
      crj $$1 = this.d;
      this.d = crj.i;
      if (!$$1.d()) {
         this.a(null, false);
         this.t();
      }

      return $$1;
   }

   @Override
   public void a(crj $$0) {
      if ($$0.a(avk.aq) && this.o != null) {
         this.d = $$0;
         this.a(null, true);
         this.k();
      } else if ($$0.d()) {
         this.c(1);
      }
   }

   @Override
   public int aj_() {
      return 1;
   }

   @Override
   public dmf u() {
      return this;
   }

   @Override
   public boolean b(int $$0, crj $$1) {
      return $$1.a(avk.aq) && this.a($$0).d();
   }

   @Override
   public boolean a(bnt $$0, int $$1, crj $$2) {
      return $$0.a_(crj::d);
   }

   private void a(cyx $$0, ib $$1) {
      if ($$0 instanceof aps $$2) {
         esa $$3 = esa.c($$1).b(0.0, 1.2F, 0.0);
         float $$4 = (float)$$0.E_().a(4) / 24.0F;
         $$2.a(kl.Y, $$3.a(), $$3.b(), $$3.c(), 0, (double)$$4, 0.0, 0.0, 1.0);
      }
   }

   public void l() {
      if (this.o != null && !this.o.B) {
         ib $$0 = this.aA_();
         crj $$1 = this.f();
         if (!$$1.d()) {
            this.h();
            esa $$2 = esa.a($$0, 0.5, 1.01, 0.5).a(this.o.z, 0.7F);
            crj $$3 = $$1.r();
            cgd $$4 = new cgd(this.o, $$2.a(), $$2.b(), $$2.c(), $$3);
            $$4.v();
            this.o.b($$4);
         }
      }
   }

   public static void a(cyx $$0, ib $$1, doz $$2, dng $$3) {
      $$3.b($$0, $$1, $$2);
   }

   @VisibleForTesting
   public void b(crj $$0) {
      this.d = $$0;
      this.o.a(this.aA_(), this.n().b());
      this.e();
   }
}
