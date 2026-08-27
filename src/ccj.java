import java.util.OptionalInt;
import javax.annotation.Nullable;

public class ccj extends cco implements ccl {
   private static final aeg<cjh> b = aej.a(ccj.class, aei.h);
   private static final aeg<OptionalInt> c = aej.a(ccj.class, aei.u);
   private static final aeg<Boolean> d = aej.a(ccj.class, aei.k);
   private int e;
   private int f;
   @Nullable
   private bji g;

   public ccj(biw<? extends ccj> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccj(cpx $$0, double $$1, double $$2, double $$3, cjh $$4) {
      super(biw.M, $$0);
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

   public ccj(cpx $$0, @Nullable bis $$1, double $$2, double $$3, double $$4, cjh $$5) {
      this($$0, $$2, $$3, $$4, $$5);
      this.b($$1);
   }

   public ccj(cpx $$0, cjh $$1, bji $$2) {
      this($$0, $$2, $$2.dq(), $$2.ds(), $$2.dw(), $$1);
      this.an.b(c, OptionalInt.of($$2.ah()));
      this.g = $$2;
   }

   public ccj(cpx $$0, cjh $$1, double $$2, double $$3, double $$4, boolean $$5) {
      this($$0, $$2, $$3, $$4, $$1);
      this.an.b(d, $$5);
   }

   public ccj(cpx $$0, cjh $$1, bis $$2, double $$3, double $$4, double $$5, boolean $$6) {
      this($$0, $$1, $$3, $$4, $$5, $$6);
      this.b($$2);
   }

   @Override
   protected void a_() {
      this.an.a(b, cjh.b);
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
               bis $$1x = this.dL().a($$0x);
               if ($$1x instanceof bji) {
                  this.g = (bji)$$1x;
               }
            });
         }

         if (this.g != null) {
            ehp $$4;
            if (this.g.fv()) {
               ehp $$0 = this.g.bE();
               double $$1 = 1.5;
               double $$2 = 0.1;
               ehp $$3 = this.g.do();
               this.g.f($$3.b($$0.c * 0.1 + ($$0.c * 1.5 - $$3.c) * 0.5, $$0.d * 0.1 + ($$0.d * 1.5 - $$3.d) * 0.5, $$0.e * 0.1 + ($$0.e * 1.5 - $$3.e) * 0.5));
               $$4 = this.g.a(cjk.tA);
            } else {
               $$4 = ehp.b;
            }

            this.e(this.g.dq() + $$4.c, this.g.ds() + $$4.d, this.g.dw() + $$4.e);
            this.f(this.g.do());
         }
      } else {
         if (!this.s()) {
            double $$6 = this.P ? 1.0 : 1.15;
            this.f(this.do().d($$6, 1.0, $$6).b(0.0, 0.04, 0.0));
         }

         ehp $$7 = this.do();
         this.a(bjo.a, $$7);
         this.f($$7);
      }

      ehn $$8 = ccp.a(this, this::a);
      if (!this.af) {
         this.a($$8);
         this.au = true;
      }

      this.H();
      if (this.e == 0 && !this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.hI, apg.i, 3.0F, 1.0F);
      }

      this.e++;
      if (this.dL().B && this.e % 2 < 2) {
         this.dL().a(ix.A, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, -this.do().d * 0.5, this.ag.k() * 0.05);
      }

      if (!this.dL().B && this.e > this.f) {
         this.t();
      }
   }

   private void t() {
      this.dL().a(this, (byte)17);
      this.a(djv.w, this.v());
      this.x();
      this.ak();
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.t();
      }
   }

   @Override
   protected void a(ehl $$0) {
      gw $$1 = new gw($$0.a());
      this.dL().a_($$1).a(this.dL(), $$1, this);
      if (!this.dL().w_() && this.w()) {
         this.t();
      }

      super.a($$0);
   }

   private boolean w() {
      cjh $$0 = this.an.b(b);
      qy $$1 = $$0.b() ? null : $$0.b("Fireworks");
      re $$2 = $$1 != null ? $$1.c("Explosions", 10) : null;
      return $$2 != null && !$$2.isEmpty();
   }

   private void x() {
      float $$0 = 0.0F;
      cjh $$1 = this.an.b(b);
      qy $$2 = $$1.b() ? null : $$1.b("Fireworks");
      re $$3 = $$2 != null ? $$2.c("Explosions", 10) : null;
      if ($$3 != null && !$$3.isEmpty()) {
         $$0 = 5.0F + (float)($$3.size() * 2);
      }

      if ($$0 > 0.0F) {
         if (this.g != null) {
            this.g.a(this.dM().a(this, this.v()), 5.0F + (float)($$3.size() * 2));
         }

         double $$4 = 5.0;
         ehp $$5 = this.dj();

         for (bji $$7 : this.dL().a(bji.class, this.cG().g(5.0))) {
            if ($$7 != this.g && !(this.f($$7) > 25.0)) {
               boolean $$8 = false;

               for (int $$9 = 0; $$9 < 2; $$9++) {
                  ehp $$10 = new ehp($$7.dq(), $$7.e(0.5 * (double)$$9), $$7.dw());
                  ehn $$11 = this.dL().a(new cpg($$5, $$10, cpg.a.a, cpg.b.a, this));
                  if ($$11.c() == ehn.a.a) {
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
               this.dL().a(ix.W, this.dq(), this.ds(), this.dw(), this.ag.k() * 0.05, 0.005, this.ag.k() * 0.05);
            }
         } else {
            cjh $$2 = this.an.b(b);
            qy $$3 = $$2.b() ? null : $$2.b("Fireworks");
            ehp $$4 = this.do();
            this.dL().a(this.dq(), this.ds(), this.dw(), $$4.c, $$4.d, $$4.e, $$3);
         }
      }

      super.b($$0);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Life", this.e);
      $$0.a("LifeTime", this.f);
      cjh $$1 = this.an.b(b);
      if (!$$1.b()) {
         $$0.a("FireworksItem", $$1.b(new qy()));
      }

      $$0.a("ShotAtAngle", this.an.b(d));
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.e = $$0.h("Life");
      this.f = $$0.h("LifeTime");
      cjh $$1 = cjh.a($$0.p("FireworksItem"));
      if (!$$1.b()) {
         this.an.b(b, $$1);
      }

      if ($$0.e("ShotAtAngle")) {
         this.an.b(d, $$0.q("ShotAtAngle"));
      }
   }

   @Override
   public cjh q() {
      cjh $$0 = this.an.b(b);
      return $$0.b() ? new cjh(cjk.tA) : $$0;
   }

   @Override
   public boolean cp() {
      return false;
   }
}
