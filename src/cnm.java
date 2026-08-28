import java.util.List;
import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cnm extends cnr implements cno {
   private static final akk<cur> b = ako.a(cnm.class, akm.h);
   private static final akk<OptionalInt> c = ako.a(cnm.class, akm.v);
   private static final akk<Boolean> d = ako.a(cnm.class, akm.k);
   private int e;
   private int f;
   @Nullable
   private btr g;

   public cnm(btc<? extends cnm> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnm(dca $$0, double $$1, double $$2, double $$3, cur $$4) {
      super(btc.P, $$0);
      this.e = 0;
      this.a_($$1, $$2, $$3);
      this.ao.a(b, $$4.s());
      int $$5 = 1;
      cxl $$6 = $$4.a(km.U);
      if ($$6 != null) {
         $$5 += $$6.a();
      }

      this.o(this.ah.a(0.0, 0.002297), 0.05, this.ah.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ah.a(6) + this.ah.a(7);
   }

   public cnm(dca $$0, @Nullable bsw $$1, double $$2, double $$3, double $$4, cur $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.c($$1);
   }

   public cnm(dca $$0, cur $$1, btr $$2) {
      this($$0, $$2, $$2.du(), $$2.dw(), $$2.dA(), $$1);
      this.ao.a(c, OptionalInt.of($$2.al()));
      this.g = $$2;
   }

   public cnm(dca $$0, cur $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.ao.a(d, $$5);
   }

   public cnm(dca $$0, cur $$1, bsw $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.c($$2);
   }

   @Override
   protected void a(ako.a $$0) {
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
               bsw $$1x = this.dP().a($$0x);
               if ($$1x instanceof btr) {
                  this.g = (btr)$$1x;
               }
            });
         }

         if (this.g != null) {
            evt $$4;
            if (this.g.fE()) {
               evt $$0 = this.g.bL();
               double $$1 = 1.5;
               double $$2 = 0.1;
               evt $$3 = this.g.ds();
               this.g.h($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cuu.uu);
            } else {
               $$4 = evt.b;
            }

            this.a_(this.g.du() + $$4.c, this.g.dw() + $$4.d, this.g.dA() + $$4.e);
            this.h(this.g.ds());
         }
      } else {
         if (!this.u()) {
            double $$6 = this.Q ? 1.0 : 1.15;
            this.h(this.ds().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         evt $$7 = this.ds();
         this.a(btw.a, $$7);
         this.h($$7);
      }

      evr $$8 = cnt.a(this, this::b);
      if (!this.ag) {
         this.b($$8);
         this.av = true;
      }

      this.J();
      if (this.e == 0 && !this.aW()) {
         this.dP().a(null, this.du(), this.dw(), this.dA(), awa.iP, awb.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dP().B && this.e % 2 < 2) {
         this.dP().a(li.D, this.du(), this.dw(), this.dA(), this.ah.k() * 0.05, -this.ds().d * 0.5, this.ah.k() * 0.05);
      }

      if (!this.dP().B && this.e > this.f) {
         this.v();
      }
   }

   private void v() {
      this.dP().a(this, (byte)17);
      this.a(dwx.w, this.s());
      this.x();
      this.ao();
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.v();
      }
   }

   @Override
   protected void a(evp $$0) {
      iz $$1 = new iz($$0.a());
      this.dP().a_($$1).a(this.dP(), $$1, this);
      if (!this.dP().x_() && this.w()) {
         this.v();
      }

      super.a($$0);
   }

   private boolean w() {
      return !this.z().isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      List<cxk> $$1 = this.z();
      if (!$$1.isEmpty()) {
         $$0 = 5.0F + (float)($$1.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dQ().a(this, this.s()), 5.0F + (float)($$1.size() * 2));
         }

         double $$2 = 5.0;
         evt $$3 = this.dn();

         for (btr $$5 : this.dP().a(btr.class, this.cK().g(5.0))) {
            if ($$5 != this.g && !(this.g($$5) > 25.0)) {
               boolean $$6 = false;

               for (int $$7 = 0; $$7 < 2; $$7++) {
                  evt $$8 = new evt($$5.du(), $$5.e(0.5 * (double)$$7), $$5.dA());
                  evr $$9 = this.dP().a(new dbj($$3, $$8, dbj.a.a, dbj.b.a, this));
                  if ($$9.c() == evr.a.a) {
                     $$6 = true;
                     break;
                  }
               }

               if ($$6) {
                  float $$10 = $$0 * (float)Math.sqrt((5.0 - (double)this.f($$5)) / 5.0);
                  $$5.a(this.dQ().a(this, this.s()), $$10);
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
      if ($$0 == 17 && this.dP().B) {
         evt $$1 = this.ds();
         this.dP().a(this.du(), this.dw(), this.dA(), $$1.c, $$1.d, $$1.e, this.z());
      }

      super.b($$0);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      $$0.a("FireworksItem", this.p().a(this.dR()));
      $$0.a("ShotAtAngle", this.ao.a(d));
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      if ($$0.b("FireworksItem", 10)) {
         this.ao.a(b, cur.a(this.dR(), (vp)$$0.p("FireworksItem")).orElseGet(cnm::A));
      } else {
         this.ao.a(b, A());
      }

      if ($$0.e("ShotAtAngle")) {
         this.ao.a(d, $$0.q("ShotAtAngle"));
      }
   }

   private List<cxk> z() {
      cur $$0 = this.ao.a(b);
      cxl $$1 = $$0.a(km.U);
      return $$1 != null ? $$1.b() : List.of();
   }

   @Override
   public cur p() {
      return this.ao.a(b);
   }

   @Override
   public boolean ct() {
      return false;
   }

   private static cur A() {
      return new cur(cuu.uu);
   }
}
