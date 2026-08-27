import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjq extends cjc implements btn {
   public static final float b = 45.836624F;
   public static final int c = ayd.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajr<Byte> d = ajv.a(cjq.class, ajt.a);
   private static final int e = 1;
   @Nullable
   bsq bY;
   @Nullable
   private io bZ;
   private boolean ca;
   private int cb;

   public cjq(bsa<? extends cjq> $$0, dax $$1) {
      super($$0, $$1);
      this.bP = new cjq.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bst $$0, euk $$1) {
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
      this.bS.a(0, new bzg(this));
      this.bS.a(4, new cjq.a());
      this.bS.a(8, new cjq.d());
      this.bS.a(9, new bzu(this, clw.class, 3.0F, 1.0F));
      this.bS.a(10, new bzu(this, bsq.class, 8.0F));
      this.bT.a(1, new cbe(this, cni.class).a());
      this.bT.a(2, new cjq.b(this));
      this.bT.a(3, new cbf<>(this, clw.class, true));
   }

   public static btv.a u() {
      return cjc.gv().a(btw.q, 14.0).a(btw.c, 4.0);
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new io($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void w(bru $$0) {
      super.w($$0);
      if ($$0 instanceof cjq $$1) {
         this.bY = $$1.y();
      }
   }

   @Override
   public void b(ud $$0) {
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
   public bsq y() {
      return this.bY;
   }

   @Nullable
   public io gp() {
      return this.bZ;
   }

   public void i(@Nullable io $$0) {
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

   public boolean gq() {
      return this.c(1);
   }

   public void w(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bsq $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avg v() {
      return avh.AK;
   }

   @Override
   protected avg o_() {
      return avh.AM;
   }

   @Override
   protected avg d(bqn $$0) {
      return avh.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bth a(dbm $$0, bps $$1, bss $$2, @Nullable bth $$3) {
      ayk $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayk $$0, bps $$1) {
      this.a(bsb.a, new cto(ctr.pa));
      this.a(bsb.a, 0.0F);
   }

   class a extends bzm {
      public a() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         bso $$0 = cjq.this.p();
         return $$0 != null && $$0.bD() && !cjq.this.H().b() && cjq.this.ah.a(b(7)) == 0 ? cjq.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cjq.this.H().b() && cjq.this.gq() && cjq.this.p() != null && cjq.this.p().bD();
      }

      @Override
      public void c() {
         bso $$0 = cjq.this.p();
         if ($$0 != null) {
            euk $$1 = $$0.bx();
            cjq.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cjq.this.w(true);
         cjq.this.a(avh.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cjq.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bso $$0 = cjq.this.p();
         if ($$0 != null) {
            if (cjq.this.cK().c($$0.cK())) {
               cjq.this.C($$0);
               cjq.this.w(false);
            } else {
               double $$1 = cjq.this.g($$0);
               if ($$1 < 9.0) {
                  euk $$2 = $$0.bx();
                  cjq.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cbm {
      private final cdf b = cdf.b().d().e();

      public b(bsx $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cjq.this.bY != null && cjq.this.bY.p() != null && this.a(cjq.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         cjq.this.h(cjq.this.bY.p());
         super.c();
      }
   }

   class c extends byp {
      public c(cjq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == byp.a.b) {
            euk $$0 = new euk(this.e - cjq.this.du(), this.f - cjq.this.dw(), this.g - cjq.this.dA());
            double $$1 = $$0.f();
            if ($$1 < cjq.this.cK().a()) {
               this.k = byp.a.a;
               cjq.this.g(cjq.this.ds().a(0.5));
            } else {
               cjq.this.g(cjq.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (cjq.this.p() == null) {
                  euk $$2 = cjq.this.ds();
                  cjq.this.r(-((float)ayd.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cjq.this.aZ = cjq.this.dF();
               } else {
                  double $$3 = cjq.this.p().du() - cjq.this.du();
                  double $$4 = cjq.this.p().dA() - cjq.this.dA();
                  cjq.this.r(-((float)ayd.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cjq.this.aZ = cjq.this.dF();
               }
            }
         }
      }
   }

   class d extends bzm {
      public d() {
         this.a(EnumSet.of(bzm.a.a));
      }

      @Override
      public boolean a() {
         return !cjq.this.H().b() && cjq.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         io $$0 = cjq.this.gp();
         if ($$0 == null) {
            $$0 = cjq.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            io $$2 = $$0.b(cjq.this.ah.a(15) - 7, cjq.this.ah.a(11) - 5, cjq.this.ah.a(15) - 7);
            if (cjq.this.dP().u($$2)) {
               cjq.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cjq.this.p() == null) {
                  cjq.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
