import java.util.UUID;
import javax.annotation.Nullable;

public class bva extends bui implements bjd {
   private static final adx<Boolean> bT = aea.a(bva.class, adz.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bfz bZ = ask.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bva(bik<? extends bva> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bib a(aki $$0, bib $$1) {
      return bik.az.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return false;
   }

   @Override
   protected void w() {
      super.w();
      this.bO.a(0, new bpm(this));
      this.bO.a(1, new bva.c());
      this.bO.a(1, new bva.d());
      this.bO.a(4, new bpr(this, 1.25));
      this.bO.a(5, new bqp(this, 1.0));
      this.bO.a(6, new bqa(this, cbl.class, 6.0F));
      this.bO.a(7, new bqn(this));
      this.bP.a(1, new bva.b());
      this.bP.a(2, new bva.a());
      this.bP.a(3, new brl<>(this, cbl.class, 10, true, false, this::a_));
      this.bP.a(4, new brl<>(this, bus.class, 10, true, true, null));
      this.bP.a(5, new brr<>(this, false));
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 30.0).a(bkd.b, 20.0).a(bkd.d, 0.25).a(bkd.f, 6.0);
   }

   public static boolean c(bik<bva> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      hf<cqi> $$5 = $$1.s($$3);
      return !$$5.a(api.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(apj.bU);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(this.dK(), $$0);
   }

   @Override
   public void b(qs $$0) {
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
   protected aot r() {
      return this.i_() ? aou.sK : aou.sJ;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.sM;
   }

   @Override
   protected aot h_() {
      return aou.sL;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.sN, 0.15F, 1.0F);
   }

   protected void q() {
      if (this.bY <= 0) {
         this.a(aou.sO, 1.0F, this.eV());
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
      if (this.dK().B) {
         if (this.bX != this.bW) {
            this.e_();
         }

         this.bW = this.bX;
         if (this.t()) {
            this.bX = aro.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = aro.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dK().B) {
         this.a((aki)this.dK(), true);
      }
   }

   @Override
   public bih a(bji $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(big $$0) {
      boolean $$1 = $$0.a(this.dL().b((biw)this), (float)((int)this.b(bkd.f)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean t() {
      return this.an.b(bT);
   }

   public void w(boolean $$0) {
      this.an.b(bT, $$0);
   }

   public float E(float $$0) {
      return aro.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fb() {
      return 0.98F;
   }

   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$3 == null) {
         $$3 = new bib.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends brl<cbl> {
      public a() {
         super(bva.this, cbl.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bva.this.i_()) {
            return false;
         } else {
            if (super.a()) {
               for (bva $$1 : bva.this.dK().a(bva.class, bva.this.cG().c(8.0, 4.0, 8.0))) {
                  if ($$1.i_()) {
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

   class b extends brk {
      public b() {
         super(bva.this);
      }

      @Override
      public void c() {
         super.c();
         if (bva.this.i_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(biy $$0, biw $$1) {
         if ($$0 instanceof bva && !$$0.i_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bqc {
      public c() {
         super(bva.this, 1.25, true);
      }

      @Override
      protected void a(biw $$0, double $$1) {
         double $$2 = this.a($$0);
         if ($$1 <= $$2 && this.i()) {
            this.h();
            this.a.C($$0);
            bva.this.w(false);
         } else if ($$1 <= $$2 * 2.0) {
            if (this.i()) {
               bva.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bva.this.w(true);
               bva.this.q();
            }
         } else {
            this.h();
            bva.this.w(false);
         }
      }

      @Override
      public void d() {
         bva.this.w(false);
         super.d();
      }

      @Override
      protected double a(biw $$0) {
         return (double)(4.0F + $$0.df());
      }
   }

   class d extends bql {
      public d() {
         super(bva.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ef() != null && this.b.i_() || this.b.bM();
      }
   }
}
