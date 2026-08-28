import java.util.EnumSet;
import javax.annotation.Nullable;

public class clr extends cld implements bvl {
   public static final float b = 45.836624F;
   public static final int c = azf.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akh<Byte> d = akl.a(clr.class, akj.a);
   private static final int e = 1;
   @Nullable
   bup bY;
   @Nullable
   private jf bZ;
   private boolean ca;
   private int cb;

   public clr(bty<? extends clr> $$0, dej $$1) {
      super($$0, $$1);
      this.bP = new clr.c(this);
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
      this.bS.a(0, new cbe(this));
      this.bS.a(4, new clr.a());
      this.bS.a(8, new clr.d());
      this.bS.a(9, new cbs(this, cnx.class, 3.0F, 1.0F));
      this.bS.a(10, new cbs(this, bup.class, 8.0F));
      this.bT.a(1, new cdc(this, cpm.class).a());
      this.bT.a(2, new clr.b(this));
      this.bT.a(3, new cdd<>(this, cnx.class, true));
   }

   public static bvt.a q() {
      return cld.gu().a(bvu.s, 14.0).a(bvu.c, 4.0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(ug $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new jf($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(btr $$0) {
      super.x($$0);
      if ($$0 instanceof clr $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(ug $$0) {
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
   public bup t() {
      return this.bY;
   }

   @Nullable
   public jf y() {
      return this.bZ;
   }

   public void h(@Nullable jf $$0) {
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

   public boolean go() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bup $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected awf w() {
      return awg.AU;
   }

   @Override
   protected awf o_() {
      return awg.AW;
   }

   @Override
   protected awf d(bsj $$0) {
      return awg.AX;
   }

   @Override
   public float bx() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvf a(dez $$0, brq $$1, btx $$2, @Nullable bvf $$3) {
      azn $$4 = $$0.D_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azn $$0, brq $$1) {
      this.a(btz.a, new cvs(cvw.pc));
      this.a(btz.a, 0.0F);
   }

   class a extends cbk {
      public a() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         bun $$0 = clr.this.m();
         return $$0 != null && $$0.bI() && !clr.this.M().b() && clr.this.af.a(b(7)) == 0 ? clr.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return clr.this.M().b() && clr.this.go() && clr.this.m() != null && clr.this.m().bI();
      }

      @Override
      public void d() {
         bun $$0 = clr.this.m();
         if ($$0 != null) {
            eyw $$1 = $$0.bC();
            clr.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         clr.this.x(true);
         clr.this.a(awg.AV, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         clr.this.x(false);
      }

      @Override
      public boolean U_() {
         return true;
      }

      @Override
      public void a() {
         bun $$0 = clr.this.m();
         if ($$0 != null) {
            if (clr.this.cO().c($$0.cO())) {
               clr.this.E($$0);
               clr.this.x(false);
            } else {
               double $$1 = clr.this.g($$0);
               if ($$1 < 9.0) {
                  eyw $$2 = $$0.bC();
                  clr.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cdk {
      private final cfd b = cfd.b().d().e();

      public b(final buv $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return clr.this.bY != null && clr.this.bY.m() != null && this.a(clr.this.bY.m(), this.b);
      }

      @Override
      public void d() {
         clr.this.h(clr.this.bY.m());
         super.d();
      }
   }

   class c extends can {
      public c(final clr $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == can.a.b) {
            eyw $$0 = new eyw(this.e - clr.this.dx(), this.f - clr.this.dz(), this.g - clr.this.dD());
            double $$1 = $$0.g();
            if ($$1 < clr.this.cO().a()) {
               this.k = can.a.a;
               clr.this.h(clr.this.dv().c(0.5));
            } else {
               clr.this.h(clr.this.dv().e($$0.c(this.h * 0.05 / $$1)));
               if (clr.this.m() == null) {
                  eyw $$2 = clr.this.dv();
                  clr.this.v(-((float)azf.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  clr.this.aT = clr.this.dI();
               } else {
                  double $$3 = clr.this.m().dx() - clr.this.dx();
                  double $$4 = clr.this.m().dD() - clr.this.dD();
                  clr.this.v(-((float)azf.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  clr.this.aT = clr.this.dI();
               }
            }
         }
      }
   }

   class d extends cbk {
      public d() {
         this.a(EnumSet.of(cbk.a.a));
      }

      @Override
      public boolean b() {
         return !clr.this.M().b() && clr.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jf $$0 = clr.this.y();
         if ($$0 == null) {
            $$0 = clr.this.ds();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jf $$2 = $$0.b(clr.this.af.a(15) - 7, clr.this.af.a(11) - 5, clr.this.af.a(15) - 7);
            if (clr.this.dS().u($$2)) {
               clr.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (clr.this.m() == null) {
                  clr.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
