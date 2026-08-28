import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckt extends ckf implements buq {
   public static final float b = 45.836624F;
   public static final int c = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akk<Byte> d = ako.a(ckt.class, akm.a);
   private static final int e = 1;
   @Nullable
   btt bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public ckt(btc<? extends ckt> $$0, dca $$1) {
      super($$0, $$1);
      this.bP = new ckt.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btw $$0, evt $$1) {
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
      this.bS.a(0, new caj(this));
      this.bS.a(4, new ckt.a());
      this.bS.a(8, new ckt.d());
      this.bS.a(9, new cax(this, cmz.class, 3.0F, 1.0F));
      this.bS.a(10, new cax(this, btt.class, 8.0F));
      this.bT.a(1, new cch(this, col.class).a());
      this.bT.a(2, new ckt.b(this));
      this.bT.a(3, new cci<>(this, cmz.class, true));
   }

   public static buy.a u() {
      return ckf.gw().a(buz.q, 14.0).a(buz.c, 4.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new iz($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bsw $$0) {
      super.w($$0);
      if ($$0 instanceof ckt $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(us $$0) {
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
   public btt y() {
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

   public void a(btt $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avz v() {
      return awa.AK;
   }

   @Override
   protected avz o_() {
      return awa.AM;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqu $$1) {
      this.a(btd.a, new cur(cuu.pa));
      this.a(btd.a, 0.0F);
   }

   class a extends cap {
      public a() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         btr $$0 = ckt.this.p();
         return $$0 != null && $$0.bD() && !ckt.this.H().b() && ckt.this.ah.a(b(7)) == 0 ? ckt.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckt.this.H().b() && ckt.this.gr() && ckt.this.p() != null && ckt.this.p().bD();
      }

      @Override
      public void c() {
         btr $$0 = ckt.this.p();
         if ($$0 != null) {
            evt $$1 = $$0.bx();
            ckt.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckt.this.w(true);
         ckt.this.a(awa.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckt.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btr $$0 = ckt.this.p();
         if ($$0 != null) {
            if (ckt.this.cK().c($$0.cK())) {
               ckt.this.C($$0);
               ckt.this.w(false);
            } else {
               double $$1 = ckt.this.g($$0);
               if ($$1 < 9.0) {
                  evt $$2 = $$0.bx();
                  ckt.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccp {
      private final cei b = cei.b().d().e();

      public b(final bua $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckt.this.bY != null && ckt.this.bY.p() != null && this.a(ckt.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         ckt.this.h(ckt.this.bY.p());
         super.c();
      }
   }

   class c extends bzs {
      public c(final ckt $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzs.a.b) {
            evt $$0 = new evt(this.e - ckt.this.du(), this.f - ckt.this.dw(), this.g - ckt.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckt.this.cK().a()) {
               this.k = bzs.a.a;
               ckt.this.h(ckt.this.ds().a(0.5));
            } else {
               ckt.this.h(ckt.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckt.this.p() == null) {
                  evt $$2 = ckt.this.ds();
                  ckt.this.r(-((float)ayz.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckt.this.aY = ckt.this.dF();
               } else {
                  double $$3 = ckt.this.p().du() - ckt.this.du();
                  double $$4 = ckt.this.p().dA() - ckt.this.dA();
                  ckt.this.r(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckt.this.aY = ckt.this.dF();
               }
            }
         }
      }
   }

   class d extends cap {
      public d() {
         this.a(EnumSet.of(cap.a.a));
      }

      @Override
      public boolean a() {
         return !ckt.this.H().b() && ckt.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = ckt.this.gq();
         if ($$0 == null) {
            $$0 = ckt.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(ckt.this.ah.a(15) - 7, ckt.this.ah.a(11) - 5, ckt.this.ah.a(15) - 7);
            if (ckt.this.dP().u($$2)) {
               ckt.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckt.this.p() == null) {
                  ckt.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
