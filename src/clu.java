import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class clu extends clz implements clw {
   private static final ajm<csz> b = ajq.a(clu.class, ajo.h);
   private static final ajm<OptionalInt> c = ajq.a(clu.class, ajo.v);
   private static final ajm<Boolean> d = ajq.a(clu.class, ajo.k);
   private int e;
   private int g;
   @Nullable
   private bsa h;

   public clu(brn<? extends clu> $$0, dad $$1) {
      super($$0, $$1);
   }

   public clu(dad $$0, double $$1, double $$2, double $$3, csz $$4) {
      super(brn.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.r());
      int $$5 = 1;
      cvr $$6 = $$4.a(ka.R);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.g = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public clu(dad $$0, @Nullable brh $$1, double $$2, double $$3, double $$4, csz $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public clu(dad $$0, csz $$1, bsa $$2) {
      this($$0, $$2, $$2.ds(), $$2.du(), $$2.dy(), $$1);
      this.ao.a(c, OptionalInt.of($$2.aj()));
      this.h = $$2;
   }

   public clu(dad $$0, csz $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public clu(dad $$0, csz $$1, brh $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajq.a $$0) {
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
            this.ao.a(c).ifPresent($$0x -> {
               brh $$1x = this.dN().a($$0x);
               if ($$1x instanceof bsa) {
                  this.h = (bsa)$$1x;
               }
            });
         }

         if (this.h != null) {
            etp $$4;
            if (this.h.fC()) {
               etp $$0 = this.h.bJ();
               double $$1 = 1.5;
               double $$2 = 0.1;
               etp $$3 = this.h.dq();
               this.h.g($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.h.a(ctc.uu);
            } else {
               $$4 = etp.b;
            }

            this.a_(this.h.ds() + $$4.c, this.h.du() + $$4.d, this.h.dy() + $$4.e);
            this.g(this.h.dq());
         }
      } else {
         if (!this.r()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.g(this.dq().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         etp $$7 = this.dq();
         this.a(bsf.a, $$7);
         this.g($$7);
      }

      etn $$8 = cmb.a(this, this::b);
      if (!this.ag) {
         this.a($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), avc.iK, avd.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dN().B && this.e % 2 < 2) {
         this.dN().a(kx.C, this.ds(), this.du(), this.dy(), this.ah.k() * 0.05, -this.dq().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dN().B && this.e > this.g) {
         this.v();
      }
   }

   private void v() {
      this.dN().a(this, (byte)17);
      this.a(dva.w, this.u());
      this.x();
      this.am();
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.v();
      }
   }

   @Override
   protected void a(etl $$0) {
      in $$1 = new in($$0.a());
      this.dN().a_($$1).a(this.dN(), $$1, this);
      if (!this.dN().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cvq> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.h != null) {
            this.h.a(this.dO().a(this, this.u()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         etp $$3 = this.dl();

         for (bsa $$5 : this.dN().a(bsa.class, this.cI().g(5.0))) {
            if ($$5 != this.h && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  etp $$8 = new etp($$5.ds(), $$5.e(0.5 * (double)$$7), $$5.dy());
                  etn $$9 = this.dN().a(new czm($$3, $$8, czm.a.a, czm.b.a, this));
                  if ($$9.c() == etn.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dO().a(this, this.u()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean r() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dN().B) {
         etp $$1 = this.dq();
         this.dN().a(this.ds(), this.du(), this.dy(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.g);
      $$0.a("FireworksItem", this.p().a(this.dP()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.g = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, csz.a(this.dP(), (ux)$$0.p("FireworksItem")).orElseGet(clu::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cvq> z() {
      csz $$0 = this.ao.a(b);
      cvr $$1 = $$0.a(ka.R);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public csz p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cr() {
      return false;
   }

   private static csz A() {
      return new csz(ctc.uu);
   }
}
