import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvf extends bur {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cmg bX = cmg.a(cji.ql, cji.qm);
   private static final aef<Boolean> bY = aei.a(bvf.class, aeh.k);
   @Nullable
   private bvf.a<cbu> bZ;
   @Nullable
   private bvf.b ca;

   public bvf(biu<? extends bvf> $$0, cpv $$1) {
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
   public void b(qx $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(qx $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bY, false);
   }

   @Override
   protected void z() {
      this.ca = new bvf.b(this, 0.6, bX, true);
      this.bO.a(1, new bpv(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bqh(this, 0.3F));
      this.bO.a(8, new bqr(this));
      this.bO.a(9, new bpn(this, 0.8));
      this.bO.a(10, new bro(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bqj(this, cbu.class, 10.0F));
      this.bP.a(1, new bru<>(this, buw.class, false));
      this.bP.a(1, new bru<>(this, bvs.class, 10, false, false, bvs.bU));
   }

   @Override
   public void Y() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bjs.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bjs.a);
            this.g(true);
         } else {
            this.b(bjs.a);
            this.g(false);
         }
      } else {
         this.b(bjs.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bkl.a s() {
      return bji.A().a(bkm.a, 10.0).a(bkm.d, 0.3F).a(bkm.f, 3.0);
   }

   @Nullable
   @Override
   protected apd w() {
      return ape.qG;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.qF;
   }

   @Override
   protected apd l_() {
      return ape.qH;
   }

   private float gd() {
      return (float)this.b(bkm.f);
   }

   @Override
   public boolean C(biq $$0) {
      return $$0.a(this.dM().b((bjg)this), this.gd());
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
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

         return bgy.a(this.dL().B);
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
         this.dL().a($$1, this.d(1.0), this.dt() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void t() {
      if (this.bZ == null) {
         this.bZ = new bvf.a<>(this, cbu.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.y()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bvf b(akr $$0, bil $$1) {
      return biu.aq.a((cpv)$$0);
   }

   @Override
   public boolean m(cjf $$0) {
      return bX.a($$0);
   }

   public static boolean c(biu<bvf> $$0, cpw $$1, bjk $$2, gw $$3, asc $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cpy $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         gw $$1 = this.dl();
         if ($$1.v() < $$0.y_()) {
            return false;
         }

         dfj $$2 = $$0.a_($$1.d());
         if ($$2.a(csw.i) || $$2.a(apt.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      if ($$3 == null) {
         $$3 = new bil.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ehn cJ() {
      return new ehn(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bjg> extends bpi<T> {
      private final bvf i;

      public a(bvf $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bit.e::test);
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

   static class b extends brj {
      private final bvf c;

      public b(bvf $$0, double $$1, cmg $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
