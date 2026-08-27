import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bvh extends but {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cmi bX = cmi.a(cjk.ql, cjk.qm);
   private static final aeg<Boolean> bY = aej.a(bvh.class, aei.k);
   @Nullable
   private bvh.a<cbw> bZ;
   @Nullable
   private bvh.b ca;

   public bvh(biw<? extends bvh> $$0, cpx $$1) {
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
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(qy $$0) {
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
      this.ca = new bvh.b(this, 0.6, bX, true);
      this.bO.a(1, new bpx(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bqj(this, 0.3F));
      this.bO.a(8, new bqt(this));
      this.bO.a(9, new bpp(this, 0.8));
      this.bO.a(10, new brq(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bql(this, cbw.class, 10.0F));
      this.bP.a(1, new brw<>(this, buy.class, false));
      this.bP.a(1, new brw<>(this, bvu.class, 10, false, false, bvu.bU));
   }

   @Override
   public void X() {
      if (this.I().b()) {
         double $$0 = this.I().c();
         if ($$0 == 0.6) {
            this.b(bju.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bju.a);
            this.g(true);
         } else {
            this.b(bju.a);
            this.g(false);
         }
      } else {
         this.b(bju.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ah > 2400;
   }

   public static bkn.a s() {
      return bjk.A().a(bko.a, 10.0).a(bko.d, 0.3F).a(bko.f, 3.0);
   }

   @Nullable
   @Override
   protected ape w() {
      return apf.qG;
   }

   @Override
   public int O() {
      return 900;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.qF;
   }

   @Override
   protected ape l_() {
      return apf.qH;
   }

   private float gd() {
      return (float)this.b(bko.f);
   }

   @Override
   public boolean C(bis $$0) {
      return $$0.a(this.dM().b((bji)this), this.gd());
   }

   @Override
   public bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
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

         return bha.a(this.dL().B);
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
         this.bZ = new bvh.a<>(this, cbw.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.y()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bvh b(aks $$0, bin $$1) {
      return biw.aq.a((cpx)$$0);
   }

   @Override
   public boolean m(cjh $$0) {
      return bX.a($$0);
   }

   public static boolean c(biw<bvh> $$0, cpy $$1, bjm $$2, gw $$3, ase $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cqa $$0) {
      if ($$0.f(this) && !$$0.d(this.cG())) {
         gw $$1 = this.dl();
         if ($$1.v() < $$0.y_()) {
            return false;
         }

         dfl $$2 = $$0.a_($$1.d());
         if ($$2.a(csy.i) || $$2.a(apu.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      if ($$3 == null) {
         $$3 = new bin.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, (double)(0.5F * this.cH()), (double)(this.df() * 0.4F));
   }

   @Override
   public boolean bS() {
      return this.bW() || super.bS();
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bji> extends bpk<T> {
      private final bvh i;

      public a(bvh $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, biv.e::test);
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

   static class b extends brl {
      private final bvh c;

      public b(bvh $$0, double $$1, cmi $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
