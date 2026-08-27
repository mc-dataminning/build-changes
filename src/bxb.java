import java.util.UUID;
import javax.annotation.Nullable;

public class bxb extends bwj implements blf {
   private static final afm<Boolean> bT = afp.a(bxb.class, afo.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bib bZ = aug.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bxb(bkm<? extends bxb> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bkd a(ama $$0, bkd $$1) {
      return bkm.az.a((crs)$$0);
   }

   @Override
   public boolean m(clb $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bxb.c());
      this.bO.a(1, new bxb.d());
      this.bO.a(4, new brs(this, 1.25));
      this.bO.a(5, new bsq(this, 1.0));
      this.bO.a(6, new bsb(this, cdm.class, 6.0F));
      this.bO.a(7, new bso(this));
      this.bP.a(1, new bxb.b());
      this.bP.a(2, new bxb.a());
      this.bP.a(3, new btm<>(this, cdm.class, 10, true, false, this::a_));
      this.bP.a(4, new btm<>(this, bwt.class, 10, true, true, null));
      this.bP.a(5, new bts<>(this, false));
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 30.0).a(bme.g, 20.0).a(bme.m, 0.25).a(bme.c, 6.0);
   }

   public static boolean c(bkm<bxb> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      ib<csq> $$5 = $$1.s($$3);
      return !$$5.a(arb.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(arc.bU);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void b(rz $$0) {
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
   protected aqm w() {
      return this.n_() ? aqn.sO : aqn.sN;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.sQ;
   }

   @Override
   protected aqm m_() {
      return aqn.sP;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.sR, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bY <= 0) {
         this.a(aqn.sS, 1.0F, this.eW());
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
            this.bX = ati.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = ati.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dL().B) {
         this.a((ama)this.dL(), true);
      }
   }

   @Override
   public bkj a(blk $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bki $$0) {
      boolean $$1 = $$0.a(this.dM().b((bky)this), (float)((int)this.b(bme.c)));
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
      return ati.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fc() {
      return 0.98F;
   }

   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkd.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends btm<cdm> {
      public a() {
         super(bxb.this, cdm.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bxb.this.n_()) {
            return false;
         } else {
            if (super.a()) {
               for (bxb $$1 : bxb.this.dL().a(bxb.class, bxb.this.cG().c(8.0, 4.0, 8.0))) {
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

   class b extends btl {
      public b() {
         super(bxb.this);
      }

      @Override
      public void c() {
         super.c();
         if (bxb.this.n_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bla $$0, bky $$1) {
         if ($$0 instanceof bxb && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bsd {
      public c() {
         super(bxb.this, 1.25, true);
      }

      @Override
      protected void a(bky $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxb.this.w(false);
         } else if (this.a.f((bki)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bxb.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bxb.this.w(true);
               bxb.this.t();
            }
         } else {
            this.h();
            bxb.this.w(false);
         }
      }

      @Override
      public void d() {
         bxb.this.w(false);
         super.d();
      }
   }

   class d extends bsm {
      public d() {
         super(bxb.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.n_() || this.b.bM();
      }
   }
}
