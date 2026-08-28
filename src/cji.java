import java.util.UUID;
import javax.annotation.Nullable;

public class cji extends cio implements bxe {
   private static final akh<Boolean> bF = akl.a(cji.class, akj.k);
   private static final float bG = 6.0F;
   private float bH;
   private float bJ;
   private int bK;
   private static final btj bL = bao.a(20, 39);
   private int bM;
   @Nullable
   private UUID bN;

   public cji(bwj<? extends cji> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvq a(aro $$0, bvq $$1) {
      return bwj.aU.a($$0, bwi.e);
   }

   @Override
   public boolean k(cys $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new cji.c());
      this.bC.a(1, new ceo(this, 2.0, $$0 -> $$0.n_() ? axb.F : axb.G));
      this.bC.a(4, new cdu(this, 1.25));
      this.bC.a(5, new ces(this, 1.0));
      this.bC.a(6, new ced(this, cqs.class, 6.0F));
      this.bC.a(7, new ceq(this));
      this.bD.a(1, new cji.b());
      this.bD.a(2, new cji.a());
      this.bD.a(3, new cfo<>(this, cqs.class, 10, true, false, this::a));
      this.bD.a(4, new cfo<>(this, ciz.class, 10, true, true, null));
      this.bD.a(5, new cfu<>(this, false));
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 30.0).a(byf.m, 20.0).a(byf.v, 0.25).a(byf.c, 6.0);
   }

   public static boolean c(bwj<cji> $$0, diq $$1, bwi $$2, iu $$3, azt $$4) {
      je<djs> $$5 = $$1.u($$3);
      return !$$5.a(awz.aq) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axa.cf);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(tx $$0) {
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
   protected awk u() {
      return this.n_() ? awl.vh : awl.vg;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.vj;
   }

   @Override
   protected awk l_() {
      return awl.vi;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.vk, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bK <= 0) {
         this.b(awl.vl);
         this.bK = 40;
      }
   }

   @Override
   protected void a(akl.a $$0) {
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
            this.bJ = azk.a(this.bJ + 1.0F, 0.0F, 6.0F);
         } else {
            this.bJ = azk.a(this.bJ - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bK > 0) {
         this.bK--;
      }

      if (!this.dV().C) {
         this.a((aro)this.dV(), true);
      }
   }

   @Override
   public bwd e(bxl $$0) {
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
      return azk.h($$0, this.bH, this.bJ) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      if ($$3 == null) {
         $$3 = new bvq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cfo<cqs> {
      public a() {
         super(cji.this, cqs.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cji.this.n_()) {
            return false;
         } else {
            if (super.b()) {
               for (cji $$1 : cji.this.dV().a(cji.class, cji.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cfn {
      public b() {
         super(cji.this);
      }

      @Override
      public void d() {
         super.d();
         if (cji.this.n_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bxb $$0, bwz $$1) {
         if ($$0 instanceof cji && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cef {
      public c() {
         super(cji.this, 1.25, true);
      }

      @Override
      protected void a(bwz $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cji.this.w(false);
         } else if (this.a.g((bwa)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cji.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cji.this.w(true);
               cji.this.t();
            }
         } else {
            this.h();
            cji.this.w(false);
         }
      }

      @Override
      public void e() {
         cji.this.w(false);
         super.e();
      }
   }
}
