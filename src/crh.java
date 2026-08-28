import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class crh extends crm implements crj {
   private static final akh<cys> a = akl.a(crh.class, akj.h);
   private static final akh<OptionalInt> b = akl.a(crh.class, akj.v);
   private static final akh<Boolean> c = akl.a(crh.class, akj.k);
   private int d;
   private int e;
   @Nullable
   private bwz f;

   public crh(bwj<? extends crh> $$0, dip $$1) {
      super($$0, $$1);
   }

   public crh(dip $$0, double $$1, double $$2, double $$3, cys $$4) {
      super(bwj.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dbh $$6 = $$4.a(kj.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public crh(dip $$0, @Nullable bwa $$1, double $$2, double $$3, double $$4, cys $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public crh(dip $$0, cys $$1, bwz $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public crh(dip $$0, cys $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public crh(dip $$0, cys $$1, bwa $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akl.a $$0) {
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
      fdu $$6;
      if (this.m()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bwa $$1x = this.dV().a($$0x);
               if ($$1x instanceof bwz) {
                  this.f = (bwz)$$1x;
               }
            });
         }

         if (this.f != null) {
            fdw $$4;
            if (this.f.fI()) {
               fdw $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               fdw $$3 = this.f.dy();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cyw.vx);
            } else {
               $$4 = fdw.c;
            }

            this.a_(this.f.dA() + $$4.d, this.f.dC() + $$4.e, this.f.dG() + $$4.f);
            this.i(this.f.dy());
         }

         $$6 = cro.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         fdw $$8 = this.dy();
         $$6 = cro.a(this, this::b);
         this.a(bxd.a, $$8);
         this.aK();
         this.i($$8);
      }

      if (!this.ad && this.bK() && $$6.d() != fdu.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.d == 0 && !this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awl.jp, awm.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dV().C && this.d % 2 < 2) {
         this.dV().a(lx.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dV() instanceof aro $$10) {
         this.b($$10);
      }
   }

   private void b(aro $$0) {
      $$0.a(this, (byte)17);
      this.a(eeo.w, this.q());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(fdt $$0) {
      super.a($$0);
      if (this.dV() instanceof aro $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fds $$0) {
      iu $$1 = new iu($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this);
      if (this.dV() instanceof aro $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(aro $$0) {
      float $$1 = 0.0F;
      List<dbg> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dW().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         fdw $$4 = this.dt();

         for (bwz $$6 : this.dV().a(bwz.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  fdw $$9 = new fdw($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  fdu $$10 = this.dV().a(new dhy($$4, $$9, dhy.a.a, dhy.b.a, this));
                  if ($$10.d() == fdu.a.a) {
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
         fdw $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.ae_().a(this.dX()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cys.a(this.dX(), (uu)$$0.p("FireworksItem")).orElseGet(crh::o));
      } else {
         this.al.a(a, o());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<dbg> n() {
      cys $$0 = this.al.a(a);
      dbh $$1 = $$0.a(kj.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cys ae_() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cys o() {
      return new cys(cyw.vx);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bwz $$0, bup $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
