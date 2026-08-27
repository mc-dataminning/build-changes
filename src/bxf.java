import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxf extends bwr {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cok bX = cok.a(clm.qW, clm.qX);
   private static final afo<Boolean> bY = afr.a(bxf.class, afq.k);
   @Nullable
   private bxf.a<cdu> bZ;
   @Nullable
   private bxf.b ca;

   public bxf(bku<? extends bxf> $$0, csa $$1) {
      super($$0, $$1);
      this.w();
   }

   boolean A() {
      return this.an.b(bY);
   }

   private void w(boolean $$0) {
      this.an.b(bY, $$0);
      this.w();
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
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
   protected void B() {
      this.ca = new bxf.b(this, 0.6, bX, true);
      this.bO.a(1, new brv(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bsh(this, 0.3F));
      this.bO.a(8, new bsr(this));
      this.bO.a(9, new brn(this, 0.8));
      this.bO.a(10, new bto(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bsj(this, cdu.class, 10.0F));
      this.bP.a(1, new btu<>(this, bww.class, false));
      this.bP.a(1, new btu<>(this, bxs.class, 10, false, false, bxs.bU));
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bls.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bls.a);
            this.g(true);
         } else {
            this.b(bls.a);
            this.g(false);
         }
      } else {
         this.b(bls.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 0.3F).a(bmm.c, 3.0);
   }

   @Nullable
   @Override
   protected aqq y() {
      return aqr.ra;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.qZ;
   }

   @Override
   protected aqq m_() {
      return aqr.rb;
   }

   private float gf() {
      return (float)this.b(bmm.c);
   }

   @Override
   public boolean C(bkq $$0) {
      return $$0.a(this.dO().b((blg)this), this.gf());
   }

   @Override
   public bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.A() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dN().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dN().a(this, (byte)41);
            } else {
               this.x(false);
               this.dN().a(this, (byte)40);
            }
         }

         return bix.a(this.dN().B);
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
         this.dN().a($$1, this.d(1.0), this.dv() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void w() {
      if (this.bZ == null) {
         this.bZ = new bxf.a<>(this, cdu.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bxf b(ame $$0, bkl $$1) {
      return bku.aq.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return bX.a($$0);
   }

   public static boolean c(bku<bxf> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(csd $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         ht $$1 = this.dn();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dhi $$2 = $$0.a_($$1.d());
         if ($$2.a(cvc.i) || $$2.a(arg.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public eju cJ() {
      return new eju(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends blg> extends bri<T> {
      private final bxf i;

      public a(bxf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bkt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.A() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.A() && super.b();
      }
   }

   static class b extends btj {
      private final bxf c;

      public b(bxf $$0, double $$1, cok $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
