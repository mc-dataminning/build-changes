import javax.annotation.Nullable;
import org.joml.Vector3f;

public class buw extends bui {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final clw bX = clw.a(ciz.ql, ciz.qm);
   private static final adx<Boolean> bY = aea.a(buw.class, adz.k);
   @Nullable
   private buw.a<cbl> bZ;
   @Nullable
   private buw.b ca;

   public buw(bik<? extends buw> $$0, cpk $$1) {
      super($$0, $$1);
      this.q();
   }

   boolean t() {
      return this.an.b(bY);
   }

   private void w(boolean $$0) {
      this.an.b(bY, $$0);
      this.q();
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Trusting", this.t());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
   }

   @Override
   protected void w() {
      this.ca = new buw.b(this, 0.6, bX, true);
      this.bO.a(1, new bpm(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bpy(this, 0.3F));
      this.bO.a(8, new bqi(this));
      this.bO.a(9, new bpe(this, 0.8));
      this.bO.a(10, new brf(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bqa(this, cbl.class, 10.0F));
      this.bP.a(1, new brl<>(this, bun.class, false));
      this.bP.a(1, new brl<>(this, bvj.class, 10, false, false, bvj.bU));
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bji.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bji.a);
            this.g(true);
         } else {
            this.b(bji.a);
            this.g(false);
         }
      } else {
         this.b(bji.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && this.ah > 2400;
   }

   public static bkc.a p() {
      return biy.x().a(bkd.a, 10.0).a(bkd.d, 0.3F).a(bkd.f, 3.0);
   }

   @Nullable
   @Override
   protected aot r() {
      return aou.qG;
   }

   @Override
   public int L() {
      return 900;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.qF;
   }

   @Override
   protected aot h_() {
      return aou.qH;
   }

   private float fZ() {
      return (float)this.b(bkd.f);
   }

   @Override
   public boolean C(big $$0) {
      return $$0.a(this.dL().b((biw)this), this.fZ());
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.t() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dK().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dK().a(this, (byte)41);
            } else {
               this.x(false);
               this.dK().a(this, (byte)40);
            }
         }

         return bgo.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      iu $$1 = iw.M;
      if (!$$0) {
         $$1 = iw.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dK().a($$1, this.d(1.0), this.ds() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void q() {
      if (this.bZ == null) {
         this.bZ = new buw.a<>(this, cbl.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.t()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public buw b(aki $$0, bib $$1) {
      return bik.aq.a((cpk)$$0);
   }

   @Override
   public boolean m(ciw $$0) {
      return bX.a($$0);
   }

   public static boolean c(bik<buw> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cpn $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         gv $$1 = this.dk();
         if ($$1.v() < $$0.t_()) {
            return false;
         }

         dey $$2 = $$0.a_($$1.d());
         if ($$2.a(csl.i) || $$2.a(apj.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      if ($$3 == null) {
         $$3 = new bib.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ehf cI() {
      return new ehf(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends biw> extends boz<T> {
      private final buw i;

      public a(buw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bij.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.t() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.t() && super.b();
      }
   }

   static class b extends bra {
      private final buw c;

      public b(buw $$0, double $$1, clw $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.t();
      }
   }
}
