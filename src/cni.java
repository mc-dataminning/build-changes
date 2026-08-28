import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cni extends cnn implements cnk {
   private static final ajv<cuo> b = ajz.a(cni.class, ajx.h);
   private static final ajv<OptionalInt> c = ajz.a(cni.class, ajx.v);
   private static final ajv<Boolean> d = ajz.a(cni.class, ajx.k);
   private int e;
   private int f;
   @Nullable
   private btl g;

   public cni(bsw<? extends cni> $$0, dcu $$1) {
      super($$0, $$1);
   }

   public cni(dcu $$0, double $$1, double $$2, double $$3, cuo $$4) {
      super(bsw.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cxk $$6 = $$4.a(kq.V);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.n(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cni(dcu $$0, @Nullable bsq $$1, double $$2, double $$3, double $$4, cuo $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cni(dcu $$0, cuo $$1, btl $$2) {
      this($$0, $$2, $$2.dv(), $$2.dx(), $$2.dB(), $$1);
      this.ao.a(c, OptionalInt.of($$2.an()));
      this.g = $$2;
   }

   public cni(dcu $$0, cuo $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cni(dcu $$0, cuo $$1, bsq $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajz.a $$0) {
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
         if (this.g == null) {
            this.ao.a(c).ifPresent($$0x -> {
               bsq $$1x = this.dQ().a($$0x);
               if ($$1x instanceof btl) {
                  this.g = (btl)$$1x;
               }
            });
         }

         if (this.g != null) {
            eww $$4;
            if (this.g.fB()) {
               eww $$0 = this.g.bM();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eww $$3 = this.g.dt();
               this.g.i($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cur.uu);
            } else {
               $$4 = eww.b;
            }

            this.a_(this.g.dv() + $$4.c, this.g.dx() + $$4.d, this.g.dB() + $$4.e);
            this.i(this.g.dt());
         }
      } else {
         if (!this.t()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.i(this.dt().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eww $$7 = this.dt();
         this.a(btq.a, $$7);
         this.i($$7);
      }

      ewu $$8 = cnp.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.K();
      if (this.e == 0 && !this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avo.iP, avp.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dQ().B && this.e % 2 < 2) {
         this.dQ().a(lm.D, this.dv(), this.dx(), this.dB(), this.ah.k() * 0.05, -this.dt().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dQ().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dQ().a(this, (byte)17);
      this.a(dxw.w, this.s());
      this.x();
      this.aq();
   }

   @Override
   protected void a(ewt $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.v();
      }
   }

   @Override
   protected void a(ews $$0) {
      jd $$1 = new jd($$0.a());
      this.dQ().a_($$1).a(this.dQ(), $$1, this);
      if (!this.dQ().x_() && this.w()) {
         this.v();
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
         if (this.g != null) {
            this.g.a(this.dR().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         eww $$3 = this.do();

         for (btl $$5 : this.dQ().a(btl.class, this.cL().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  eww $$8 = new eww($$5.dv(), $$5.e(0.5 * (double)$$7), $$5.dB());
                  ewu $$9 = this.dQ().a(new dcd($$3, $$8, dcd.a.a, dcd.b.a, this));
                  if ($$9.c() == ewu.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dR().a(this, this.s()), $$10);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.ao.a(c).isPresent();
   }

   @Override
   public boolean t() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dQ().B) {
         eww $$1 = this.dt();
         this.dQ().a(this.dv(), this.dx(), this.dB(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dS()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cuo.a(this.dS(), (ux)$$0.p("FireworksItem")).orElseGet(cni::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cxj> z() {
      cuo $$0 = this.ao.a(b);
      cxk $$1 = $$0.a(kq.V);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cuo p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cu() {
      return false;
   }

   private static cuo A() {
      return new cuo(cur.uu);
   }

   @Override
   public DoubleDoubleImmutablePair a_(btl $$0, brj $$1) {
      double $$2 = $$0.do().c - this.do().c;
      double $$3 = $$0.do().e - this.do().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
