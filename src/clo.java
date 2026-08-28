import java.util.EnumSet;
import javax.annotation.Nullable;

public class clo extends cla implements bvi {
   public static final float b = 45.836624F;
   public static final int c = azd.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akg<Byte> d = akk.a(clo.class, aki.a);
   private static final int e = 1;
   @Nullable
   bum bY;
   @Nullable
   private je bZ;
   private boolean ca;
   private int cb;

   public clo(btv<? extends clo> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new clo.c(this);
      this.bN = 3;
   }

   @Override
   public boolean aZ() {
      return this.ag % c == 0;
   }

   @Override
   protected boolean aJ() {
      return !this.dN();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dT().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbb(this));
      this.bS.a(4, new clo.a());
      this.bS.a(8, new clo.d());
      this.bS.a(9, new cbp(this, cnu.class, 3.0F, 1.0F));
      this.bS.a(10, new cbp(this, bum.class, 8.0F));
      this.bT.a(1, new ccz(this, cpj.class).a());
      this.bT.a(2, new clo.b(this));
      this.bT.a(3, new cda<>(this, cnu.class, true));
   }

   public static bvq.a q() {
      return cla.gv().a(bvr.s, 14.0).a(bvr.c, 4.0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new je($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(bto $$0) {
      super.x($$0);
      if ($$0 instanceof clo $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(uf $$0) {
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
   public bum t() {
      return this.bY;
   }

   @Nullable
   public je y() {
      return this.bZ;
   }

   public void h(@Nullable je $$0) {
      this.bZ = $$0;
   }

   private boolean c(int $$0) {
      int $$1 = this.am.a(d);
      return ($$1 & $$0) != 0;
   }

   private void a(int $$0, boolean $$1) {
      int $$2 = this.am.a(d);
      if ($$1) {
         $$2 |= $$0;
      } else {
         $$2 &= ~$$0;
      }

      this.am.a(d, (byte)($$2 & 0xFF));
   }

   public boolean gp() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bum $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected awd w() {
      return awe.AU;
   }

   @Override
   protected awd n_() {
      return awe.AW;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.AX;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azl $$0, brn $$1) {
      this.a(btw.a, new cvp(cvt.pc));
      this.a(btw.a, 0.0F);
   }

   class a extends cbh {
      public a() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         buk $$0 = clo.this.m();
         return $$0 != null && $$0.bI() && !clo.this.M().b() && clo.this.af.a(b(7)) == 0 ? clo.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return clo.this.M().b() && clo.this.gp() && clo.this.m() != null && clo.this.m().bI();
      }

      @Override
      public void d() {
         buk $$0 = clo.this.m();
         if ($$0 != null) {
            eys $$1 = $$0.bC();
            clo.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         clo.this.x(true);
         clo.this.a(awe.AV, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         clo.this.x(false);
      }

      @Override
      public boolean T_() {
         return true;
      }

      @Override
      public void a() {
         buk $$0 = clo.this.m();
         if ($$0 != null) {
            if (clo.this.cO().c($$0.cO())) {
               clo.this.E($$0);
               clo.this.x(false);
            } else {
               double $$1 = clo.this.g($$0);
               if ($$1 < 9.0) {
                  eys $$2 = $$0.bC();
                  clo.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cdh {
      private final cfa b = cfa.b().d().e();

      public b(final bus $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return clo.this.bY != null && clo.this.bY.m() != null && this.a(clo.this.bY.m(), this.b);
      }

      @Override
      public void d() {
         clo.this.h(clo.this.bY.m());
         super.d();
      }
   }

   class c extends cak {
      public c(final clo $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == cak.a.b) {
            eys $$0 = new eys(this.e - clo.this.dx(), this.f - clo.this.dz(), this.g - clo.this.dD());
            double $$1 = $$0.g();
            if ($$1 < clo.this.cO().a()) {
               this.k = cak.a.a;
               clo.this.h(clo.this.dv().c(0.5));
            } else {
               clo.this.h(clo.this.dv().e($$0.c(this.h * 0.05 / $$1)));
               if (clo.this.m() == null) {
                  eys $$2 = clo.this.dv();
                  clo.this.v(-((float)azd.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  clo.this.aT = clo.this.dI();
               } else {
                  double $$3 = clo.this.m().dx() - clo.this.dx();
                  double $$4 = clo.this.m().dD() - clo.this.dD();
                  clo.this.v(-((float)azd.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  clo.this.aT = clo.this.dI();
               }
            }
         }
      }
   }

   class d extends cbh {
      public d() {
         this.a(EnumSet.of(cbh.a.a));
      }

      @Override
      public boolean b() {
         return !clo.this.M().b() && clo.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         je $$0 = clo.this.y();
         if ($$0 == null) {
            $$0 = clo.this.ds();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            je $$2 = $$0.b(clo.this.af.a(15) - 7, clo.this.af.a(11) - 5, clo.this.af.a(15) - 7);
            if (clo.this.dS().u($$2)) {
               clo.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (clo.this.m() == null) {
                  clo.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
