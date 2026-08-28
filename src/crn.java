import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class crn extends crs implements crp {
   private static final akj<cyy> a = akn.a(crn.class, akl.h);
   private static final akj<OptionalInt> b = akn.a(crn.class, akl.v);
   private static final akj<Boolean> c = akn.a(crn.class, akl.k);
   private int d;
   private int e;
   @Nullable
   private bxc f;

   public crn(bwm<? extends crn> $$0, div $$1) {
      super($$0, $$1);
   }

   public crn(div $$0, double $$1, double $$2, double $$3, cyy $$4) {
      super(bwm.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dbn $$6 = $$4.a(kj.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public crn(div $$0, @Nullable bwd $$1, double $$2, double $$3, double $$4, cyy $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public crn(div $$0, cyy $$1, bxc $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public crn(div $$0, cyy $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public crn(div $$0, cyy $$1, bwd $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akn.a $$0) {
      $$0.a(a, o());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.m();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.m();
   }

   @Override
   public void h() {
      super.h();
      feg $$6;
      if (this.m()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bwd $$1x = this.dV().a($$0x);
               if ($$1x instanceof bxc) {
                  this.f = (bxc)$$1x;
               }
            });
         }

         if (this.f != null) {
            fei $$4;
            if (this.f.fI()) {
               fei $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fei $$3 = this.f.dy();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(czc.vz);
            } else {
               $$4 = fei.c;
            }

            this.a_(this.f.dA() + $$4.d, this.f.dC() + $$4.e, this.f.dG() + $$4.f);
            this.i(this.f.dy());
         }

         $$6 = cru.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fei $$8 = this.dy();
         $$6 = cru.a(this, this::b);
         this.a(bxg.a, $$8);
         this.aK();
         this.i($$8);
      }

      if (!this.ad && this.bK() && $$6.d() != feg.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.d == 0 && !this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.jq, awo.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dV().C && this.d % 2 < 2) {
         this.dV().a(lx.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dV() instanceof arq $$10) {
         this.b($$10);
      }
   }

   private void b(arq $$0) {
      $$0.a(this, (byte)17);
      this.a(eez.w, this.q());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fef $$0) {
      super.a($$0);
      if (this.dV() instanceof arq $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fee $$0) {
      iu $$1 = new iu($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this);
      if (this.dV() instanceof arq $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(arq $$0) {
      float $$1 = 0.0F;
      List<dbm> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dW().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fei $$4 = this.dt();

         for (bxc $$6 : this.dV().a(bxc.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fei $$9 = new fei($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  feg $$10 = this.dV().a(new die($$4, $$9, die.a.a, die.b.a, this));
                  if ($$10.d() == feg.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dW().a(this, this.q()), $$11);
               }
            }
         }
      }
   }

   private boolean m() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean g() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dV().C) {
         fei $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.f().a(this.dX()));
      $$0.a("ShotAtAngle", this.al.a(c).booleanValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cyy.a(this.dX(), (uw)$$0.p("FireworksItem")).orElseGet(crn::o));
      } else {
         this.al.a(a, o());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<dbm> n() {
      cyy $$0 = this.al.a(a);
      dbn $$1 = $$0.a(kj.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cyy f() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cyy o() {
      return new cyy(czc.vz);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxc $$0, bus $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
