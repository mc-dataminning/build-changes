import java.util.UUID;
import javax.annotation.Nullable;

public class cjx extends ciz implements bxo {
   private static final akj<Boolean> bG = akn.a(cjx.class, akl.k);
   private static final float bH = 6.0F;
   private float bI;
   private float bK;
   private int bL;
   private static final btr bM = baq.a(20, 39);
   private int bN;
   @Nullable
   private UUID bO;

   public cjx(bwr<? extends cjx> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvy a(arq $$0, bvy $$1) {
      return bwr.aU.a($$0, bwq.e);
   }

   @Override
   public boolean i(czn $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cjx.c());
      this.bD.a(1, new cey(this, 2.0, $$0 -> $$0.n_() ? axd.F : axd.G));
      this.bD.a(4, new cee(this, 1.25));
      this.bD.a(5, new cfc(this, 1.0));
      this.bD.a(6, new cen(this, crm.class, 6.0F));
      this.bD.a(7, new cfa(this));
      this.bE.a(1, new cjx.b());
      this.bE.a(2, new cjx.a());
      this.bE.a(3, new cfy<>(this, crm.class, 10, true, false, this::a));
      this.bE.a(4, new cfy<>(this, cjo.class, 10, true, true, null));
      this.bE.a(5, new cge<>(this, false));
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 30.0).a(byp.m, 20.0).a(byp.v, 0.25).a(byp.c, 6.0);
   }

   public static boolean c(bwr<cjx> $$0, djn $$1, bwq $$2, iv $$3, azv $$4) {
      jf<dkp> $$5 = $$1.u($$3);
      return !$$5.a(axb.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axc.cg);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(bM.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.bN = $$0;
   }

   @Override
   public int a() {
      return this.bN;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.bO;
   }

   @Override
   protected awm u() {
      return this.n_() ? awn.vl : awn.vk;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.vn;
   }

   @Override
   protected awm l_() {
      return awn.vm;
   }

   @Override
   protected void b(iv $$0, eat $$1) {
      this.a(awn.vo, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bL <= 0) {
         this.b(awn.vp);
         this.bL = 40;
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C) {
         if (this.bK != this.bI) {
            this.i_();
         }

         this.bI = this.bK;
         if (this.x()) {
            this.bK = azm.a(this.bK + 1.0F, 0.0F, 6.0F);
         } else {
            this.bK = azm.a(this.bK - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bL > 0) {
         this.bL--;
      }

      if (!this.dU().C) {
         this.a((arq)this.dU(), true);
      }
   }

   @Override
   public bwl e(bxv $$0) {
      if (this.bK > 0.0F) {
         float $$1 = this.bK / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bG);
   }

   public void w(boolean $$0) {
      this.al.a(bG, $$0);
   }

   public float J(float $$0) {
      return azm.h($$0, this.bI, this.bK) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      if ($$3 == null) {
         $$3 = new bvy.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cfy<crm> {
      public a() {
         super(cjx.this, crm.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cjx.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cjx $$1 : cjx.this.dU().a(cjx.class, cjx.this.cQ().c(8.0, 4.0, 8.0))) {
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

   class b extends cfx {
      public b() {
         super(cjx.this);
      }

      @Override
      public void d() {
         super.d();
         if (cjx.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxl $$0, bxj $$1) {
         if ($$0 instanceof cjx && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cep {
      public c() {
         super(cjx.this, 1.25, true);
      }

      @Override
      protected void a(bxj $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjx.this.w(false);
         } else if (this.a.g((bwi)$$0) < (double)(($$0.dp() + 3.0F) * ($$0.dp() + 3.0F))) {
            if (this.i()) {
               cjx.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cjx.this.w(true);
               cjx.this.t();
            }
         } else {
            this.h();
            cjx.this.w(false);
         }
      }

      @Override
      public void e() {
         cjx.this.w(false);
         super.e();
      }
   }
}
