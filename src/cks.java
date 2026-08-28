import java.util.EnumSet;
import javax.annotation.Nullable;

public class cks extends cke implements bup {
   public static final float b = 45.836624F;
   public static final int c = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akk<Byte> d = ako.a(cks.class, akm.a);
   private static final int e = 1;
   @Nullable
   bts bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public cks(btb<? extends cks> $$0, dbz $$1) {
      super($$0, $$1);
      this.bP = new cks.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btv $$0, evs $$1) {
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
      this.bS.a(0, new cai(this));
      this.bS.a(4, new cks.a());
      this.bS.a(8, new cks.d());
      this.bS.a(9, new caw(this, cmy.class, 3.0F, 1.0F));
      this.bS.a(10, new caw(this, bts.class, 8.0F));
      this.bT.a(1, new ccg(this, cok.class).a());
      this.bT.a(2, new cks.b(this));
      this.bT.a(3, new cch<>(this, cmy.class, true));
   }

   public static bux.a u() {
      return cke.gw().a(buy.q, 14.0).a(buy.c, 4.0);
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
   public void w(bsv $$0) {
      super.w($$0);
      if ($$0 instanceof cks $$1) {
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
   public bts y() {
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

   public void a(bts $$0) {
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
   protected avz d(bro $$0) {
      return awa.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqt $$1) {
      this.a(btc.a, new cuq(cut.pa));
      this.a(btc.a, 0.0F);
   }

   class a extends cao {
      public a() {
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         btq $$0 = cks.this.p();
         return $$0 != null && $$0.bD() && !cks.this.H().b() && cks.this.ah.a(b(7)) == 0 ? cks.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cks.this.H().b() && cks.this.gr() && cks.this.p() != null && cks.this.p().bD();
      }

      @Override
      public void c() {
         btq $$0 = cks.this.p();
         if ($$0 != null) {
            evs $$1 = $$0.bx();
            cks.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cks.this.w(true);
         cks.this.a(awa.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cks.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btq $$0 = cks.this.p();
         if ($$0 != null) {
            if (cks.this.cK().c($$0.cK())) {
               cks.this.C($$0);
               cks.this.w(false);
            } else {
               double $$1 = cks.this.g($$0);
               if ($$1 < 9.0) {
                  evs $$2 = $$0.bx();
                  cks.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cco {
      private final ceh b = ceh.b().d().e();

      public b(final btz $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cks.this.bY != null && cks.this.bY.p() != null && this.a(cks.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         cks.this.h(cks.this.bY.p());
         super.c();
      }
   }

   class c extends bzr {
      public c(final cks $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzr.a.b) {
            evs $$0 = new evs(this.e - cks.this.du(), this.f - cks.this.dw(), this.g - cks.this.dA());
            double $$1 = $$0.f();
            if ($$1 < cks.this.cK().a()) {
               this.k = bzr.a.a;
               cks.this.h(cks.this.ds().a(0.5));
            } else {
               cks.this.h(cks.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (cks.this.p() == null) {
                  evs $$2 = cks.this.ds();
                  cks.this.r(-((float)ayz.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cks.this.aY = cks.this.dF();
               } else {
                  double $$3 = cks.this.p().du() - cks.this.du();
                  double $$4 = cks.this.p().dA() - cks.this.dA();
                  cks.this.r(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cks.this.aY = cks.this.dF();
               }
            }
         }
      }
   }

   class d extends cao {
      public d() {
         this.a(EnumSet.of(cao.a.a));
      }

      @Override
      public boolean a() {
         return !cks.this.H().b() && cks.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = cks.this.gq();
         if ($$0 == null) {
            $$0 = cks.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(cks.this.ah.a(15) - 7, cks.this.ah.a(11) - 5, cks.this.ah.a(15) - 7);
            if (cks.this.dP().u($$2)) {
               cks.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cks.this.p() == null) {
                  cks.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
