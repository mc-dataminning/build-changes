import java.util.UUID;
import javax.annotation.Nullable;

public class cfu extends cfc implements btr {
   private static final ajv<Boolean> ca = ajz.a(cfu.class, ajx.k);
   private static final float cb = 6.0F;
   private float cc;
   private float ce;
   private int cf;
   private static final bqb cg = azo.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cfu(bsw<? extends cfu> $$0, dcu $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsk a(aqt $$0, bsk $$1) {
      return bsw.aD.a((dcu)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new cae(this));
      this.bU.a(1, new cfu.c());
      this.bU.a(1, new cbd(this, 2.0, $$0 -> $$0.o_() ? awf.F : awf.G));
      this.bU.a(4, new caj(this, 1.25));
      this.bU.a(5, new cbh(this, 1.0));
      this.bU.a(6, new cas(this, cmv.class, 6.0F));
      this.bU.a(7, new cbf(this));
      this.bV.a(1, new cfu.b());
      this.bV.a(2, new cfu.a());
      this.bV.a(3, new ccd<>(this, cmv.class, 10, true, false, this::a_));
      this.bV.a(4, new ccd<>(this, cfm.class, 10, true, true, null));
      this.bV.a(5, new ccj<>(this, false));
   }

   public static but.a s() {
      return btn.A().a(buu.s, 30.0).a(buu.m, 20.0).a(buu.v, 0.25).a(buu.c, 6.0);
   }

   public static boolean c(bsw<cfu> $$0, dcv $$1, btp $$2, jd $$3, ayv $$4) {
      jm<ddu> $$5 = $$1.t($$3);
      return !$$5.a(awc.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awd.cc);
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      this.a(this.dQ(), $$0);
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      this.c($$0);
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
   protected avn v() {
      return this.o_() ? avo.ux : avo.uw;
   }

   @Override
   protected avn d(brj $$0) {
      return avo.uz;
   }

   @Override
   protected avn n_() {
      return avo.uy;
   }

   @Override
   protected void b(jd $$0, dta $$1) {
      this.a(avo.uA, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cf <= 0) {
         this.b(avo.uB);
         this.cf = 40;
      }
   }

   @Override
   protected void a(ajz.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dQ().B) {
         if (this.ce != this.cc) {
            this.i_();
         }

         this.cc = this.ce;
         if (this.x()) {
            this.ce = ayn.a(this.ce + 1.0F, 0.0F, 6.0F);
         } else {
            this.ce = ayn.a(this.ce - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (!this.dQ().B) {
         this.a((aqt)this.dQ(), true);
      }
   }

   @Override
   public bst e(bty $$0) {
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
      return ayn.i($$0, this.cc, this.ce) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public buf a(ddj $$0, bqo $$1, btp $$2, @Nullable buf $$3) {
      if ($$3 == null) {
         $$3 = new bsk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccd<cmv> {
      public a() {
         super(cfu.this, cmv.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cfu.this.o_()) {
            return false;
         } else {
            if (super.b()) {
               for (cfu $$1 : cfu.this.dQ().a(cfu.class, cfu.this.cL().c(8.0, 4.0, 8.0))) {
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

   class b extends ccc {
      public b() {
         super(cfu.this);
      }

      @Override
      public void d() {
         super.d();
         if (cfu.this.o_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(btn $$0, btl $$1) {
         if ($$0 instanceof cfu && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cau {
      public c() {
         super(cfu.this, 1.25, true);
      }

      @Override
      protected void a(btl $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfu.this.w(false);
         } else if (this.a.g((bsq)$$0) < (double)(($$0.dk() + 3.0F) * ($$0.dk() + 3.0F))) {
            if (this.i()) {
               cfu.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfu.this.w(true);
               cfu.this.t();
            }
         } else {
            this.h();
            cfu.this.w(false);
         }
      }

      @Override
      public void e() {
         cfu.this.w(false);
         super.e();
      }
   }
}
