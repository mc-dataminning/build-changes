import java.util.UUID;
import javax.annotation.Nullable;

public class cio extends chw implements bwk {
   private static final alc<Boolean> bZ = alg.a(cio.class, ale.k);
   private static final float ca = 6.0F;
   private float cb;
   private float cd;
   private int ce;
   private static final bst cf = bbg.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cio(bvq<? extends cio> $$0, dhh $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bva a(ash $$0, bva $$1) {
      return bvq.aV.a($$0, bvp.e);
   }

   @Override
   public boolean j(cxo $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bT.a(0, new ccx(this));
      this.bT.a(1, new cio.c());
      this.bT.a(1, new cdw(this, 2.0, $$0 -> $$0.e_() ? axw.F : axw.G));
      this.bT.a(4, new cdc(this, 1.25));
      this.bT.a(5, new cea(this, 1.0));
      this.bT.a(6, new cdl(this, cpw.class, 6.0F));
      this.bT.a(7, new cdy(this));
      this.bU.a(1, new cio.b());
      this.bU.a(2, new cio.a());
      this.bU.a(3, new cew<>(this, cpw.class, 10, true, false, this::a));
      this.bU.a(4, new cew<>(this, cig.class, 10, true, true, null));
      this.bU.a(5, new cfc<>(this, false));
   }

   public static bxm.a p() {
      return chw.gr().a(bxn.s, 30.0).a(bxn.m, 20.0).a(bxn.v, 0.25).a(bxn.c, 6.0);
   }

   public static boolean c(bvq<cio> $$0, dhi $$1, bvp $$2, jh $$3, bam $$4) {
      jq<dij> $$5 = $$1.t($$3);
      return !$$5.a(axt.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axu.ce);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
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
   protected axe e(btz $$0) {
      return axf.uT;
   }

   @Override
   protected axe o_() {
      return axf.uS;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
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
      if (this.dV().C) {
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

      if (!this.dV().C) {
         this.a((ash)this.dV(), true);
      }
   }

   @Override
   public bvm e(bwr $$0) {
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
   protected float fk() {
      return 0.98F;
   }

   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      if ($$3 == null) {
         $$3 = new bva.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cew<cpw> {
      public a() {
         super(cio.this, cpw.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cio.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (cio $$1 : cio.this.dV().a(cio.class, cio.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cev {
      public b() {
         super(cio.this);
      }

      @Override
      public void d() {
         super.d();
         if (cio.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bwh $$0, bwf $$1) {
         if ($$0 instanceof cio && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cdn {
      public c() {
         super(cio.this, 1.25, true);
      }

      @Override
      protected void a(bwf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            cio.this.x(false);
         } else if (this.a.g((bvj)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               cio.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cio.this.x(true);
               cio.this.t();
            }
         } else {
            this.h();
            cio.this.x(false);
         }
      }

      @Override
      public void e() {
         cio.this.x(false);
         super.e();
      }
   }
}
