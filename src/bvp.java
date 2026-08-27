import java.util.UUID;
import javax.annotation.Nullable;

public class bvp extends bux implements bjt {
   private static final aef<Boolean> bT = aei.a(bvp.class, aeh.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bgp bZ = asz.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bvp(bja<? extends bvp> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bir a(akt $$0, bir $$1) {
      return bja.az.a((cqb)$$0);
   }

   @Override
   public boolean m(cjl $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new bvp.c());
      this.bO.a(1, new bvp.d());
      this.bO.a(4, new bqg(this, 1.25));
      this.bO.a(5, new bre(this, 1.0));
      this.bO.a(6, new bqp(this, cca.class, 6.0F));
      this.bO.a(7, new brc(this));
      this.bP.a(1, new bvp.b());
      this.bP.a(2, new bvp.a());
      this.bP.a(3, new bsa<>(this, cca.class, 10, true, false, this::a_));
      this.bP.a(4, new bsa<>(this, bvh.class, 10, true, true, null));
      this.bP.a(5, new bsg<>(this, false));
   }

   public static bkr.a s() {
      return bjo.A().a(bks.l, 30.0).a(bks.g, 20.0).a(bks.m, 0.25).a(bks.c, 6.0);
   }

   public static boolean c(bja<bvp> $$0, cqc $$1, bjq $$2, gw $$3, ash $$4) {
      he<cqz> $$5 = $$1.s($$3);
      return !$$5.a(apu.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apv.bU);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void b(qw $$0) {
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
   protected apf w() {
      return this.m_() ? apg.sK : apg.sJ;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.sM;
   }

   @Override
   protected apf l_() {
      return apg.sL;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.sN, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bY <= 0) {
         this.a(apg.sO, 1.0F, this.eW());
         this.bY = 40;
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         if (this.bX != this.bW) {
            this.i_();
         }

         this.bW = this.bX;
         if (this.y()) {
            this.bX = asb.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = asb.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dL().B) {
         this.a((akt)this.dL(), true);
      }
   }

   @Override
   public bix a(bjy $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(biw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjm)this), (float)((int)this.b(bks.c)));
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
      return asb.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fc() {
      return 0.98F;
   }

   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      if ($$3 == null) {
         $$3 = new bir.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bsa<cca> {
      public a() {
         super(bvp.this, cca.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bvp.this.m_()) {
            return false;
         } else {
            if (super.a()) {
               for (bvp $$1 : bvp.this.dL().a(bvp.class, bvp.this.cG().c(8.0, 4.0, 8.0))) {
                  if ($$1.m_()) {
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

   class b extends brz {
      public b() {
         super(bvp.this);
      }

      @Override
      public void c() {
         super.c();
         if (bvp.this.m_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bjo $$0, bjm $$1) {
         if ($$0 instanceof bvp && !$$0.m_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bqr {
      public c() {
         super(bvp.this, 1.25, true);
      }

      @Override
      protected void a(bjm $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bvp.this.w(false);
         } else if (this.a.f((biw)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bvp.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bvp.this.w(true);
               bvp.this.t();
            }
         } else {
            this.h();
            bvp.this.w(false);
         }
      }

      @Override
      public void d() {
         bvp.this.w(false);
         super.d();
      }
   }

   class d extends bra {
      public d() {
         super(bvp.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.m_() || this.b.bM();
      }
   }
}
