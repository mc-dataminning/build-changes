import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckm extends cjy implements buj {
   public static final float b = 45.836624F;
   public static final int c = ayu.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akg<Byte> d = akk.a(ckm.class, aki.a);
   private static final int e = 1;
   @Nullable
   btm bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public ckm(bsv<? extends ckm> $$0, dbt $$1) {
      super($$0, $$1);
      this.bP = new ckm.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btp $$0, evm $$1) {
      super.a($$0, $$1);
      this.aS();
   }

   @Override
   public void l() {
      this.ag = true;
      super.l();
      this.ag = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dQ().i(), 1.0F);
      }
   }

   @Override
   protected void z() {
      super.z();
      this.bS.a(0, new cac(this));
      this.bS.a(4, new ckm.a());
      this.bS.a(8, new ckm.d());
      this.bS.a(9, new caq(this, cms.class, 3.0F, 1.0F));
      this.bS.a(10, new caq(this, btm.class, 8.0F));
      this.bT.a(1, new cca(this, coe.class).a());
      this.bT.a(2, new ckm.b(this));
      this.bT.a(3, new ccb<>(this, cms.class, true));
   }

   public static bur.a u() {
      return cjy.gw().a(bus.q, 14.0).a(bus.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new iz($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsp $$0) {
      super.w($$0);
      if ($$0 instanceof ckm $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      if (this.bZ != null) {
         $$0.a("BoundX", this.bZ.u());
         $$0.a("BoundY", this.bZ.v());
         $$0.a("BoundZ", this.bZ.w());
      }

      if (this.ca) {
         $$0.a("LifeTicks", this.cb);
      }
   }

   @Nullable
   public btm y() {
      return this.bY;
   }

   @Nullable
   public iz gq() {
      return this.bZ;
   }

   public void i(@Nullable iz $$0) {
      this.bZ = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.ao.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.ao.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.ao.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gr() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(btm $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avv v() {
      return avw.AK;
   }

   @Override
   protected avv o_() {
      return avw.AM;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      azc $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azc $$0, bqn $$1) {
      this.a(bsw.a, new cuk(cun.pa));
      this.a(bsw.a, 0.0F);
   }

   class a extends cai {
      public a() {
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean a() {
         btk $$0 = ckm.this.p();
         return $$0 != null && $$0.bD() && !ckm.this.H().b() && ckm.this.ah.a(b(7)) == 0 ? ckm.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckm.this.H().b() && ckm.this.gr() && ckm.this.p() != null && ckm.this.p().bD();
      }

      @Override
      public void c() {
         btk $$0 = ckm.this.p();
         if ($$0 != null) {
            evm $$1 = $$0.bx();
            ckm.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckm.this.w(true);
         ckm.this.a(avw.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckm.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btk $$0 = ckm.this.p();
         if ($$0 != null) {
            if (ckm.this.cK().c($$0.cK())) {
               ckm.this.C($$0);
               ckm.this.w(false);
            } else {
               double $$1 = ckm.this.g($$0);
               if ($$1 < 9.0) {
                  evm $$2 = $$0.bx();
                  ckm.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cci {
      private final ceb b = ceb.b().d().e();

      public b(final btt $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckm.this.bY != null && ckm.this.bY.p() != null && this.a(ckm.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         ckm.this.h(ckm.this.bY.p());
         super.c();
      }
   }

   class c extends bzl {
      public c(final ckm $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzl.a.b) {
            evm $$0 = new evm(this.e - ckm.this.du(), this.f - ckm.this.dw(), this.g - ckm.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckm.this.cK().a()) {
               this.k = bzl.a.a;
               ckm.this.h(ckm.this.ds().a(0.5));
            } else {
               ckm.this.h(ckm.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckm.this.p() == null) {
                  evm $$2 = ckm.this.ds();
                  ckm.this.r(-((float)ayu.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckm.this.aY = ckm.this.dF();
               } else {
                  double $$3 = ckm.this.p().du() - ckm.this.du();
                  double $$4 = ckm.this.p().dA() - ckm.this.dA();
                  ckm.this.r(-((float)ayu.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckm.this.aY = ckm.this.dF();
               }
            }
         }
      }
   }

   class d extends cai {
      public d() {
         this.a(EnumSet.of(cai.a.a));
      }

      @Override
      public boolean a() {
         return !ckm.this.H().b() && ckm.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = ckm.this.gq();
         if ($$0 == null) {
            $$0 = ckm.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(ckm.this.ah.a(15) - 7, ckm.this.ah.a(11) - 5, ckm.this.ah.a(15) - 7);
            if (ckm.this.dP().u($$2)) {
               ckm.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckm.this.p() == null) {
                  ckm.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
