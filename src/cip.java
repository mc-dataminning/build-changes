import java.util.UUID;
import javax.annotation.Nullable;

public class cip extends chx implements bwl {
   private static final alc<Boolean> bZ = alg.a(cip.class, ale.k);
   private static final float ca = 6.0F;
   private float cb;
   private float cd;
   private int ce;
   private static final bsu cf = bbg.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cip(bvr<? extends cip> $$0, dhi $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bvb a(ash $$0, bvb $$1) {
      return bvr.aV.a($$0, bvq.e);
   }

   @Override
   public boolean j(cxp $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccy(this));
      this.bT.a(1, new cip.c());
      this.bT.a(1, new cdx(this, 2.0, $$0 -> $$0.e_() ? axw.F : axw.G));
      this.bT.a(4, new cdd(this, 1.25));
      this.bT.a(5, new ceb(this, 1.0));
      this.bT.a(6, new cdm(this, cpx.class, 6.0F));
      this.bT.a(7, new cdz(this));
      this.bU.a(1, new cip.b());
      this.bU.a(2, new cip.a());
      this.bU.a(3, new cex<>(this, cpx.class, 10, true, false, this::a));
      this.bU.a(4, new cex<>(this, cih.class, 10, true, true, null));
      this.bU.a(5, new cfd<>(this, false));
   }

   public static bxn.a p() {
      return chx.gt().a(bxo.s, 30.0).a(bxo.m, 20.0).a(bxo.v, 0.25).a(bxo.c, 6.0);
   }

   public static boolean c(bvr<cip> $$0, dhj $$1, bvq $$2, jh $$3, bam $$4) {
      jq<dik> $$5 = $$1.t($$3);
      return !$$5.a(axt.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axu.ce);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(this.dW(), $$0);
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   protected axe u() {
      return this.e_() ? axf.uR : axf.uQ;
   }

   @Override
   protected axe e(bua $$0) {
      return axf.uT;
   }

   @Override
   protected axe o_() {
      return axf.uS;
   }

   @Override
   protected void b(jh $$0, dxv $$1) {
      this.a(axf.uU, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.ce <= 0) {
         this.b(axf.uV);
         this.ce = 40;
      }
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         if (this.cd != this.cb) {
            this.m_();
         }

         this.cb = this.cd;
         if (this.x()) {
            this.cd = bae.a(this.cd + 1.0F, 0.0F, 6.0F);
         } else {
            this.cd = bae.a(this.cd - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (!this.dW().C) {
         this.a((ash)this.dW(), true);
      }
   }

   @Override
   public bvn e(bws $$0) {
      if (this.cd > 0.0F) {
         float $$1 = this.cd / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bZ);
   }

   public void x(boolean $$0) {
      this.al.a(bZ, $$0);
   }

   public float J(float $$0) {
      return bae.h($$0, this.cb, this.cd) / 6.0F;
   }

   @Override
   protected float fm() {
      return 0.98F;
   }

   @Override
   public bwz a(dhz $$0, bth $$1, bvq $$2, @Nullable bwz $$3) {
      if ($$3 == null) {
         $$3 = new bvb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cex<cpx> {
      public a() {
         super(cip.this, cpx.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cip.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (cip $$1 : cip.this.dW().a(cip.class, cip.this.cR().c(8.0, 4.0, 8.0))) {
                  if ($$1.e_()) {
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

   class b extends cew {
      public b() {
         super(cip.this);
      }

      @Override
      public void d() {
         super.d();
         if (cip.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bwi $$0, bwg $$1) {
         if ($$0 instanceof cip && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdo {
      public c() {
         super(cip.this, 1.25, true);
      }

      @Override
      protected void a(bwg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cip.this.x(false);
         } else if (this.a.g((bvk)$$0) < (double)(($$0.dr() + 3.0F) * ($$0.dr() + 3.0F))) {
            if (this.i()) {
               cip.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cip.this.x(true);
               cip.this.t();
            }
         } else {
            this.h();
            cip.this.x(false);
         }
      }

      @Override
      public void e() {
         cip.this.x(false);
         super.e();
      }
   }
}
