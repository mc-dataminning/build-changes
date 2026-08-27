import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byg extends bxs {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cps bX = cps.a(cmu.qW, cmu.qX);
   private static final agj<Boolean> bY = agm.a(byg.class, agl.k);
   @Nullable
   private byg.a<cfb> bZ;
   @Nullable
   private byg.b ca;

   public byg(blt<? extends byg> $$0, cti $$1) {
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
   public void b(sl $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sl $$0) {
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
      this.ca = new byg.b(this, 0.6, bX, true);
      this.bO.a(1, new bsv(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bth(this, 0.3F));
      this.bO.a(8, new btr(this));
      this.bO.a(9, new bsn(this, 0.8));
      this.bO.a(10, new buo(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new btj(this, cfb.class, 10.0F));
      this.bP.a(1, new buu<>(this, bxx.class, false));
      this.bP.a(1, new buu<>(this, byt.class, 10, false, false, byt.bU));
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmr.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmr.a);
            this.g(true);
         } else {
            this.b(bmr.a);
            this.g(false);
         }
      } else {
         this.b(bmr.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 10.0).a(bnl.m, 0.3F).a(bnl.c, 3.0);
   }

   @Nullable
   @Override
   protected arl y() {
      return arm.ru;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.rt;
   }

   @Override
   protected arl n_() {
      return arm.rv;
   }

   private float ge() {
      return (float)this.b(bnl.c);
   }

   @Override
   public boolean C(blp $$0) {
      return $$0.a(this.dN().b((bmf)this), this.ge());
   }

   @Override
   public bjv b(cfb $$0, bju $$1) {
      cmr $$2 = $$0.b($$1);
      if ((this.ca == null || this.ca.i()) && !this.A() && this.m($$2) && $$0.f(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dM().B) {
            if (this.ag.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dM().a(this, (byte)41);
            } else {
               this.x(false);
               this.dM().a(this, (byte)40);
            }
         }

         return bjv.a(this.dM().B);
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
      jv $$1 = jx.O;
      if (!$$0) {
         $$1 = jx.ab;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ag.k() * 0.02;
         double $$4 = this.ag.k() * 0.02;
         double $$5 = this.ag.k() * 0.02;
         this.dM().a($$1, this.d(1.0), this.du() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void w() {
      if (this.bZ == null) {
         this.bZ = new byg.a<>(this, cfb.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public byg b(amz $$0, blk $$1) {
      return blt.ar.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return bX.a($$0);
   }

   public static boolean c(blt<byg> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(ctl $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hx $$1 = this.dm();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dja $$2 = $$0.a_($$1.d());
         if ($$2.a(cwl.i) || $$2.a(asb.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$3 == null) {
         $$3 = new blk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public elm cJ() {
      return new elm(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bmf> extends bsi<T> {
      private final byg i;

      public a(byg $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bls.e::test);
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

   static class b extends buj {
      private final byg c;

      public b(byg $$0, double $$1, cps $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
