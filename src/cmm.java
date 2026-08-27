import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cmm extends cms implements cmo {
   private static final ajy<cuh> b = akc.a(cmm.class, aka.h);
   private static final ajy<OptionalInt> c = akc.a(cmm.class, aka.v);
   private static final ajy<Boolean> d = akc.a(cmm.class, aka.k);
   private int e;
   private int g;
   @Nullable
   private bso h;

   public cmm(bsb<? extends cmm> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cmm(dca $$0, double $$1, double $$2, double $$3, cuh $$4) {
      super(bsb.R, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.as.a(b, $$4.r());
      int $$5 = 1;
      cxk $$6 = $$4.a(ke.T);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.al.a(0.0, 0.002297), 0.05, this.al.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.al.a(6) + this.al.a(7);
   }

   public cmm(dca $$0, @Nullable brv $$1, double $$2, double $$3, double $$4, cuh $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cmm(dca $$0, cuh $$1, bso $$2) {
      this($$0, $$2, $$2.dz(), $$2.dB(), $$2.dF(), $$1);
      this.as.a(c, OptionalInt.of($$2.al()));
      this.h = $$2;
   }

   public cmm(dca $$0, cuh $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.as.a(d, $$5);
   }

   public cmm(dca $$0, cuh $$1, brv $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, A());
      $$0.a(c, OptionalInt.empty());
      $$0.a(d, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.y();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.y();
   }

   @Override
   public void l() {
      super.l();
      if (this.y()) {
         if (this.h == null) {
            this.as.a(c).ifPresent($$0x -> {
               brv $$1x = this.dU().a($$0x);
               if ($$1x instanceof bso) {
                  this.h = (bso)$$1x;
               }
            });
         }

         if (this.h != null) {
            ewu $$4;
            if (this.h.fN()) {
               ewu $$0 = this.h.bQ();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ewu $$3 = this.h.dx();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(cuk.wf);
            } else {
               $$4 = ewu.b;
            }

            this.a_(this.h.dz() + $$4.c, this.h.dB() + $$4.d, this.h.dF() + $$4.e);
            this.g(this.h.dx());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.R ? 1.0 : 1.15;
            this.g(this.dx().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ewu $$7 = this.dx();
         this.a(bst.a, $$7);
         this.g($$7);
      }

      ews $$8 = cmu.a(this, this::b);
      if (!this.ah) {
         this.a($$8);
         this.az = true;
      }

      this.J();
      if (this.e == 0 && !this.ba()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), avo.jc, avq.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dU().C && this.e % 2 < 2) {
         this.dU().a(lb.C, this.dz(), this.dB(), this.dF(), this.al.k() * 0.05, -this.dx().d * 0.5, this.al.k() * 0.05);
      }

      if (!this.dU().C && this.e > this.g) {
         this.u();
      }
   }

   private void u() {
      this.dU().a(this, (byte)17);
      this.a(dxv.w, this.t());
      this.x();
      this.ao();
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      if (!this.dU().C) {
         this.u();
      }
   }

   @Override
   protected void a(ewq $$0) {
      ir $$1 = new ir($$0.a());
      this.dU().a_($$1).a(this.dU(), $$1, this);
      if (!this.dU().x_() && this.w()) {
         this.u();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cxj> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dX().a(this, this.t()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         ewu $$3 = this.ds();

         for (bso $$5 : this.dU().a(bso.class, this.cP().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  ewu $$8 = new ewu($$5.dz(), $$5.e(0.5 * (double)$$7), $$5.dF());
                  ews $$9 = this.dU().a(new dbj($$3, $$8, dbj.a.a, dbj.b.a, this));
                  if ($$9.c() == ews.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dX().a(this, this.t()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.as.a(c).isPresent();
   }

   @Override
   public boolean r() {
      return this.as.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dU().C) {
         ewu $$1 = this.dx();
         this.dU().a(this.dz(), this.dB(), this.dF(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dY()));
      $$0.a("ShotAtAngle", this.as.a(d));
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.as.a(b, cuh.a(this.dY(), (vh)$$0.p("FireworksItem")).orElseGet(cmm::A));
      } else {
         this.as.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.as.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cxj> z() {
      cuh $$0 = this.as.a(b);
      cxk $$1 = $$0.a(ke.T);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cuh p() {
      return this.as.a(b);
   }

   @Override
   public boolean cy() {
      return false;
   }

   private static cuh A() {
      return new cuh(cuk.wf);
   }
}
