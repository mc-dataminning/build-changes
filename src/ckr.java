import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckr extends ckd implements buo {
   public static final float b = 45.836624F;
   public static final int c = ayz.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akk<Byte> d = ako.a(ckr.class, akm.a);
   private static final int e = 1;
   @Nullable
   btr bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public ckr(bta<? extends ckr> $$0, dby $$1) {
      super($$0, $$1);
      this.bP = new ckr.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(btu $$0, evr $$1) {
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
      this.bS.a(0, new cah(this));
      this.bS.a(4, new ckr.a());
      this.bS.a(8, new ckr.d());
      this.bS.a(9, new cav(this, cmx.class, 3.0F, 1.0F));
      this.bS.a(10, new cav(this, btr.class, 8.0F));
      this.bT.a(1, new ccf(this, coj.class).a());
      this.bT.a(2, new ckr.b(this));
      this.bT.a(3, new ccg<>(this, cmx.class, true));
   }

   public static buw.a u() {
      return ckd.gw().a(bux.q, 14.0).a(bux.c, 4.0);
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
   public void w(bsu $$0) {
      super.w($$0);
      if ($$0 instanceof ckr $$1) {
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
   public btr y() {
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

   public void a(btr $$0) {
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
   protected avz d(brn $$0) {
      return awa.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      azh $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azh $$0, bqs $$1) {
      this.a(btb.a, new cup(cus.pa));
      this.a(btb.a, 0.0F);
   }

   class a extends can {
      public a() {
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public boolean a() {
         btp $$0 = ckr.this.p();
         return $$0 != null && $$0.bD() && !ckr.this.H().b() && ckr.this.ah.a(b(7)) == 0 ? ckr.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckr.this.H().b() && ckr.this.gr() && ckr.this.p() != null && ckr.this.p().bD();
      }

      @Override
      public void c() {
         btp $$0 = ckr.this.p();
         if ($$0 != null) {
            evr $$1 = $$0.bx();
            ckr.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckr.this.w(true);
         ckr.this.a(awa.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckr.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btp $$0 = ckr.this.p();
         if ($$0 != null) {
            if (ckr.this.cK().c($$0.cK())) {
               ckr.this.C($$0);
               ckr.this.w(false);
            } else {
               double $$1 = ckr.this.g($$0);
               if ($$1 < 9.0) {
                  evr $$2 = $$0.bx();
                  ckr.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccn {
      private final ceg b = ceg.b().d().e();

      public b(final bty $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckr.this.bY != null && ckr.this.bY.p() != null && this.a(ckr.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         ckr.this.h(ckr.this.bY.p());
         super.c();
      }
   }

   class c extends bzq {
      public c(final ckr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzq.a.b) {
            evr $$0 = new evr(this.e - ckr.this.du(), this.f - ckr.this.dw(), this.g - ckr.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckr.this.cK().a()) {
               this.k = bzq.a.a;
               ckr.this.h(ckr.this.ds().a(0.5));
            } else {
               ckr.this.h(ckr.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckr.this.p() == null) {
                  evr $$2 = ckr.this.ds();
                  ckr.this.r(-((float)ayz.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dF();
               } else {
                  double $$3 = ckr.this.p().du() - ckr.this.du();
                  double $$4 = ckr.this.p().dA() - ckr.this.dA();
                  ckr.this.r(-((float)ayz.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckr.this.aY = ckr.this.dF();
               }
            }
         }
      }
   }

   class d extends can {
      public d() {
         this.a(EnumSet.of(can.a.a));
      }

      @Override
      public boolean a() {
         return !ckr.this.H().b() && ckr.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = ckr.this.gq();
         if ($$0 == null) {
            $$0 = ckr.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(ckr.this.ah.a(15) - 7, ckr.this.ah.a(11) - 5, ckr.this.ah.a(15) - 7);
            if (ckr.this.dP().u($$2)) {
               ckr.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckr.this.p() == null) {
                  ckr.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
