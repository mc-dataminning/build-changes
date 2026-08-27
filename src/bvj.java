import java.util.UUID;
import javax.annotation.Nullable;

public class bvj extends bur implements bjn {
   private static final aef<Boolean> bT = aei.a(bvj.class, aeh.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bgj bZ = asu.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bvj(biu<? extends bvj> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bil a(akr $$0, bil $$1) {
      return biu.az.a((cpv)$$0);
   }

   @Override
   public boolean m(cjf $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new bvj.c());
      this.bO.a(1, new bvj.d());
      this.bO.a(4, new bqa(this, 1.25));
      this.bO.a(5, new bqy(this, 1.0));
      this.bO.a(6, new bqj(this, cbu.class, 6.0F));
      this.bO.a(7, new bqw(this));
      this.bP.a(1, new bvj.b());
      this.bP.a(2, new bvj.a());
      this.bP.a(3, new bru<>(this, cbu.class, 10, true, false, this::a_));
      this.bP.a(4, new bru<>(this, bvb.class, 10, true, true, null));
      this.bP.a(5, new bsa<>(this, false));
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 30.0).a(bkm.b, 20.0).a(bkm.d, 0.25).a(bkm.f, 6.0);
   }

   public static boolean c(biu<bvj> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      hg<cqt> $$5 = $$1.s($$3);
      return !$$5.a(aps.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apt.bU);
   }

   @Override
   public void a(qy $$0) {
      super.a($$0);
      this.a(this.dL(), $$0);
   }

   @Override
   public void b(qy $$0) {
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
   protected apd w() {
      return this.m_() ? ape.sK : ape.sJ;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.sM;
   }

   @Override
   protected apd l_() {
      return ape.sL;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.sN, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bY <= 0) {
         this.a(ape.sO, 1.0F, this.eW());
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
            this.bX = arx.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = arx.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dL().B) {
         this.a((akr)this.dL(), true);
      }
   }

   @Override
   public bir a(bjs $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(biq $$0) {
      boolean $$1 = $$0.a(this.dM().b((bjg)this), (float)((int)this.b(bkm.f)));
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
      return arx.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fc() {
      return 0.98F;
   }

   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qy $$4) {
      if ($$3 == null) {
         $$3 = new bil.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bru<cbu> {
      public a() {
         super(bvj.this, cbu.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bvj.this.m_()) {
            return false;
         } else {
            if (super.a()) {
               for (bvj $$1 : bvj.this.dL().a(bvj.class, bvj.this.cG().c(8.0, 4.0, 8.0))) {
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

   class b extends brt {
      public b() {
         super(bvj.this);
      }

      @Override
      public void c() {
         super.c();
         if (bvj.this.m_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bji $$0, bjg $$1) {
         if ($$0 instanceof bvj && !$$0.m_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bql {
      public c() {
         super(bvj.this, 1.25, true);
      }

      @Override
      protected void a(bjg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bvj.this.w(false);
         } else if (this.a.f((biq)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bvj.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bvj.this.w(true);
               bvj.this.t();
            }
         } else {
            this.h();
            bvj.this.w(false);
         }
      }

      @Override
      public void d() {
         bvj.this.w(false);
         super.d();
      }
   }

   class d extends bqu {
      public d() {
         super(bvj.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.m_() || this.b.bM();
      }
   }
}
