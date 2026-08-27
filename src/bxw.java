import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bxw extends bxi {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cpi bX = cpi.a(cmk.qW, cmk.qX);
   private static final afz<Boolean> bY = agc.a(bxw.class, agb.k);
   @Nullable
   private bxw.a<cer> bZ;
   @Nullable
   private bxw.b ca;

   public bxw(blj<? extends bxw> $$0, csy $$1) {
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
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sj $$0) {
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
      this.ca = new bxw.b(this, 0.6, bX, true);
      this.bO.a(1, new bsl(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new bsx(this, 0.3F));
      this.bO.a(8, new bth(this));
      this.bO.a(9, new bsd(this, 0.8));
      this.bO.a(10, new bue(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new bsz(this, cer.class, 10.0F));
      this.bP.a(1, new buk<>(this, bxn.class, false));
      this.bP.a(1, new buk<>(this, byj.class, 10, false, false, byj.bU));
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmh.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmh.a);
            this.g(true);
         } else {
            this.b(bmh.a);
            this.g(false);
         }
      } else {
         this.b(bmh.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bna.a u() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 0.3F).a(bnb.c, 3.0);
   }

   @Nullable
   @Override
   protected arb y() {
      return arc.ru;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.rt;
   }

   @Override
   protected arb n_() {
      return arc.rv;
   }

   private float ge() {
      return (float)this.b(bnb.c);
   }

   @Override
   public boolean C(blf $$0) {
      return $$0.a(this.dN().b((blv)this), this.ge());
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
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

         return bjl.a(this.dM().B);
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
      jt $$1 = jv.O;
      if (!$$0) {
         $$1 = jv.ab;
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
         this.bZ = new bxw.a<>(this, cer.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bxw b(amp $$0, bla $$1) {
      return blj.ar.a((csy)$$0);
   }

   @Override
   public boolean m(cmh $$0) {
      return bX.a($$0);
   }

   public static boolean c(blj<bxw> $$0, csz $$1, blz $$2, hv $$3, auf $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(ctb $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hv $$1 = this.dm();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         dip $$2 = $$0.a_($$1.d());
         if ($$2.a(cwb.i) || $$2.a(arr.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      if ($$3 == null) {
         $$3 = new bla.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public elb cJ() {
      return new elb(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends blv> extends bry<T> {
      private final bxw i;

      public a(bxw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bli.e::test);
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

   static class b extends btz {
      private final bxw c;

      public b(bxw $$0, double $$1, cpi $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
