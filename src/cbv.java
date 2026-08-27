import java.util.UUID;
import javax.annotation.Nullable;

public class cbv extends cbd implements bpu {
   private static final aim<Boolean> bX = aiq.a(cbv.class, aio.k);
   private static final float bY = 6.0F;
   private float ca;
   private float cb;
   private int cc;
   private static final bmn cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cbv(bpc<? extends cbv> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bor a(apf $$0, bor $$1) {
      return bpc.aC.a((cwz)$$0);
   }

   @Override
   public boolean o(cqk $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new cbv.c());
      this.bR.a(1, new cbv.d());
      this.bR.a(4, new bwk(this, 1.25));
      this.bR.a(5, new bxi(this, 1.0));
      this.bR.a(6, new bwt(this, cis.class, 6.0F));
      this.bR.a(7, new bxg(this));
      this.bS.a(1, new cbv.b());
      this.bS.a(2, new cbv.a());
      this.bS.a(3, new bye<>(this, cis.class, 10, true, false, this::a_));
      this.bS.a(4, new bye<>(this, cbn.class, 10, true, true, null));
      this.bS.a(5, new byk<>(this, false));
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 30.0).a(bqv.k, 20.0).a(bqv.r, 0.25).a(bqv.c, 6.0);
   }

   public static boolean c(bpc<cbv> $$0, cxa $$1, bps $$2, ib $$3, axd $$4) {
      il<cxy> $$5 = $$1.t($$3);
      return !$$5.a(aum.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(aun.bW);
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(ta $$0) {
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
   protected atx v() {
      return this.o_() ? aty.tT : aty.tS;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.tV;
   }

   @Override
   protected atx n_() {
      return aty.tU;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.tW, 0.15F, 1.0F);
   }

   protected void s() {
      if (this.cc <= 0) {
         this.b(aty.tX);
         this.cc = 40;
      }
   }

   @Override
   protected void a(aiq.a $$0) {
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
            this.cb = aww.a(this.cb + 1.0F, 0.0F, 6.0F);
         } else {
            this.cb = aww.a(this.cb - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cc > 0) {
         this.cc--;
      }

      if (!this.dM().B) {
         this.a((apf)this.dM(), true);
      }
   }

   @Override
   public boz e(bpz $$0) {
      if (this.cb > 0.0F) {
         float $$1 = this.cb / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(bow $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpo)this), (float)((int)this.g(bqv.c)));
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
      return aww.i($$0, this.ca, this.cb) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public bqg a(cxo $$0, bna $$1, bps $$2, @Nullable bqg $$3) {
      if ($$3 == null) {
         $$3 = new bor.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends bye<cis> {
      public a() {
         super(cbv.this, cis.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cbv.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cbv $$1 : cbv.this.dM().a(cbv.class, cbv.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends byd {
      public b() {
         super(cbv.this);
      }

      @Override
      public void c() {
         super.c();
         if (cbv.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bpq $$0, bpo $$1) {
         if ($$0 instanceof cbv && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bwv {
      public c() {
         super(cbv.this, 1.25, true);
      }

      @Override
      protected void a(bpo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cbv.this.w(false);
         } else if (this.a.g((bow)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               cbv.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cbv.this.w(true);
               cbv.this.s();
            }
         } else {
            this.h();
            cbv.this.w(false);
         }
      }

      @Override
      public void d() {
         cbv.this.w(false);
         super.d();
      }
   }

   class d extends bxe {
      public d() {
         super(cbv.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ej() != null && this.b.o_() || this.b.bN();
      }
   }
}
