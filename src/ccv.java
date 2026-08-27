import java.util.UUID;
import javax.annotation.Nullable;

public class ccv extends ccd implements bqu {
   private static final aiy<Boolean> bX = ajc.a(ccv.class, aja.k);
   private static final float bY = 6.0F;
   private float ca;
   private float cb;
   private int cc;
   private static final bnl cd = ayj.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public ccv(bqb<? extends ccv> $$0, cyx $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bpp a(aps $$0, bpp $$1) {
      return bqb.aC.a((cyx)$$0);
   }

   @Override
   public boolean o(crj $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxf(this));
      this.bR.a(1, new ccv.c());
      this.bR.a(1, new ccv.d());
      this.bR.a(4, new bxk(this, 1.25));
      this.bR.a(5, new byi(this, 1.0));
      this.bR.a(6, new bxt(this, cjt.class, 6.0F));
      this.bR.a(7, new byg(this));
      this.bS.a(1, new ccv.b());
      this.bS.a(2, new ccv.a());
      this.bS.a(3, new bze<>(this, cjt.class, 10, true, false, this::a_));
      this.bS.a(4, new bze<>(this, ccn.class, 10, true, true, null));
      this.bS.a(5, new bzk<>(this, false));
   }

   public static bru.a r() {
      return bqq.A().a(brv.q, 30.0).a(brv.k, 20.0).a(brv.r, 0.25).a(brv.c, 6.0);
   }

   public static boolean c(bqb<ccv> $$0, cyy $$1, bqs $$2, ib $$3, axr $$4) {
      il<czw> $$5 = $$1.t($$3);
      return !$$5.a(avb.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avc.bW);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cd.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ce = $$0;
   }

   @Override
   public int a() {
      return this.ce;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cf = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cf;
   }

   @Override
   protected aul v() {
      return this.p_() ? aum.ub : aum.ua;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.ud;
   }

   @Override
   protected aul o_() {
      return aum.uc;
   }

   @Override
   protected void b(ib $$0, doz $$1) {
      this.a(aum.ue, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cc <= 0) {
         this.b(aum.uf);
         this.cc = 40;
      }
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(bX, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.cb != this.ca) {
            this.j_();
         }

         this.ca = this.cb;
         if (this.y()) {
            this.cb = axk.a(this.cb + 1.0F, 0.0F, 6.0F);
         } else {
            this.cb = axk.a(this.cb - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cc > 0) {
         this.cc--;
      }

      if (!this.dM().B) {
         this.a((aps)this.dM(), true);
      }
   }

   @Override
   public bpy e(bqz $$0) {
      if (this.cb > 0.0F) {
         float $$1 = this.cb / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bpv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bqo)this), (float)((int)this.g(brv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean y() {
      return this.an.a(bX);
   }

   public void w(boolean $$0) {
      this.an.a(bX, $$0);
   }

   public float G(float $$0) {
      return axk.i($$0, this.ca, this.cb) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      if ($$3 == null) {
         $$3 = new bpp.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends bze<cjt> {
      public a() {
         super(ccv.this, cjt.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (ccv.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (ccv $$1 : ccv.this.dM().a(ccv.class, ccv.this.cH().c(8.0, 4.0, 8.0))) {
                  if ($$1.p_()) {
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

   class b extends bzd {
      public b() {
         super(ccv.this);
      }

      @Override
      public void c() {
         super.c();
         if (ccv.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bqq $$0, bqo $$1) {
         if ($$0 instanceof ccv && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bxv {
      public c() {
         super(ccv.this, 1.25, true);
      }

      @Override
      protected void a(bqo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            ccv.this.w(false);
         } else if (this.a.g((bpv)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               ccv.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               ccv.this.w(true);
               ccv.this.u();
            }
         } else {
            this.h();
            ccv.this.w(false);
         }
      }

      @Override
      public void d() {
         ccv.this.w(false);
         super.d();
      }
   }

   class d extends bye {
      public d() {
         super(ccv.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ej() != null && this.b.p_() || this.b.bN();
      }
   }
}
