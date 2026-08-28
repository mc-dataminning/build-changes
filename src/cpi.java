import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cpi extends cpn implements cpk {
   private static final akm<cwm> a = akq.a(cpi.class, ako.h);
   private static final akm<OptionalInt> b = akq.a(cpi.class, ako.v);
   private static final akm<Boolean> c = akq.a(cpi.class, ako.k);
   private int d;
   private int e;
   @Nullable
   private bvh f;

   public cpi(bus<? extends cpi> $$0, dfm $$1) {
      super($$0, $$1);
   }

   public cpi(dfm $$0, double $$1, double $$2, double $$3, cwm $$4) {
      super(bus.Y, $$0);
      this.d = 0;
      this.a_($$1, $$2, $$3);
      this.al.a(a, $$4.v());
      int $$5 = 1;
      czc $$6 = $$4.a(ku.af);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ae.a(0.0, 0.002297), 0.05, this.ae.a(0.0, 0.002297));
      this.e = 10 * $$5 + this.ae.a(6) + this.ae.a(7);
   }

   public cpi(dfm $$0, @Nullable bul $$1, double $$2, double $$3, double $$4, cwm $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cpi(dfm $$0, cwm $$1, bvh $$2) {
      this($$0, $$2, $$2.dA(), $$2.dC(), $$2.dG(), $$1);
      this.al.a(b, OptionalInt.of($$2.ar()));
      this.f = $$2;
   }

   public cpi(dfm $$0, cwm $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.al.a(c, $$5);
   }

   public cpi(dfm $$0, cwm $$1, bul $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(a, t());
      $$0.a(b, OptionalInt.empty());
      $$0.a(c, false);
   }

   @Override
   public boolean a(double $$0) {
      return $$0 < 4096.0 && !this.q();
   }

   @Override
   public boolean k(double $$0, double $$1, double $$2) {
      return super.k($$0, $$1, $$2) && !this.q();
   }

   @Override
   public void h() {
      super.h();
      ezw $$6;
      if (this.q()) {
         if (this.f == null) {
            this.al.a(b).ifPresent($$0x -> {
               bul $$1x = this.dV().a($$0x);
               if ($$1x instanceof bvh) {
                  this.f = (bvh)$$1x;
               }
            });
         }

         if (this.f != null) {
            ezy $$4;
            if (this.f.fH()) {
               ezy $$0 = this.f.bT();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ezy $$3 = this.f.dy();
               this.f.h($$3.b($$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5, $$0.f * 0.1 + ($$0.f * 1.5 - $$3.f) * 0.5));
               $$4 = this.f.a(cwq.uM);
            } else {
               $$4 = ezy.c;
            }

            this.a_(this.f.dA() + $$4.d, this.f.dC() + $$4.e, this.f.dG() + $$4.f);
            this.h(this.f.dy());
         }

         $$6 = cpp.a(this, this::b);
      } else {
         if (!this.l()) {
            double $$7 = this.P ? 1.0 : 1.15;
            this.h(this.dy().d($$7, 1.0, $$7).b(0.0, 0.04, 0.0));
         }

         ezy $$8 = this.dy();
         $$6 = cpp.a(this, this::b);
         this.a(bvl.a, $$8);
         this.aK();
         this.h($$8);
      }

      if (!this.ad && this.bL() && $$6.d() != ezw.a.a) {
         this.b($$6);
         this.ar = true;
      }

      this.C();
      if (this.d == 0 && !this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.iQ, awo.i, 3.0F, 1.0F);
      }

      this.d++;
      if (this.dV().C && this.d % 2 < 2) {
         this.dV().a(ls.D, this.dA(), this.dC(), this.dG(), this.ae.k() * 0.05, -this.dy().e * 0.5, this.ae.k() * 0.05);
      }

      if (this.d > this.e && this.dV() instanceof arp $$10) {
         this.b($$10);
      }
   }

   private void b(arp $$0) {
      $$0.a(this, (byte)17);
      this.a(ear.w, this.p());
      this.e($$0);
      this.at();
   }

   @Override
   protected void a(ezv $$0) {
      super.a($$0);
      if (this.dV() instanceof arp $$1) {
         this.b($$1);
      }
   }

   @Override
   protected void a(ezu $$0) {
      jh $$1 = new jh($$0.b());
      this.dV().a_($$1).a(this.dV(), $$1, this);
      if (this.dV() instanceof arp $$2 && this.n()) {
         this.b($$2);
      }

      super.a($$0);
   }

   private boolean n() {
      return !this.s().isEmpty();
   }

   private void e(arp $$0) {
      float $$1 = 0.0F;
      List<czb> $$2 = this.s();
      if (!$$2.isEmpty()) {
         $$1 = 5.0F + (float)($$2.size() * 2);
      }

      if ($$1 > 0.0F) {
         if (this.f != null) {
            this.f.a($$0, this.dW().a(this, this.p()), 5.0F + (float)($$2.size() * 2));
         }

         double $$3 = 5.0;
         ezy $$4 = this.dt();

         for (bvh $$6 : this.dV().a(bvh.class, this.cR().g(5.0))) {
            if ($$6 != this.f && !(this.g($$6) > 25.0)) {
               boolean $$7 = false;

               for (int $$8 = 0; $$8 < 2; $$8++) {
                  ezy $$9 = new ezy($$6.dA(), $$6.e(0.5 * (double)$$8), $$6.dG());
                  ezw $$10 = this.dV().a(new deu($$4, $$9, deu.a.a, deu.b.a, this));
                  if ($$10.d() == ezw.a.a) {
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

   private boolean q() {
      return this.al.a(b).isPresent();
   }

   @Override
   public boolean l() {
      return this.al.a(c);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dV().C) {
         ezy $$1 = this.dy();
         this.dV().a(this.dA(), this.dC(), this.dG(), $$1.d, $$1.e, $$1.f, this.s());
      }

      super.b($$0);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Life", this.d);
      $$0.a("LifeTime", this.e);
      $$0.a("FireworksItem", this.j().a(this.dX()));
      $$0.a("ShotAtAngle", this.al.a(c));
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      this.d = $$0.h("Life");
      this.e = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.al.a(a, cwm.a(this.dX(), (vi)$$0.p("FireworksItem")).orElseGet(cpi::t));
      } else {
         this.al.a(a, t());
      }

      if ($$0.e("ShotAtAngle")) {
         this.al.a(c, $$0.q("ShotAtAngle"));
      }
   }

   private List<czb> s() {
      cwm $$0 = this.al.a(a);
      czc $$1 = $$0.a(ku.af);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cwm j() {
      return this.al.a(a);
   }

   @Override
   public boolean cB() {
      return false;
   }

   private static cwm t() {
      return new cwm(cwq.uM);
   }

   @Override
   public DoubleDoubleImmutablePair a_(bvh $$0, btb $$1) {
      double $$2 = $$0.dt().d - this.dt().d;
      double $$3 = $$0.dt().f - this.dt().f;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
