import java.util.UUID;
import javax.annotation.Nullable;

public class cfw extends cfe implements btt {
   private static final ajw<Boolean> cc = aka.a(cfw.class, ajy.k);
   private static final float cd = 6.0F;
   private float ce;
   private float cg;
   private int ch;
   private static final bqc ci = azp.a(20, 39);
   private int cj;
   @Nullable
   private UUID ck;

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
      this.bW.a(0, new cag(this));
      this.bW.a(1, new cfw.c());
      this.bW.a(1, new cbf(this, 2.0, $$0 -> $$0.o_() ? awg.F : awg.G));
      this.bW.a(4, new cal(this, 1.25));
      this.bW.a(5, new cbj(this, 1.0));
      this.bW.a(6, new cau(this, cmx.class, 6.0F));
      this.bW.a(7, new cbh(this));
      this.bX.a(1, new cfw.b());
      this.bX.a(2, new cfw.a());
      this.bX.a(3, new ccf<>(this, cmx.class, 10, true, false, this::a_));
      this.bX.a(4, new ccf<>(this, cfo.class, 10, true, true, null));
      this.bX.a(5, new ccl<>(this, false));
   }

   public static buv.a s() {
      return btp.C().a(buw.s, 30.0).a(buw.m, 20.0).a(buw.v, 0.25).a(buw.c, 6.0);
   }

   public static boolean c(bsx<cfw> $$0, dcx $$1, btr $$2, jd $$3, ayw $$4) {
      jm<ddw> $$5 = $$1.t($$3);
      return !$$5.a(awd.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awe.cd);
   }

   @Override
   public void a(ub $$0) {
      super.a($$0);
      this.a(this.dO(), $$0);
   }

   @Override
   public void b(ub $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ci.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.cj = $$0;
   }

   @Override
   public int a() {
      return this.cj;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ck = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ck;
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
      if (this.ch <= 0) {
         this.b(avp.uB);
         this.ch = 40;
      }
   }

   @Override
   protected void a(aka.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dO().B) {
         if (this.cg != this.ce) {
            this.i_();
         }

         this.ce = this.cg;
         if (this.x()) {
            this.cg = ayo.a(this.cg + 1.0F, 0.0F, 6.0F);
         } else {
            this.cg = ayo.a(this.cg - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ch > 0) {
         this.ch--;
      }

      if (!this.dO().B) {
         this.a((aqu)this.dO(), true);
      }
   }

   @Override
   public bsu e(bua $$0) {
      if (this.cg > 0.0F) {
         float $$1 = this.cg / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.ao.a(cc);
   }

   public void x(boolean $$0) {
      this.ao.a(cc, $$0);
   }

   public float H(float $$0) {
      return ayo.i($$0, this.ce, this.cg) / 6.0F;
   }

   @Override
   protected float fh() {
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
               for (cfw $$1 : cfw.this.dO().a(cfw.class, cfw.this.cK().c(8.0, 4.0, 8.0))) {
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
            cfw.this.x(false);
         } else if (this.a.g((bsr)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfw.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfw.this.x(true);
               cfw.this.t();
            }
         } else {
            this.h();
            cfw.this.x(false);
         }
      }

      @Override
      public void e() {
         cfw.this.x(false);
         super.e();
      }
   }
}
