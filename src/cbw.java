import java.util.UUID;
import javax.annotation.Nullable;

public class cbw extends cbe implements bpv {
   private static final aim<Boolean> bX = aiq.a(cbw.class, aio.k);
   private static final float bY = 6.0F;
   private float ca;
   private float cb;
   private int cc;
   private static final bmo cd = axv.a(20, 39);
   private int ce;
   @Nullable
   private UUID cf;

   public cbw(bpd<? extends cbw> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bos a(apf $$0, bos $$1) {
      return bpd.aD.a((cxb)$$0);
   }

   @Override
   public boolean o(cqm $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new cbw.c());
      this.bR.a(1, new cbw.d());
      this.bR.a(4, new bwl(this, 1.25));
      this.bR.a(5, new bxj(this, 1.0));
      this.bR.a(6, new bwu(this, ciu.class, 6.0F));
      this.bR.a(7, new bxh(this));
      this.bS.a(1, new cbw.b());
      this.bS.a(2, new cbw.a());
      this.bS.a(3, new byf<>(this, ciu.class, 10, true, false, this::a_));
      this.bS.a(4, new byf<>(this, cbo.class, 10, true, true, null));
      this.bS.a(5, new byl<>(this, false));
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 30.0).a(bqw.k, 20.0).a(bqw.r, 0.25).a(bqw.c, 6.0);
   }

   public static boolean c(bpd<cbw> $$0, cxc $$1, bpt $$2, ib $$3, axd $$4) {
      il<cya> $$5 = $$1.t($$3);
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
      return this.o_() ? aty.tY : aty.tX;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.ua;
   }

   @Override
   protected atx n_() {
      return aty.tZ;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.ub, 0.15F, 1.0F);
   }

   protected void s() {
      if (this.cc <= 0) {
         this.b(aty.uc);
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
   public bpa e(bqa $$0) {
      if (this.cb > 0.0F) {
         float $$1 = this.cb / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(box $$0) {
      boolean $$1 = $$0.a(this.dN().b((bpp)this), (float)((int)this.g(bqw.c)));
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
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      if ($$3 == null) {
         $$3 = new bos.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends byf<ciu> {
      public a() {
         super(cbw.this, ciu.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cbw.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cbw $$1 : cbw.this.dM().a(cbw.class, cbw.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends bye {
      public b() {
         super(cbw.this);
      }

      @Override
      public void c() {
         super.c();
         if (cbw.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bpr $$0, bpp $$1) {
         if ($$0 instanceof cbw && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bww {
      public c() {
         super(cbw.this, 1.25, true);
      }

      @Override
      protected void a(bpp $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cbw.this.w(false);
         } else if (this.a.g((box)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               cbw.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cbw.this.w(true);
               cbw.this.s();
            }
         } else {
            this.h();
            cbw.this.w(false);
         }
      }

      @Override
      public void d() {
         cbw.this.w(false);
         super.d();
      }
   }

   class d extends bxf {
      public d() {
         super(cbw.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ej() != null && this.b.o_() || this.b.bN();
      }
   }
}
