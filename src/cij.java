import java.util.UUID;
import javax.annotation.Nullable;

public class cij extends chp implements bwd {
   private static final ajx<Boolean> bF = akb.a(cij.class, ajz.k);
   private static final float bG = 6.0F;
   private float bH;
   private float bJ;
   private int bK;
   private static final bsj bL = bab.a(20, 39);
   private int bM;
   @Nullable
   private UUID bN;

   public cij(bvi<? extends cij> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public buq a(ard $$0, buq $$1) {
      return bvi.aU.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxh $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cij.c());
      this.bC.a(1, new cdp(this, 2.0, $$0 -> $$0.n_() ? awr.F : awr.G));
      this.bC.a(4, new ccv(this, 1.25));
      this.bC.a(5, new cdt(this, 1.0));
      this.bC.a(6, new cde(this, cpr.class, 6.0F));
      this.bC.a(7, new cdr(this));
      this.bD.a(1, new cij.b());
      this.bD.a(2, new cij.a());
      this.bD.a(3, new cep<>(this, cpr.class, 10, true, false, this::a));
      this.bD.a(4, new cep<>(this, chz.class, 10, true, true, null));
      this.bD.a(5, new cev<>(this, false));
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 30.0).a(bxg.m, 20.0).a(bxg.v, 0.25).a(bxg.c, 6.0);
   }

   public static boolean c(bvi<cij> $$0, dha $$1, bvh $$2, ji $$3, azh $$4) {
      jr<dic> $$5 = $$1.t($$3);
      return !$$5.a(awo.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awp.cf);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(bL.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bM = $$0;
   }

   @Override
   public int a() {
      return this.bM;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bN = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bN;
   }

   @Override
   protected avz u() {
      return this.n_() ? awa.vh : awa.vg;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.vj;
   }

   @Override
   protected avz l_() {
      return awa.vi;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.vk, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bK <= 0) {
         this.b(awa.vl);
         this.bK = 40;
      }
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         if (this.bJ != this.bH) {
            this.i_();
         }

         this.bH = this.bJ;
         if (this.x()) {
            this.bJ = ayz.a(this.bJ + 1.0F, 0.0F, 6.0F);
         } else {
            this.bJ = ayz.a(this.bJ - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bK > 0) {
         this.bK--;
      }

      if (!this.dU().C) {
         this.a((ard)this.dU(), true);
      }
   }

   @Override
   public bvd e(bwk $$0) {
      if (this.bJ > 0.0F) {
         float $$1 = this.bJ / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bF);
   }

   public void w(boolean $$0) {
      this.al.a(bF, $$0);
   }

   public float K(float $$0) {
      return ayz.h($$0, this.bH, this.bJ) / 6.0F;
   }

   @Override
   protected float fm() {
      return 0.98F;
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      if ($$3 == null) {
         $$3 = new buq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cep<cpr> {
      public a() {
         super(cij.this, cpr.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cij.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cij $$1 : cij.this.dU().a(cij.class, cij.this.cQ().c(8.0, 4.0, 8.0))) {
                  if ($$1.n_()) {
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

   class b extends ceo {
      public b() {
         super(cij.this);
      }

      @Override
      public void d() {
         super.d();
         if (cij.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bwa $$0, bvy $$1) {
         if ($$0 instanceof cij && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdg {
      public c() {
         super(cij.this, 1.25, true);
      }

      @Override
      protected void a(bvy $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cij.this.w(false);
         } else if (this.a.g((bva)$$0) < (double)(($$0.dp() + 3.0F) * ($$0.dp() + 3.0F))) {
            if (this.i()) {
               cij.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cij.this.w(true);
               cij.this.t();
            }
         } else {
            this.h();
            cij.this.w(false);
         }
      }

      @Override
      public void e() {
         cij.this.w(false);
         super.e();
      }
   }
}
