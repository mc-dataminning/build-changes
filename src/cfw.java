import java.util.UUID;
import javax.annotation.Nullable;

public class cfw extends cfe implements btt {
   private static final ajw<Boolean> ca = aka.a(cfw.class, ajy.k);
   private static final float cb = 6.0F;
   private float cc;
   private float ce;
   private int cf;
   private static final bqc cg = azp.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cfw(bsx<? extends cfw> $$0, dcw $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsl a(aqu $$0, bsl $$1) {
      return bsx.aD.a((dcw)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bU.a(0, new cag(this));
      this.bU.a(1, new cfw.c());
      this.bU.a(1, new cbf(this, 2.0, $$0 -> $$0.o_() ? awg.F : awg.G));
      this.bU.a(4, new cal(this, 1.25));
      this.bU.a(5, new cbj(this, 1.0));
      this.bU.a(6, new cau(this, cmx.class, 6.0F));
      this.bU.a(7, new cbh(this));
      this.bV.a(1, new cfw.b());
      this.bV.a(2, new cfw.a());
      this.bV.a(3, new ccf<>(this, cmx.class, 10, true, false, this::a_));
      this.bV.a(4, new ccf<>(this, cfo.class, 10, true, true, null));
      this.bV.a(5, new ccl<>(this, false));
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 30.0).a(buw.m, 20.0).a(buw.v, 0.25).a(buw.c, 6.0);
   }

   public static boolean c(bsx<cfw> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      jm<ddw> $$5 = $$1.t($$3);
      return !$$5.a(awd.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awe.cc);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   protected avo v() {
      return this.o_() ? avp.ux : avp.uw;
   }

   @Override
   protected avo d(brk $$0) {
      return avp.uz;
   }

   @Override
   protected avo n_() {
      return avp.uy;
   }

   @Override
   protected void b(jd $$0, dtc $$1) {
      this.a(avp.uA, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cf <= 0) {
         this.b(avp.uB);
         this.cf = 40;
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B) {
         if (this.ce != this.cc) {
            this.i_();
         }

         this.cc = this.ce;
         if (this.x()) {
            this.ce = ayo.a(this.ce + 1.0F, 0.0F, 6.0F);
         } else {
            this.ce = ayo.a(this.ce - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (!this.dP().B) {
         this.a((aqu)this.dP(), true);
      }
   }

   @Override
   public bsu e(bua $$0) {
      if (this.ce > 0.0F) {
         float $$1 = this.ce / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.ao.a(ca);
   }

   public void w(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.cc, this.ce) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public buh a(ddl $$0, bqp $$1, btr $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccf<cmx> {
      public a() {
         super(cfw.this, cmx.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cfw.this.o_()) {
            return false;
         } else {
            if (super.b()) {
               for (cfw $$1 : cfw.this.dP().a(cfw.class, cfw.this.cL().c(8.0, 4.0, 8.0))) {
                  if ($$1.o_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends cce {
      public b() {
         super(cfw.this);
      }

      @Override
      public void d() {
         super.d();
         if (cfw.this.o_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(btp $$0, btn $$1) {
         if ($$0 instanceof cfw && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends caw {
      public c() {
         super(cfw.this, 1.25, true);
      }

      @Override
      protected void a(btn $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfw.this.w(false);
         } else if (this.a.g((bsr)$$0) < (double)(($$0.dk() + 3.0F) * ($$0.dk() + 3.0F))) {
            if (this.i()) {
               cfw.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfw.this.w(true);
               cfw.this.t();
            }
         } else {
            this.h();
            cfw.this.w(false);
         }
      }

      @Override
      public void e() {
         cfw.this.w(false);
         super.e();
      }
   }
}
