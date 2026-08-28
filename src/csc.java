import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class csc extends csh implements cse {
   private static final akj<czn> a = akn.a(csc.class, akl.h);
   private static final akj<OptionalInt> b = akn.a(csc.class, akl.v);
   private static final akj<Boolean> c = akn.a(csc.class, akl.k);
   private int d;
   private int e;
   @Nullable
   private bxj f;

   public csc(bwr<? extends csc> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csc(djm $$0, double $$1, double $$2, double $$3, czn $$4) {
      super(bwr.Z, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      dcc $$6 = $$4.a(kk.aj);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public csc(djm $$0, @Nullable bwi $$1, double $$2, double $$3, double $$4, czn $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public csc(djm $$0, czn $$1, bxj $$2) {
      this($$0, $$2, $$2.dz(), $$2.dB(), $$2.dF(), $$1);
      this.al.a(b, OptionalInt.of($$2.ao()));
      this.f = $$2;
   }

   public csc(djm $$0, czn $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public csc(djm $$0, czn $$1, bwi $$2, double $$3, double $$4, double $$5, boolean $$6) {
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
   public boolean j(double $$0, double $$1, double $$2) {
      return super.j($$0, $$1, $$2) && !this.m();
   }

   @Override
   public void h() {
      super.h();
      ffa $$6;
      if (this.m()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bwi $$1x = this.dU().a($$0x);
               if ($$1x instanceof bxj) {
                  this.f = (bxj)$$1x;
               }
            });
         }

         if (this.f != null) {
            ffc $$4;
            if (this.f.fI()) {
               ffc $$0 = this.f.bR();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ffc $$3 = this.f.dx();
               this.f.i($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(czr.vE);
            } else {
               $$4 = ffc.c;
            }

            this.a_(this.f.dz() + $$4.d, this.f.dB() + $$4.e, this.f.dF() + $$4.f);
            this.i(this.f.dx());
         }

         $$6 = csj.a(this, this::b);
      } else {
         if (!this.g()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.i(this.dx().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         ffc $$8 = this.dx();
         $$6 = csj.a(this, this::b);
         this.a(bxn.a, $$8);
         this.aI();
         this.i($$8);
      }

      if (!this.ad && this.bI() && $$6.d() != ffa.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.A();
      if (this.d == 0 && !this.aZ()) {
         this.dU().a(null, this.dz(), this.dB(), this.dF(), awn.jt, awo.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dU().C && this.d % 2 < 2) {
         this.dU().a(ly.D, this.dz(), this.dB(), this.dF(), this.ae.k() * 0.05, -this.dx().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dU() instanceof arq $$10) {
         this.b($$10);
      }
   }

   private void b(arq $$0) {
      $$0.a(this, (byte)17);
      this.a(eft.w, this.q());
      this.e($$0);
      this.aq();
   }

   @Override
   protected void a(fez $$0) {
      super.a($$0);
      if (this.dU() instanceof arq $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(fey $$0) {
      iv $$1 = new iv($$0.b());
      this.dU().a_($$1).a(this.dU(), $$1, this, bxb.a);
      if (this.dU() instanceof arq $$2 && this.j()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean j() {
      return !this.n().isEmpty();
   }

   private void e(arq $$0) {
      float $$1 = 0.0F;
      List<dcb> $$2 = this.n();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dV().a(this, this.q()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         ffc $$4 = this.ds();

         for (bxj $$6 : this.dU().a(bxj.class, this.cQ().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  ffc $$9 = new ffc($$6.dz(), $$6.e(0.5 * (double)$$8), $$6.dF());
                  ffa $$10 = this.dU().a(new dit($$4, $$9, dit.a.a, dit.b.a, this));
                  if ($$10.d() == ffa.a.a) {
                     $$7 = true;
                     break;
                  }
               }

               if ($$7) {
                  float $$11 = $$1 * (float)Math.sqrt((5.0 - (double)this.f($$6)) / 5.0);
                  $$6.a($$0, this.dV().a(this, this.q()), $$11);
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
      if ($$0 == 17 && this.dU().C) {
         ffc $$1 = this.dx();
         this.dU().a(this.dz(), this.dB(), this.dF(), $$1.d, $$1.e, $$1.f, this.n());
      }

      super.b($$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("FireworksItem", czn.b, $$1, this.f());
      $$0.a("ShotAtAngle", this.al.a(c).booleanValue());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.d = $$0.f("Life");
      this.e = $$0.f("LifeTime");
      ale<uw> $$1 = this.dW().a(un.a);
      this.al.a(a, $$0.<czn>a("FireworksItem", czn.b, $$1).orElse(o()));
      if ($$0.c("ShotAtAngle")) {
         this.al.a(c, $$0.o("ShotAtAngle"));
      }
   }

   private List<dcb> n() {
      czn $$0 = this.al.a(a);
      dcc $$1 = $$0.a(kk.aj);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public czn f() {
      return this.al.a(a);
   }

   @Override
   public boolean cA() {
      return false;
   }

   private static czn o() {
      return new czn(czr.vE);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bxj $$0, bux $$1) {
      double $$2 = $$0.ds().d - this.ds().d;
      double $$3 = $$0.ds().f - this.ds().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
