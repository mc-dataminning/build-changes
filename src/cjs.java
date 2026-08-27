import java.util.EnumSet;
import javax.annotation.Nullable;

public class cjs extends cje implements btp {
   public static final float b = 45.836624F;
   public static final int c = ayf.f((float) (Math.PI * 5.0 / 4.0));
   protected static final ajs<Byte> d = ajw.a(cjs.class, aju.a);
   private static final int e = 1;
   @Nullable
   bss bY;
   @Nullable
   private io bZ;
   private boolean ca;
   private int cb;

   public cjs(bsc<? extends cjs> $$0, daz $$1) {
      super($$0, $$1);
      this.bP = new cjs.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aV() {
      return this.ai % c == 0;
   }

   @Override
   public void a(bsv $$0, eum $$1) {
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
      this.bS.a(0, new bzi(this));
      this.bS.a(4, new cjs.a());
      this.bS.a(8, new cjs.d());
      this.bS.a(9, new bzw(this, cly.class, 3.0F, 1.0F));
      this.bS.a(10, new bzw(this, bss.class, 8.0F));
      this.bT.a(1, new cbg(this, cnk.class).a());
      this.bT.a(2, new cjs.b(this));
      this.bT.a(3, new cbh<>(this, cly.class, true));
   }

   public static btx.a u() {
      return cje.gv().a(bty.q, 14.0).a(bty.c, 4.0);
   }

   @Override
   protected void a(ajw.a $$0) {
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
   public void w(brw $$0) {
      super.w($$0);
      if ($$0 instanceof cjs $$1) {
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
   public bss y() {
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

   public void a(bss $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected avh v() {
      return avi.AK;
   }

   @Override
   protected avh o_() {
      return avi.AM;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.AN;
   }

   @Override
   public float bt() {
      return 1.0F;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      aym $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(aym $$0, bpu $$1) {
      this.a(bsd.a, new ctq(ctt.pa));
      this.a(bsd.a, 0.0F);
   }

   class a extends bzo {
      public a() {
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         bsq $$0 = cjs.this.p();
         return $$0 != null && $$0.bD() && !cjs.this.H().b() && cjs.this.ah.a(b(7)) == 0 ? cjs.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean b() {
         return cjs.this.H().b() && cjs.this.gq() && cjs.this.p() != null && cjs.this.p().bD();
      }

      @Override
      public void c() {
         bsq $$0 = cjs.this.p();
         if ($$0 != null) {
            eum $$1 = $$0.bx();
            cjs.this.bP.a($$1.c, $$1.d, $$1.e, 1.0);
         }

         cjs.this.w(true);
         cjs.this.a(avi.AL, 1.0F, 1.0F);
      }

      @Override
      public void d() {
         cjs.this.w(false);
      }

      @Override
      public boolean R_() {
         return true;
      }

      @Override
      public void e() {
         bsq $$0 = cjs.this.p();
         if ($$0 != null) {
            if (cjs.this.cK().c($$0.cK())) {
               cjs.this.C($$0);
               cjs.this.w(false);
            } else {
               double $$1 = cjs.this.g($$0);
               if ($$1 < 9.0) {
                  eum $$2 = $$0.bx();
                  cjs.this.bP.a($$2.c, $$2.d, $$2.e, 1.0);
               }
            }
         }
      }
   }

   class b extends cbo {
      private final cdh b = cdh.b().d().e();

      public b(bsz $$0) {
         super($$0, false);
      }

      @Override
      public boolean a() {
         return cjs.this.bY != null && cjs.this.bY.p() != null && this.a(cjs.this.bY.p(), this.b);
      }

      @Override
      public void c() {
         cjs.this.h(cjs.this.bY.p());
         super.c();
      }
   }

   class c extends byr {
      public c(cjs $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == byr.a.b) {
            eum $$0 = new eum(this.e - cjs.this.du(), this.f - cjs.this.dw(), this.g - cjs.this.dA());
            double $$1 = $$0.f();
            if ($$1 < cjs.this.cK().a()) {
               this.k = byr.a.a;
               cjs.this.g(cjs.this.ds().a(0.5));
            } else {
               cjs.this.g(cjs.this.ds().e($$0.a(this.h * 0.05 / $$1)));
               if (cjs.this.p() == null) {
                  eum $$2 = cjs.this.ds();
                  cjs.this.r(-((float)ayf.d($$2.c, $$2.e)) * (180.0F / (float)Math.PI));
                  cjs.this.aY = cjs.this.dF();
               } else {
                  double $$3 = cjs.this.p().du() - cjs.this.du();
                  double $$4 = cjs.this.p().dA() - cjs.this.dA();
                  cjs.this.r(-((float)ayf.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cjs.this.aY = cjs.this.dF();
               }
            }
         }
      }
   }

   class d extends bzo {
      public d() {
         this.a(EnumSet.of(bzo.a.a));
      }

      @Override
      public boolean a() {
         return !cjs.this.H().b() && cjs.this.ah.a(b(7)) == 0;
      }

      @Override
      public boolean b() {
         return false;
      }

      @Override
      public void e() {
         io $$0 = cjs.this.gp();
         if ($$0 == null) {
            $$0 = cjs.this.dp();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            io $$2 = $$0.b(cjs.this.ah.a(15) - 7, cjs.this.ah.a(11) - 5, cjs.this.ah.a(15) - 7);
            if (cjs.this.dP().u($$2)) {
               cjs.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cjs.this.p() == null) {
                  cjs.this.G().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
