import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class csy extends ctd implements cta {
   private static final aku<dak> a = aky.a(csy.class, akw.h);
   private static final aku<OptionalInt> b = aky.a(csy.class, akw.v);
   private static final aku<Boolean> c = aky.a(csy.class, akw.k);
   private static final int d = 0;
   private static final int e = 0;
   private static final boolean f = false;
   private int g = 0;
   private int h = 0;
   @Nullable
   private byf i;

   public csy(bxn<? extends csy> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public csy(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.aa, $$0);
      this.g = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dcz $$6 = $$4.a(kl.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.h = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public csy(dkj $$0, @Nullable bxe $$1, double $$2, double $$3, double $$4, dak $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public csy(dkj $$0, dak $$1, byf $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ao()));
      this.i = $$2;
   }

   public csy(dkj $$0, dak $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public csy(dkj $$0, dak $$1, bxe $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(aky.a $$0) {
      $$0.a(a, n());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.l();
   }

   @Override
   public boolean j(double $$0, double $$1, double $$2) {
      return super.j($$0, $$1, $$2) && !this.l();
   }

   @Override
   public void g() {
      super.g();
      fga $$6;
      if (this.l()) {
         if (this.i == null) {
            this.al.a(b).ifPresent($$0x -> {
               bxe $$1x = this.dV().a($$0x);
               if ($$1x instanceof byf) {
                  this.i = (byf)$$1x;
               }
            });
         }

         if (this.i != null) {
            fgc $$4;
            if (this.i.fJ()) {
               fgc $$0 = this.i.bS();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fgc $$3 = this.i.dy();
               this.i.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.i.a(dao.vE);
            } else {
               $$4 = fgc.c;
            }

            this.a_(this.i.dA() + $$4.d, this.i.dC() + $$4.e, this.i.dG() + $$4.f);
            this.i(this.i.dy());
         }

         $$6 = ctf.a(this, this::b);
      } else {
         if (!this.f()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fgc $$8 = this.dy();
         $$6 = ctf.a(this, this::b);
         this.a(byj.a, $$8);
         this.aI();
         this.i($$8);
      }

      if (!this.ad && this.bJ() && $$6.d() != fga.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.z();
      if (this.g == 0 && !this.ba()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awy.jt, awz.i, 3.0F, 1.0F);
      }

      this.g++;
      if (this.dV().C && this.g % 2 < 2) {
         this.dV().a(lz.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.g > this.h && this.dV() instanceof asb $$10) {
         this.b($$10);
      }
   }

   private void b(asb $$0) {
      $$0.a(this, (byte)17);
      this.a(egq.w, this.p());
      this.e($$0);
      this.aq();
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.dV() instanceof asb $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(ffy $$0) {
      iw $$1 = new iw($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this, bxx.a);
      if (this.dV() instanceof asb $$2 && this.i()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean i() {
      return !this.m().isEmpty();
   }

   private void e(asb $$0) {
      float $$1 = 0.0F;
      List<dcy> $$2 = this.m();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.i != null) {
            this.i.a($$0, this.dW().a(this, this.p()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fgc $$4 = this.dt();

         for (byf $$6 : this.dV().a(byf.class, this.cR().g(5.0))) {
            if ($$6 != this.i && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fgc $$9 = new fgc($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  fga $$10 = this.dV().a(new djq($$4, $$9, djq.a.a, djq.b.a, this));
                  if ($$10.d() == fga.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dW().a(this, this.p()), $$11);
               }
            }
         }
      }
   }

   private boolean l() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean f() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dV().C) {
         fgc $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.m());
      }

      super.b($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Life", this.g);
      $$0.a("LifeTime", this.h);
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("FireworksItem", dak.b, $$1, this.e());
      $$0.a("ShotAtAngle", this.al.a(c).booleanValue());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.g = $$0.b("Life", 0);
      this.h = $$0.b("LifeTime", 0);
      alp<va> $$1 = this.dX().a(uo.a);
      this.al.a(a, $$0.<dak>a("FireworksItem", dak.b, $$1).orElse(n()));
      this.al.a(c, $$0.b("ShotAtAngle", false));
   }

   private List<dcy> m() {
      dak $$0 = this.al.a(a);
      dcz $$1 = $$0.a(kl.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public dak e() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static dak n() {
      return new dak(dao.vE);
   }

   @Override
   public DoubleDoubleImmutablePair a_(byf $$0, bvt $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
