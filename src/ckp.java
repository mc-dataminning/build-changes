import java.util.EnumSet;
import javax.annotation.Nullable;

public class ckp extends ckb implements bum {
   public static final float b = 45.836624F;
   public static final int c = ayx.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akj<Byte> d = akn.a(ckp.class, akl.a);
   private static final int e = 1;
   @Nullable
   btp bY;
   @Nullable
   private iz bZ;
   private boolean ca;
   private int cb;

   public ckp(bsy<? extends ckp> $$0, dbw $$1) {
      super($$0, $$1);
      this.bP = new ckp.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bts $$0, evp $$1) {
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
      this.bS.a(0, new caf(this));
      this.bS.a(4, new ckp.a());
      this.bS.a(8, new ckp.d());
      this.bS.a(9, new cat(this, cmv.class, 3.0F, 1.0F));
      this.bS.a(10, new cat(this, btp.class, 8.0F));
      this.bT.a(1, new ccd(this, coh.class).a());
      this.bT.a(2, new ckp.b(this));
      this.bT.a(3, new cce<>(this, cmv.class, true));
   }

   public static buu.a u() {
      return ckb.gw().a(buv.q, 14.0).a(buv.c, 4.0);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void w(bss $$0) {
      super.w($$0);
      if ($$0 instanceof ckp $$1) {
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
   public btp y() {
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

   public void a(btp $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avy v() {
      return avz.AK;
   }

   @Override
   protected avy o_() {
      return avz.AM;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      azf $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azf $$0, bqq $$1) {
      this.a(bsz.a, new cun(cuq.pa));
      this.a(bsz.a, 0.0F);
   }

   class a extends cal {
      public a() {
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public boolean a() {
         btn $$0 = ckp.this.p();
         return $$0 != null && $$0.bD() && !ckp.this.H().b() && ckp.this.ah.a(b(7)) == 0 ? ckp.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return ckp.this.H().b() && ckp.this.gr() && ckp.this.p() != null && ckp.this.p().bD();
      }

      @Override
      public void c() {
         btn $$0 = ckp.this.p();
         if ($$0 != null) {
            evp $$1 = $$0.bx();
            ckp.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         ckp.this.w(true);
         ckp.this.a(avz.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         ckp.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         btn $$0 = ckp.this.p();
         if ($$0 != null) {
            if (ckp.this.cK().c($$0.cK())) {
               ckp.this.C($$0);
               ckp.this.w(false);
            } else {
               double $$1 = ckp.this.g($$0);
               if ($$1 < 9.0) {
                  evp $$2 = $$0.bx();
                  ckp.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends ccl {
      private final cee b = cee.b().d().e();

      public b(final btw $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return ckp.this.bY != null && ckp.this.bY.p() != null && this.a(ckp.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         ckp.this.h(ckp.this.bY.p());
         super.c();
      }
   }

   class c extends bzo {
      public c(final ckp $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == bzo.a.b) {
            evp $$0 = new evp(this.e - ckp.this.du(), this.f - ckp.this.dw(), this.g - ckp.this.dA());
            double $$1 = $$0.f();
            if ($$1 < ckp.this.cK().a()) {
               this.k = bzo.a.a;
               ckp.this.h(ckp.this.ds().a(0.5));
            } else {
               ckp.this.h(ckp.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (ckp.this.p() == null) {
                  evp $$2 = ckp.this.ds();
                  ckp.this.r(-((float)ayx.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  ckp.this.aY = ckp.this.dF();
               } else {
                  double $$3 = ckp.this.p().du() - ckp.this.du();
                  double $$4 = ckp.this.p().dA() - ckp.this.dA();
                  ckp.this.r(-((float)ayx.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  ckp.this.aY = ckp.this.dF();
               }
            }
         }
      }
   }

   class d extends cal {
      public d() {
         this.a(EnumSet.of(cal.a.a));
      }

      @Override
      public boolean a() {
         return !ckp.this.H().b() && ckp.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         iz $$0 = ckp.this.gq();
         if ($$0 == null) {
            $$0 = ckp.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            iz $$2 = $$0.b(ckp.this.ah.a(15) - 7, ckp.this.ah.a(11) - 5, ckp.this.ah.a(15) - 7);
            if (ckp.this.dP().u($$2)) {
               ckp.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (ckp.this.p() == null) {
                  ckp.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
