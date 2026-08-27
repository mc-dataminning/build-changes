import java.util.UUID;
import javax.annotation.Nullable;

public class bwm extends bvu implements bkq {
   private static final afc<Boolean> bT = aff.a(bwm.class, afe.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bhm bZ = atw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bwm(bjx<? extends bwm> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bjo a(alq $$0, bjo $$1) {
      return bjx.az.a((cqz)$$0);
   }

   @Override
   public boolean m(ckj $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqy(this));
      this.bO.a(1, new bwm.c());
      this.bO.a(1, new bwm.d());
      this.bO.a(4, new brd(this, 1.25));
      this.bO.a(5, new bsb(this, 1.0));
      this.bO.a(6, new brm(this, ccx.class, 6.0F));
      this.bO.a(7, new brz(this));
      this.bP.a(1, new bwm.b());
      this.bP.a(2, new bwm.a());
      this.bP.a(3, new bsx<>(this, ccx.class, 10, true, false, this::a_));
      this.bP.a(4, new bsx<>(this, bwe.class, 10, true, true, null));
      this.bP.a(5, new btd<>(this, false));
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 30.0).a(blp.g, 20.0).a(blp.m, 0.25).a(blp.c, 6.0);
   }

   public static boolean c(bjx<bwm> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      ib<crx> $$5 = $$1.s($$3);
      return !$$5.a(aqr.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(aqs.bU);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   protected aqc w() {
      return this.n_() ? aqd.sM : aqd.sL;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.sO;
   }

   @Override
   protected aqc m_() {
      return aqd.sN;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.sP, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bY <= 0) {
         this.a(aqd.sQ, 1.0F, this.eW());
         this.bY = 40;
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         if (this.bX != this.bW) {
            this.j_();
         }

         this.bW = this.bX;
         if (this.y()) {
            this.bX = asy.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = asy.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dL().B) {
         this.a((alq)this.dL(), true);
      }
   }

   @Override
   public bju a(bkv $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bjt $$0) {
      boolean $$1 = $$0.a(this.dM().b((bkj)this), (float)((int)this.b(blp.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean y() {
      return this.an.b(bT);
   }

   public void w(boolean $$0) {
      this.an.b(bT, $$0);
   }

   public float E(float $$0) {
      return asy.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fc() {
      return 0.98F;
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$3 == null) {
         $$3 = new bjo.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bsx<ccx> {
      public a() {
         super(bwm.this, ccx.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bwm.this.n_()) {
            return false;
         } else {
            if (super.a()) {
               for (bwm $$1 : bwm.this.dL().a(bwm.class, bwm.this.cG().c(8.0, 4.0, 8.0))) {
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

   class b extends bsw {
      public b() {
         super(bwm.this);
      }

      @Override
      public void c() {
         super.c();
         if (bwm.this.n_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bkl $$0, bkj $$1) {
         if ($$0 instanceof bwm && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bro {
      public c() {
         super(bwm.this, 1.25, true);
      }

      @Override
      protected void a(bkj $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bwm.this.w(false);
         } else if (this.a.f((bjt)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bwm.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bwm.this.w(true);
               bwm.this.t();
            }
         } else {
            this.h();
            bwm.this.w(false);
         }
      }

      @Override
      public void d() {
         bwm.this.w(false);
         super.d();
      }
   }

   class d extends brx {
      public d() {
         super(bwm.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.n_() || this.b.bM();
      }
   }
}
