import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwi extends bvu {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cnk bX = cnk.a(ckm.ql, ckm.qm);
   private static final afc<Boolean> bY = aff.a(bwi.class, afe.k);
   @Nullable
   private bwi.a<ccx> bZ;
   @Nullable
   private bwi.b ca;

   public bwi(bjx<? extends bwi> $$0, cqz $$1) {
      super($$0, $$1);
      this.t();
   }

   boolean y() {
      return this.an.b(bY);
   }

   private void w(boolean $$0) {
      this.an.b(bY, $$0);
      this.t();
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bY, false);
   }

   @Override
   protected void z() {
      this.ca = new bwi.b(this, 0.6, bX, true);
      this.bO.a(1, new bqy(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new brk(this, 0.3F));
      this.bO.a(8, new bru(this));
      this.bO.a(9, new bqq(this, 0.8));
      this.bO.a(10, new bsr(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new brm(this, ccx.class, 10.0F));
      this.bP.a(1, new bsx<>(this, bvz.class, false));
      this.bP.a(1, new bsx<>(this, bwv.class, 10, false, false, bwv.bU));
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bkv.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bkv.a);
            this.g(true);
         } else {
            this.b(bkv.a);
            this.g(false);
         }
      } else {
         this.b(bkv.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static blo.a s() {
      return bkl.A().a(blp.l, 10.0).a(blp.m, 0.3F).a(blp.c, 3.0);
   }

   @Nullable
   @Override
   protected aqc w() {
      return aqd.qI;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.qH;
   }

   @Override
   protected aqc m_() {
      return aqd.qJ;
   }

   private float ge() {
      return (float)this.b(blp.c);
   }

   @Override
   public boolean C(bjt $$0) {
      return $$0.a(this.dM().b((bkj)this), this.ge());
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.y() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dL().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dL().a(this, (byte)41);
            } else {
               this.x(false);
               this.dL().a(this, (byte)40);
            }
         }

         return bib.a(this.dL().B);
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
      jq $$1 = js.M;
      if (!$$0) {
         $$1 = js.Z;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bZ == null) {
         this.bZ = new bwi.a<>(this, ccx.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.y()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bwi b(alq $$0, bjo $$1) {
      return bjx.aq.a((cqz)$$0);
   }

   @Override
   public boolean m(ckj $$0) {
      return bX.a($$0);
   }

   public static boolean c(bjx<bwi> $$0, cra $$1, bkn $$2, ht $$3, ate $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(crc $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         ht $$1 = this.dl();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dgb $$2 = $$0.a_($$1.d());
         if ($$2.a(cuc.i) || $$2.a(aqs.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      if ($$3 == null) {
         $$3 = new bjo.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eif cI() {
      return new eif(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bkj> extends bql<T> {
      private final bwi i;

      public a(bwi $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bjw.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.y() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }
   }

   static class b extends bsm {
      private final bwi c;

      public b(bwi $$0, double $$1, cnk $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
