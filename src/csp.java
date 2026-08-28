import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class csp extends csu implements csr {
   private static final akn<daa> a = akr.a(csp.class, akp.h);
   private static final akn<OptionalInt> b = akr.a(csp.class, akp.v);
   private static final akn<Boolean> c = akr.a(csp.class, akp.k);
   private static final int d = 0;
   private static final int e = 0;
   private static final boolean f = false;
   private int g = 0;
   private int h = 0;
   @Nullable
   private bxw i;

   public csp(bxe<? extends csp> $$0, djz $$1) {
      super($$0, $$1);
   }

   public csp(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.aa, $$0);
      this.g = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dcp $$6 = $$4.a(kl.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.h = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public csp(djz $$0, @Nullable bwv $$1, double $$2, double $$3, double $$4, daa $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public csp(djz $$0, daa $$1, bxw $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ao()));
      this.i = $$2;
   }

   public csp(djz $$0, daa $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public csp(djz $$0, daa $$1, bwv $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(a, o());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.m();
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return super.j($$0, $$1, $$2) && !this.m();
   }

   @Override
   public void h() {
      super.h();
      ffq $$6;
      if (this.m()) {
         if (this.i == null) {
            this.al.a(b).ifPresent($$0x -> {
               bwv $$1x = this.dV().a($$0x);
               if ($$1x instanceof bxw) {
                  this.i = (bxw)$$1x;
               }
            });
         }

         if (this.i != null) {
            ffs $$4;
            if (this.i.fJ()) {
               ffs $$0 = this.i.bS();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ffs $$3 = this.i.dy();
               this.i.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.i.a(dae.vE);
            } else {
               $$4 = ffs.c;
            }

            this.a_(this.i.dA() + $$4.d, this.i.dC() + $$4.e, this.i.dG() + $$4.f);
            this.i(this.i.dy());
         }

         $$6 = csw.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         ffs $$8 = this.dy();
         $$6 = csw.a(this, this::b);
         this.a(bya.a, $$8);
         this.aI();
         this.i($$8);
      }

      if (!this.ad && this.bJ() && $$6.d() != ffq.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.g == 0 && !this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awr.jt, aws.i, 3.0F, 1.0F);
      }

      this.g++;
      if (this.dV().C && this.g % 2 < 2) {
         this.dV().a(lz.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.g > this.h && this.dV() instanceof aru $$10) {
         this.b($$10);
      }
   }

   private void b(aru $$0) {
      $$0.a(this, (byte)17);
      this.a(egg.w, this.q());
      this.e($$0);
      this.aq();
   }

   @Override
   protected void a(ffp $$0) {
      super.a($$0);
      if (this.dV() instanceof aru $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(ffo $$0) {
      iw $$1 = new iw($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this, bxo.a);
      if (this.dV() instanceof aru $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(aru $$0) {
      float $$1 = 0.0F;
      List<dco> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.i != null) {
            this.i.a($$0, this.dW().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         ffs $$4 = this.dt();

         for (bxw $$6 : this.dV().a(bxw.class, this.cR().g(5.0))) {
            if ($$6 != this.i && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  ffs $$9 = new ffs($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  ffq $$10 = this.dV().a(new djg($$4, $$9, djg.a.a, djg.b.a, this));
                  if ($$10.d() == ffq.a.a) {
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
         ffs $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Life", this.g);
      $$0.a("LifeTime", this.h);
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("FireworksItem", daa.b, $$1, this.f());
      $$0.a("ShotAtAngle", this.al.a(c).booleanValue());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.g = $$0.b("Life", 0);
      this.h = $$0.b("LifeTime", 0);
      ali<va> $$1 = this.dX().a(uo.a);
      this.al.a(a, $$0.<daa>a("FireworksItem", daa.b, $$1).orElse(o()));
      this.al.a(c, $$0.b("ShotAtAngle", false));
   }

   private List<dco> n() {
      daa $$0 = this.al.a(a);
      dcp $$1 = $$0.a(kl.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public daa f() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static daa o() {
      return new daa(dae.vE);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxw $$0, bvk $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
