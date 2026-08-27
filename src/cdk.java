import java.util.OptionalInt;
import javax.annotation.Nullable;

public class cdk extends cdp implements cdm {
   private static final afc<ckj> b = aff.a(cdk.class, afe.h);
   private static final afc<OptionalInt> c = aff.a(cdk.class, afe.u);
   private static final afc<Boolean> d = aff.a(cdk.class, afe.k);
   private int e;
   private int f;
   @Nullable
   private bkj g;

   public cdk(bjx<? extends cdk> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdk(cqz $$0, double $$1, double $$2, double $$3, ckj $$4) {
      super(bjx.M, $$0);
      this.e = 0;
      this.e($$1, $$2, $$3);
      int $$5 = 1;
      if (!$$4.b() && $$4.u()) {
         this.an.b(b, $$4.p());
         $$5 += $$4.a("Fireworks").f("Flight");
      }

      this.o(this.ag.a(0.0, 0.002297), 0.05, this.ag.a(0.0, 0.002297));
      this.f = 10 * $$5 + this.ag.a(6) + this.ag.a(7);
   }

   public cdk(cqz $$0, @Nullable bjt $$1, double $$2, double $$3, double $$4, ckj $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public cdk(cqz $$0, ckj $$1, bkj $$2) {
      this($$0, $$2, $$2.dq(), $$2.ds(), $$2.dw(), $$1);
      this.an.b(c, OptionalInt.of($$2.ah()));
      this.g = $$2;
   }

   public cdk(cqz $$0, ckj $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public cdk(cqz $$0, ckj $$1, bjt $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void b_() {
      this.an.a(b, ckj.b);
      this.an.a(c, OptionalInt.empty());
      this.an.a(d, false);
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
            this.an.b(c).ifPresent($$0x -> {
               bjt $$1x = this.dL().a($$0x);
               if ($$1x instanceof bkj) {
                  this.g = (bkj)$$1x;
               }
            });
         }

         if (this.g != null) {
            eif $$4;
            if (this.g.fw()) {
               eif $$0 = this.g.bE();
               double $$1 = 1.5;
               double $$2 = 0.1;
               eif $$3 = this.g.do();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(ckm.tA);
            } else {
               $$4 = eif.b;
            }

            this.e(this.g.dq() + $$4.c, this.g.ds() + $$4.d, this.g.dw() + $$4.e);
            this.f(this.g.do());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.f(this.do().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         eif $$7 = this.do();
         this.a(bkp.a, $$7);
         this.f($$7);
      }

      eid $$8 = cdq.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.H();
      if (this.e == 0 && !this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), aqd.hK, aqe.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dL().B && this.e % 2 < 2) {
         this.dL().a(js.A, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, -this.do().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dL().B && this.e > this.f) {
         this.t();
      }
   }

   private void t() {
      this.dL().a(this, (byte)17);
      this.a(dkl.w, this.v());
      this.x();
      this.ak();
   }

   @Override
   protected void a(eic $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.t();
      }
   }

   @Override
   protected void a(eib $$0) {
      ht $$1 = new ht($$0.a());
      this.dL().a_($$1).a(this.dL(), $$1, this);
      if (!this.dL().x_() && this.w()) {
         this.t();
      }

      super.a($$0);
   }

   private boolean w() {
      ckj $$0 = this.an.b(b);
      rt $$1 = $$0.b() ? null : $$0.b("Fireworks");
      rz $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      ckj $$1 = this.an.b(b);
      rt $$2 = $$1.b() ? null : $$1.b("Fireworks");
      rz $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dM().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         eif $$5 = this.dj();

         for (bkj $$7 : this.dL().a(bkj.class, this.cG().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  eif $$10 = new eif($$7.dq(), $$7.e(0.5 * (double)$$9), $$7.dw());
                  eid $$11 = this.dL().a(new cqi($$5, $$10, cqi.a.a, cqi.b.a, this));
                  if ($$11.c() == eid.a.a) {
                     $$8 = true;
                     break;
                  }
               }

               if ($$8) {
                  float $$12 = $$0 * (float)Math.sqrt((5.0 - (double)this.e($$7)) / 5.0);
                  $$7.a(this.dM().a(this, this.v()), $$12);
               }
            }
         }
      }
   }

   private boolean y() {
      return this.an.b(c).isPresent();
   }

   @Override
   public boolean s() {
      return this.an.b(d);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 17 && this.dL().B) {
         if (!this.w()) {
            for (int $$1 = 0; $$1 < this.ag.a(3) + 2; $$1++) {
               this.dL().a(js.W, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            ckj $$2 = this.an.b(b);
            rt $$3 = $$2.b() ? null : $$2.b("Fireworks");
            eif $$4 = this.do();
            this.dL().a(this.dq(), this.ds(), this.dw(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      ckj $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new rt()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      ckj $$1 = ckj.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public ckj q() {
      ckj $$0 = this.an.b(b);
      return $$0.b() ? new ckj(ckm.tA) : $$0;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
