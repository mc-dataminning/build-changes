import java.util.UUID;
import javax.annotation.Nullable;

public class cjo extends cis implements bxh {
   private static final akj<Boolean> bF = akn.a(cjo.class, akl.k);
   private static final float bG = 6.0F;
   private float bH;
   private float bJ;
   private int bK;
   private static final btm bL = baq.a(20, 39);
   private int bM;
   @Nullable
   private UUID bN;

   public cjo(bwm<? extends cjo> $$0, div $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvt a(arq $$0, bvt $$1) {
      return bwm.aU.a($$0, bwl.e);
   }

   @Override
   public boolean j(cyy $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cjo.c());
      this.bC.a(1, new cer(this, 2.0, $$0 -> $$0.n_() ? axd.F : axd.G));
      this.bC.a(4, new cdx(this, 1.25));
      this.bC.a(5, new cev(this, 1.0));
      this.bC.a(6, new ceg(this, cqy.class, 6.0F));
      this.bC.a(7, new cet(this));
      this.bD.a(1, new cjo.b());
      this.bD.a(2, new cjo.a());
      this.bD.a(3, new cfr<>(this, cqy.class, 10, true, false, this::a));
      this.bD.a(4, new cfr<>(this, cjf.class, 10, true, true, null));
      this.bD.a(5, new cfx<>(this, false));
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 30.0).a(byi.m, 20.0).a(byi.v, 0.25).a(byi.c, 6.0);
   }

   public static boolean c(bwm<cjo> $$0, diw $$1, bwl $$2, iu $$3, azv $$4) {
      je<djy> $$5 = $$1.u($$3);
      return !$$5.a(axb.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axc.cf);
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(tz $$0) {
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
   protected awm u() {
      return this.n_() ? awn.vi : awn.vh;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.vk;
   }

   @Override
   protected awm l_() {
      return awn.vj;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.vl, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bK <= 0) {
         this.b(awn.vm);
         this.bK = 40;
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.bJ != this.bH) {
            this.i_();
         }

         this.bH = this.bJ;
         if (this.x()) {
            this.bJ = azm.a(this.bJ + 1.0F, 0.0F, 6.0F);
         } else {
            this.bJ = azm.a(this.bJ - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bK > 0) {
         this.bK--;
      }

      if (!this.dV().C) {
         this.a((arq)this.dV(), true);
      }
   }

   @Override
   public bwg e(bxo $$0) {
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

   public float J(float $$0) {
      return azm.h($$0, this.bH, this.bJ) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      if ($$3 == null) {
         $$3 = new bvt.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cfr<cqy> {
      public a() {
         super(cjo.this, cqy.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cjo.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cjo $$1 : cjo.this.dV().a(cjo.class, cjo.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cfq {
      public b() {
         super(cjo.this);
      }

      @Override
      public void d() {
         super.d();
         if (cjo.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxe $$0, bxc $$1) {
         if ($$0 instanceof cjo && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cei {
      public c() {
         super(cjo.this, 1.25, true);
      }

      @Override
      protected void a(bxc $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cjo.this.w(false);
         } else if (this.a.g((bwd)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cjo.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cjo.this.w(true);
               cjo.this.t();
            }
         } else {
            this.h();
            cjo.this.w(false);
         }
      }

      @Override
      public void e() {
         cjo.this.w(false);
         super.e();
      }
   }
}
