import java.util.UUID;
import javax.annotation.Nullable;

public class bvl extends but implements bjp {
   private static final aeg<Boolean> bT = aej.a(bvl.class, aei.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bgl bZ = asw.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bvl(biw<? extends bvl> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bin a(aks $$0, bin $$1) {
      return biw.az.a((cpx)$$0);
   }

   @Override
   public boolean m(cjh $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new bvl.c());
      this.bO.a(1, new bvl.d());
      this.bO.a(4, new bqc(this, 1.25));
      this.bO.a(5, new bra(this, 1.0));
      this.bO.a(6, new bql(this, cbw.class, 6.0F));
      this.bO.a(7, new bqy(this));
      this.bP.a(1, new bvl.b());
      this.bP.a(2, new bvl.a());
      this.bP.a(3, new brw<>(this, cbw.class, 10, true, false, this::a_));
      this.bP.a(4, new brw<>(this, bvd.class, 10, true, true, null));
      this.bP.a(5, new bsc<>(this, false));
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 30.0).a(bko.b, 20.0).a(bko.d, 0.25).a(bko.f, 6.0);
   }

   public static boolean c(biw<bvl> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      hg<cqv> $$5 = $$1.s($$3);
      return !$$5.a(apt.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apu.bU);
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
   protected ape w() {
      return this.m_() ? apf.sK : apf.sJ;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.sM;
   }

   @Override
   protected ape l_() {
      return apf.sL;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.sN, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.bY <= 0) {
         this.a(apf.sO, 1.0F, this.eW());
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
            this.bX = ary.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = ary.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dL().B) {
         this.a((aks)this.dL(), true);
      }
   }

   @Override
   public bit a(bju $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bis $$0) {
      boolean $$1 = $$0.a(this.dM().b((bji)this), (float)((int)this.b(bko.f)));
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
      return ary.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fc() {
      return 0.98F;
   }

   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if ($$3 == null) {
         $$3 = new bin.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends brw<cbw> {
      public a() {
         super(bvl.this, cbw.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bvl.this.m_()) {
            return false;
         } else {
            if (super.a()) {
               for (bvl $$1 : bvl.this.dL().a(bvl.class, bvl.this.cG().c(8.0, 4.0, 8.0))) {
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

   class b extends brv {
      public b() {
         super(bvl.this);
      }

      @Override
      public void c() {
         super.c();
         if (bvl.this.m_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bjk $$0, bji $$1) {
         if ($$0 instanceof bvl && !$$0.m_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bqn {
      public c() {
         super(bvl.this, 1.25, true);
      }

      @Override
      protected void a(bji $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bvl.this.w(false);
         } else if (this.a.f((bis)$$0) < (double)(($$0.df() + 3.0F) * ($$0.df() + 3.0F))) {
            if (this.i()) {
               bvl.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bvl.this.w(true);
               bvl.this.t();
            }
         } else {
            this.h();
            bvl.this.w(false);
         }
      }

      @Override
      public void d() {
         bvl.this.w(false);
         super.d();
      }
   }

   class d extends bqw {
      public d() {
         super(bvl.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eg() != null && this.b.m_() || this.b.bM();
      }
   }
}
