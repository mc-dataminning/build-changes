import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bva extends bum {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cmb bX = cmb.a(cjd.ql, cjd.qm);
   private static final aec<Boolean> bY = aef.a(bva.class, aee.k);
   @Nullable
   private bva.a<cbp> bZ;
   @Nullable
   private bva.b ca;

   public bva(bip<? extends bva> $$0, cpq $$1) {
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
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Trusting", this.t());
   }

   @Override
   public void a(qu $$0) {
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
      this.ca = new bva.b(this, 0.6, bX, true);
      this.bO.a(1, new bpq(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bqc(this, 0.3F));
      this.bO.a(8, new bqm(this));
      this.bO.a(9, new bpi(this, 0.8));
      this.bO.a(10, new brj(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bqe(this, cbp.class, 10.0F));
      this.bP.a(1, new brp<>(this, bur.class, false));
      this.bP.a(1, new brp<>(this, bvn.class, 10, false, false, bvn.bU));
   }

   @Override
   public void V() {
      if (this.E().b()) {
         double $$0 = this.E().c();
         if ($$0 == 0.6) {
            this.b(bjn.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjn.a);
            this.g(true);
         } else {
            this.b(bjn.a);
            this.g(false);
         }
      } else {
         this.b(bjn.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.t() && this.ah > 2400;
   }

   public static bkg.a p() {
      return bjd.x().a(bkh.a, 10.0).a(bkh.d, 0.3F).a(bkh.f, 3.0);
   }

   @Nullable
   @Override
   protected aoy r() {
      return aoz.qG;
   }

   @Override
   public int L() {
      return 900;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.qF;
   }

   @Override
   protected aoy h_() {
      return aoz.qH;
   }

   private float ga() {
      return (float)this.b(bkh.f);
   }

   @Override
   public boolean C(bil $$0) {
      return $$0.a(this.dL().b((bjb)this), this.ga());
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
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

         return bgt.a(this.dK().B);
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
      iv $$1 = ix.M;
      if (!$$0) {
         $$1 = ix.Z;
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
         this.bZ = new bva.a<>(this, cbp.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.t()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bva b(akn $$0, big $$1) {
      return bip.aq.a((cpq)$$0);
   }

   @Override
   public boolean m(cja $$0) {
      return bX.a($$0);
   }

   public static boolean c(bip<bva> $$0, cpr $$1, bjf $$2, gw $$3, arx $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cpt $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         gw $$1 = this.dk();
         if ($$1.v() < $$0.t_()) {
            return false;
         }

         dfe $$2 = $$0.a_($$1.d());
         if ($$2.a(csr.i) || $$2.a(apo.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      if ($$3 == null) {
         $$3 = new big.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bjb> extends bpd<T> {
      private final bva i;

      public a(bva $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bio.e::test);
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

   static class b extends bre {
      private final bva c;

      public b(bva $$0, double $$1, cmb $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.t();
      }
   }
}
