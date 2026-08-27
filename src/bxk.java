import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxk extends bww {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final coq bX = coq.a(clr.qW, clr.qX);
   private static final afs<Boolean> bY = afv.a(bxk.class, afu.k);
   @Nullable
   private bxk.a<cdz> bZ;
   @Nullable
   private bxk.b ca;

   public bxk(bkz<? extends bxk> $$0, csf $$1) {
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
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bY, false);
   }

   @Override
   protected void B() {
      this.ca = new bxk.b(this, 0.6, bX, true);
      this.bO.a(1, new bsa(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bsm(this, 0.3F));
      this.bO.a(8, new bsw(this));
      this.bO.a(9, new brs(this, 0.8));
      this.bO.a(10, new btt(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bso(this, cdz.class, 10.0F));
      this.bP.a(1, new btz<>(this, bxb.class, false));
      this.bP.a(1, new btz<>(this, bxx.class, 10, false, false, bxx.bU));
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(blx.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(blx.a);
            this.g(true);
         } else {
            this.b(blx.a);
            this.g(false);
         }
      } else {
         this.b(blx.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 0.3F).a(bmr.c, 3.0);
   }

   @Nullable
   @Override
   protected aqu y() {
      return aqv.ra;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.qZ;
   }

   @Override
   protected aqu n_() {
      return aqv.rb;
   }

   private float gf() {
      return (float)this.b(bmr.c);
   }

   @Override
   public boolean C(bkv $$0) {
      return $$0.a(this.dO().b((bll)this), this.gf());
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
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

         return bjb.a(this.dN().B);
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
      ju $$1 = jw.M;
      if (!$$0) {
         $$1 = jw.Z;
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
         this.bZ = new bxk.a<>(this, cdz.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bxk b(ami $$0, bkq $$1) {
      return bkz.aq.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return bX.a($$0);
   }

   public static boolean c(bkz<bxk> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(csi $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hx $$1 = this.dn();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dhn $$2 = $$0.a_($$1.d());
         if ($$2.a(cvh.i) || $$2.a(ark.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$3 == null) {
         $$3 = new bkq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, (double)(0.5F * this.cI()), (double)(this.dh() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bll> extends brn<T> {
      private final bxk i;

      public a(bxk $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bky.e::test);
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

   static class b extends bto {
      private final bxk c;

      public b(bxk $$0, double $$1, coq $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
