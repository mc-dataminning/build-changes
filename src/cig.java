import java.util.UUID;
import javax.annotation.Nullable;

public class cig extends cho implements bwc {
   private static final aks<Boolean> bZ = akw.a(cig.class, aku.k);
   private static final float ca = 6.0F;
   private float cb;
   private float cd;
   private int ce;
   private static final bsl cf = baw.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cig(bvi<? extends cig> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.aV.a($$0, bvh.e);
   }

   @Override
   public boolean j(cxg $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccp(this));
      this.bT.a(1, new cig.c());
      this.bT.a(1, new cdo(this, 2.0, $$0 -> $$0.e_() ? axm.F : axm.G));
      this.bT.a(4, new ccu(this, 1.25));
      this.bT.a(5, new cds(this, 1.0));
      this.bT.a(6, new cdd(this, cpo.class, 6.0F));
      this.bT.a(7, new cdq(this));
      this.bU.a(1, new cig.b());
      this.bU.a(2, new cig.a());
      this.bU.a(3, new ceo<>(this, cpo.class, 10, true, false, this::a));
      this.bU.a(4, new ceo<>(this, chy.class, 10, true, true, null));
      this.bU.a(5, new ceu<>(this, false));
   }

   public static bxe.a p() {
      return cho.gt().a(bxf.s, 30.0).a(bxf.m, 20.0).a(bxf.v, 0.25).a(bxf.c, 6.0);
   }

   public static boolean c(bvi<cig> $$0, dha $$1, bvh $$2, jh $$3, bac $$4) {
      jq<dib> $$5 = $$1.t($$3);
      return !$$5.a(axj.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axk.ce);
   }

   @Override
   public void a(um $$0) {
      super.a($$0);
      this.a(this.dW(), $$0);
   }

   @Override
   public void b(um $$0) {
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
   protected awu u() {
      return this.e_() ? awv.uX : awv.uW;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.uZ;
   }

   @Override
   protected awu o_() {
      return awv.uY;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.va, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.ce <= 0) {
         this.b(awv.vb);
         this.ce = 40;
      }
   }

   @Override
   protected void a(akw.a $$0) {
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
            this.cd = azu.a(this.cd + 1.0F, 0.0F, 6.0F);
         } else {
            this.cd = azu.a(this.cd - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (!this.dW().C) {
         this.a((arx)this.dW(), true);
      }
   }

   @Override
   public bve e(bwj $$0) {
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
      return azu.h($$0, this.cb, this.cd) / 6.0F;
   }

   @Override
   protected float fm() {
      return 0.98F;
   }

   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      if ($$3 == null) {
         $$3 = new bus.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ceo<cpo> {
      public a() {
         super(cig.this, cpo.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cig.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (cig $$1 : cig.this.dW().a(cig.class, cig.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cen {
      public b() {
         super(cig.this);
      }

      @Override
      public void d() {
         super.d();
         if (cig.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvz $$0, bvx $$1) {
         if ($$0 instanceof cig && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdf {
      public c() {
         super(cig.this, 1.25, true);
      }

      @Override
      protected void a(bvx $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cig.this.x(false);
         } else if (this.a.g((bvb)$$0) < (double)(($$0.dr() + 3.0F) * ($$0.dr() + 3.0F))) {
            if (this.i()) {
               cig.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cig.this.x(true);
               cig.this.t();
            }
         } else {
            this.h();
            cig.this.x(false);
         }
      }

      @Override
      public void e() {
         cig.this.x(false);
         super.e();
      }
   }
}
