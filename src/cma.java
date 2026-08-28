import java.util.EnumSet;
import javax.annotation.Nullable;

public class cma extends clm implements bvu {
   public static final float b = 45.836624F;
   public static final int c = azj.f((float) (Math.PI * 5.0 / 4.0));
   protected static final akk<Byte> d = ako.a(cma.class, akm.a);
   private static final int e = 1;
   @Nullable
   bux bY;
   @Nullable
   private jg bZ;
   private boolean ca;
   private int cb;

   public cma(bug<? extends cma> $$0, dev $$1) {
      super($$0, $$1);
      this.bP = new cma.c(this);
      this.bN = 3;
   }

   @Override
   public boolean bb() {
      return this.ag % c == 0;
   }

   @Override
   protected boolean aL() {
      return !this.dS();
   }

   @Override
   public void l() {
      this.ae = true;
      super.l();
      this.ae = false;
      this.f(true);
      if (this.ca && --this.cb <= 0) {
         this.cb = 20;
         this.a(this.dY().j(), 1.0F);
      }
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(4, new cma.a());
      this.bS.a(8, new cma.d());
      this.bS.a(9, new ccb(this, coh.class, 3.0F, 1.0F));
      this.bS.a(10, new ccb(this, bux.class, 8.0F));
      this.bT.a(1, new cdl(this, cpw.class).a());
      this.bT.a(2, new cma.b(this));
      this.bT.a(3, new cdm<>(this, coh.class, true));
   }

   public static bwc.a q() {
      return clm.gB().a(bwd.s, 14.0).a(bwd.c, 4.0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(d, (byte)0);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      if ($$0.e("BoundX")) {
         this.bZ = new jg($$0.h("BoundX"), $$0.h("BoundY"), $$0.h("BoundZ"));
      }

      if ($$0.e("LifeTicks")) {
         this.b($$0.h("LifeTicks"));
      }
   }

   @Override
   public void x(btz $$0) {
      super.x($$0);
      if ($$0 instanceof cma $$1) {
         this.bY = $$1.t();
      }
   }

   @Override
   public void b(uj $$0) {
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
   public bux t() {
      return this.bY;
   }

   @Nullable
   public jg y() {
      return this.bZ;
   }

   public void h(@Nullable jg $$0) {
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

   public boolean gv() {
      return this.c(1);
   }

   public void x(boolean $$0) {
      this.a(1, $$0);
   }

   public void a(bux $$0) {
      this.bY = $$0;
   }

   public void b(int $$0) {
      this.ca = true;
      this.cb = $$0;
   }

   @Override
   protected awj w() {
      return awk.AS;
   }

   @Override
   protected awj o_() {
      return awk.AU;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.AV;
   }

   @Override
   public float bz() {
      return 1.0F;
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      this.a($$4, $$1);
      this.a($$0, $$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(azr $$0, brw $$1) {
      this.a(buh.a, new cvx(cwb.pc));
      this.a(buh.a, 0.0F);
   }

   class a extends cbt {
      public a() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         buv $$0 = cma.this.m();
         return $$0 != null && $$0.bM() && !cma.this.M().b() && cma.this.af.a(b(7)) == 0 ? cma.this.g($$0) > 4.0 : false;
      }

      @Override
      public boolean c() {
         return cma.this.M().b() && cma.this.gv() && cma.this.m() != null && cma.this.m().bM();
      }

      @Override
      public void d() {
         buv $$0 = cma.this.m();
         if ($$0 != null) {
            ezh $$1 = $$0.bG();
            cma.this.bP.a($$1.d, $$1.e, $$1.f, 1.0);
         }

         cma.this.x(true);
         cma.this.a(awk.AT, 1.0F, 1.0F);
      }

      @Override
      public void e() {
         cma.this.x(false);
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         buv $$0 = cma.this.m();
         if ($$0 != null) {
            if (cma.this.cS().c($$0.cS())) {
               cma.this.E($$0);
               cma.this.x(false);
            } else {
               double $$1 = cma.this.g($$0);
               if ($$1 < 9.0) {
                  ezh $$2 = $$0.bG();
                  cma.this.bP.a($$2.d, $$2.e, $$2.f, 1.0);
               }
            }
         }
      }
   }

   class b extends cdt {
      private final cfm b = cfm.b().d().e();

      public b(final bvd $$0) {
         super($$0, false);
      }

      @Override
      public boolean b() {
         return cma.this.bY != null && cma.this.bY.m() != null && this.a(cma.this.bY.m(), this.b);
      }

      @Override
      public void d() {
         cma.this.h(cma.this.bY.m());
         super.d();
      }
   }

   class c extends caw {
      public c(final cma $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (this.k == caw.a.b) {
            ezh $$0 = new ezh(this.e - cma.this.dC(), this.f - cma.this.dE(), this.g - cma.this.dI());
            double $$1 = $$0.g();
            if ($$1 < cma.this.cS().a()) {
               this.k = caw.a.a;
               cma.this.h(cma.this.dA().c(0.5));
            } else {
               cma.this.h(cma.this.dA().e($$0.c(this.h * 0.05 / $$1)));
               if (cma.this.m() == null) {
                  ezh $$2 = cma.this.dA();
                  cma.this.v(-((float)azj.d($$2.d, $$2.f)) * (180.0F / (float)Math.PI));
                  cma.this.aU = cma.this.dN();
               } else {
                  double $$3 = cma.this.m().dC() - cma.this.dC();
                  double $$4 = cma.this.m().dI() - cma.this.dI();
                  cma.this.v(-((float)azj.d($$3, $$4)) * (180.0F / (float)Math.PI));
                  cma.this.aU = cma.this.dN();
               }
            }
         }
      }
   }

   class d extends cbt {
      public d() {
         this.a(EnumSet.of(cbt.a.a));
      }

      @Override
      public boolean b() {
         return !cma.this.M().b() && cma.this.af.a(b(7)) == 0;
      }

      @Override
      public boolean c() {
         return false;
      }

      @Override
      public void a() {
         jg $$0 = cma.this.y();
         if ($$0 == null) {
            $$0 = cma.this.dx();
         }

         for (int $$1 = 0; $$1 < 3; $$1++) {
            jg $$2 = $$0.b(cma.this.af.a(15) - 7, cma.this.af.a(11) - 5, cma.this.af.a(15) - 7);
            if (cma.this.dX().u($$2)) {
               cma.this.bP.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 0.25);
               if (cma.this.m() == null) {
                  cma.this.K().a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, 180.0F, 20.0F);
               }
               break;
            }
         }
      }
   }
}
