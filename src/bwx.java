import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwx extends bwj {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final coc bX = coc.a(cle.ql, cle.qm);
   private static final afm<Boolean> bY = afp.a(bwx.class, afo.k);
   @Nullable
   private bwx.a<cdm> bZ;
   @Nullable
   private bwx.b ca;

   public bwx(bkm<? extends bwx> $$0, crs $$1) {
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
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(rz $$0) {
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
      this.ca = new bwx.b(this, 0.6, bX, true);
      this.bO.a(1, new brn(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new brz(this, 0.3F));
      this.bO.a(8, new bsj(this));
      this.bO.a(9, new brf(this, 0.8));
      this.bO.a(10, new btg(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bsb(this, cdm.class, 10.0F));
      this.bP.a(1, new btm<>(this, bwo.class, false));
      this.bP.a(1, new btm<>(this, bxk.class, 10, false, false, bxk.bU));
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(blk.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(blk.a);
            this.g(true);
         } else {
            this.b(blk.a);
            this.g(false);
         }
      } else {
         this.b(blk.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bmd.a s() {
      return bla.A().a(bme.l, 10.0).a(bme.m, 0.3F).a(bme.c, 3.0);
   }

   @Nullable
   @Override
   protected aqm w() {
      return aqn.qK;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.qJ;
   }

   @Override
   protected aqm m_() {
      return aqn.qL;
   }

   private float ge() {
      return (float)this.b(bme.c);
   }

   @Override
   public boolean C(bki $$0) {
      return $$0.a(this.dM().b((bky)this), this.ge());
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
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

         return biq.a(this.dL().B);
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
         this.bZ = new bwx.a<>(this, cdm.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.y()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bwx b(ama $$0, bkd $$1) {
      return bkm.aq.a((crs)$$0);
   }

   @Override
   public boolean m(clb $$0) {
      return bX.a($$0);
   }

   public static boolean c(bkm<bwx> $$0, crt $$1, blc $$2, ht $$3, ato $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(crv $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         ht $$1 = this.dl();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dgw $$2 = $$0.a_($$1.d());
         if ($$2.a(cuv.i) || $$2.a(arc.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkd.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eji cI() {
      return new eji(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bky> extends bra<T> {
      private final bwx i;

      public a(bwx $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bkl.e::test);
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

   static class b extends btb {
      private final bwx c;

      public b(bwx $$0, double $$1, coc $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
