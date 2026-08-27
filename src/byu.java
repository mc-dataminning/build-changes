import java.util.UUID;
import javax.annotation.Nullable;

public class byu extends byc implements bmv {
   private static final agn<Boolean> bU = agq.a(byu.class, agp.k);
   private static final float bV = 6.0F;
   private float bX;
   private float bY;
   private int bZ;
   private static final bjn ca = avq.a(20, 39);
   private int cb;
   @Nullable
   private UUID cc;

   public byu(bmc<? extends byu> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public blr a(ane $$0, blr $$1) {
      return bmc.aB.a((ctx)$$0);
   }

   @Override
   public boolean m(cng $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bP.a(0, new bte(this));
      this.bP.a(1, new byu.c());
      this.bP.a(1, new byu.d());
      this.bP.a(4, new btj(this, 1.25));
      this.bP.a(5, new buh(this, 1.0));
      this.bP.a(6, new bts(this, cfq.class, 6.0F));
      this.bP.a(7, new buf(this));
      this.bQ.a(1, new byu.b());
      this.bQ.a(2, new byu.a());
      this.bQ.a(3, new bvd<>(this, cfq.class, 10, true, false, this::a_));
      this.bQ.a(4, new bvd<>(this, bym.class, 10, true, true, null));
      this.bQ.a(5, new bvj<>(this, false));
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 30.0).a(bnu.i, 20.0).a(bnu.o, 0.25).a(bnu.c, 6.0);
   }

   public static boolean c(bmc<byu> $$0, cty $$1, bms $$2, hx $$3, auw $$4) {
      ih<cuw> $$5 = $$1.t($$3);
      return !$$5.a(ash.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(asi.bU);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(ca.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.cb = $$0;
   }

   @Override
   public int a() {
      return this.cb;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cc;
   }

   @Override
   protected ars y() {
      return this.o_() ? art.tP : art.tO;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.tR;
   }

   @Override
   protected ars n_() {
      return art.tQ;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.tS, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bZ <= 0) {
         this.a(art.tT, 1.0F, this.eX());
         this.bZ = 40;
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bU, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         if (this.bY != this.bX) {
            this.k_();
         }

         this.bX = this.bY;
         if (this.A()) {
            this.bY = aup.a(this.bY + 1.0F, 0.0F, 6.0F);
         } else {
            this.bY = aup.a(this.bY - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bZ > 0) {
         this.bZ--;
      }

      if (!this.dL().B) {
         this.a((ane)this.dL(), true);
      }
   }

   @Override
   public blz e(bna $$0) {
      if (this.bY > 0.0F) {
         float $$1 = this.bY / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bmo)this), (float)((int)this.g(bnu.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean A() {
      return this.an.b(bU);
   }

   public void w(boolean $$0) {
      this.an.b(bU, $$0);
   }

   public float D(float $$0) {
      return aup.i($$0, this.bX, this.bY) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      if ($$3 == null) {
         $$3 = new blr.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bvd<cfq> {
      public a() {
         super(byu.this, cfq.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (byu.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (byu $$1 : byu.this.dL().a(byu.class, byu.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends bvc {
      public b() {
         super(byu.this);
      }

      @Override
      public void c() {
         super.c();
         if (byu.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bmq $$0, bmo $$1) {
         if ($$0 instanceof byu && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends btu {
      public c() {
         super(byu.this, 1.25, true);
      }

      @Override
      protected void a(bmo $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.B($$0);
            byu.this.w(false);
         } else if (this.a.f((blw)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               byu.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               byu.this.w(true);
               byu.this.w();
            }
         } else {
            this.h();
            byu.this.w(false);
         }
      }

      @Override
      public void d() {
         byu.this.w(false);
         super.d();
      }
   }

   class d extends bud {
      public d() {
         super(byu.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eh() != null && this.b.o_() || this.b.bN();
      }
   }
}
