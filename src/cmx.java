import it.unimi.dsi.fastutil.doubles.DoubleDoubleImmutablePair;
import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cmx extends cnc implements cmz {
   private static final ajp<cuc> b = ajt.a(cmx.class, ajr.h);
   private static final ajp<OptionalInt> c = ajt.a(cmx.class, ajr.v);
   private static final ajp<Boolean> d = ajt.a(cmx.class, ajr.k);
   private int e;
   private int f;
   @Nullable
   private btb g;

   public cmx(bsm<? extends cmx> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cmx(dcf $$0, double $$1, double $$2, double $$3, cuc $$4) {
      super(bsm.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cwv $$6 = $$4.a(kn.U);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cmx(dcf $$0, @Nullable bsg $$1, double $$2, double $$3, double $$4, cuc $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cmx(dcf $$0, cuc $$1, btb $$2) {
      this($$0, $$2, $$2.dv(), $$2.dx(), $$2.dB(), $$1);
      this.ao.a(c, OptionalInt.of($$2.am()));
      this.g = $$2;
   }

   public cmx(dcf $$0, cuc $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cmx(dcf $$0, cuc $$1, bsg $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ajt.a $$0) {
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
               bsg $$1x = this.dQ().a($$0x);
               if ($$1x instanceof btb) {
                  this.g = (btb)$$1x;
               }
            });
         }

         if (this.g != null) {
            ewf $$4;
            if (this.g.fB()) {
               ewf $$0 = this.g.bM();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ewf $$3 = this.g.dt();
               this.g.i($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cuf.uu);
            } else {
               $$4 = ewf.b;
            }

            this.a_(this.g.dv() + $$4.c, this.g.dx() + $$4.d, this.g.dB() + $$4.e);
            this.i(this.g.dt());
         }
      } else {
         if (!this.u()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.i(this.dt().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ewf $$7 = this.dt();
         this.a(btg.a, $$7);
         this.i($$7);
      }

      ewd $$8 = cne.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aX()) {
         this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.iP, avi.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dQ().B && this.e % 2 < 2) {
         this.dQ().a(lj.D, this.dv(), this.dx(), this.dB(), this.ah.k() * 0.05, -this.dt().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dQ().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dQ().a(this, (byte)17);
      this.a(dxg.w, this.s());
      this.x();
      this.ap();
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      if (!this.dQ().B) {
         this.v();
      }
   }

   @Override
   protected void a(ewb $$0) {
      ja $$1 = new ja($$0.a());
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
      List<cwu> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dR().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         ewf $$3 = this.do();

         for (btb $$5 : this.dQ().a(btb.class, this.cL().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  ewf $$8 = new ewf($$5.dv(), $$5.e(0.5 * (double)$$7), $$5.dB());
                  ewd $$9 = this.dQ().a(new dbo($$3, $$8, dbo.a.a, dbo.b.a, this));
                  if ($$9.c() == ewd.a.a) {
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
   public boolean u() {
      return this.ao.a(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dQ().B) {
         ewf $$1 = this.dt();
         this.dQ().a(this.dv(), this.dx(), this.dB(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dS()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cuc.a(this.dS(), (uu)$$0.p("FireworksItem")).orElseGet(cmx::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cwu> z() {
      cuc $$0 = this.ao.a(b);
      cwv $$1 = $$0.a(kn.U);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cuc p() {
      return this.ao.a(b);
   }

   @Override
   public boolean cu() {
      return false;
   }

   private static cuc A() {
      return new cuc(cuf.uu);
   }

   @Override
   public DoubleDoubleImmutablePair a_(btb $$0, bqz $$1) {
      double $$2 = $$0.do().c - this.do().c;
      double $$3 = $$0.do().e - this.do().e;
      return DoubleDoubleImmutablePair.of($$2, $$3);
   }
}
