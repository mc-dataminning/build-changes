import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bym extends bxy {
   public static final double bT = 0.6;
   public static final double bU = 0.8;
   public static final double bW = 1.33;
   private static final cpz bX = cpz.a(cnb.qW, cnb.qX);
   private static final agm<Boolean> bY = agp.a(bym.class, ago.k);
   @Nullable
   private bym.a<cfi> bZ;
   @Nullable
   private bym.b ca;

   public bym(blz<? extends bym> $$0, ctp $$1) {
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Trusting", this.A());
   }

   @Override
   public void a(sn $$0) {
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
      this.ca = new bym.b(this, 0.6, bX, true);
      this.bO.a(1, new btb(this));
      this.bO.a(3, this.ca);
      this.bO.a(7, new btn(this, 0.3F));
      this.bO.a(8, new btx(this));
      this.bO.a(9, new bst(this, 0.8));
      this.bO.a(10, new buu(this, 0.8, 1.0000001E-5F));
      this.bO.a(11, new btp(this, cfi.class, 10.0F));
      this.bP.a(1, new bva<>(this, byd.class, false));
      this.bP.a(1, new bva<>(this, byz.class, 10, false, false, byz.bU));
   }

   @Override
   public void Z() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bmx.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bmx.a);
            this.g(true);
         } else {
            this.b(bmx.a);
            this.g(false);
         }
      } else {
         this.b(bmx.a);
         this.g(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.A() && this.ah > 2400;
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 0.3F).a(bnr.c, 3.0);
   }

   @Nullable
   @Override
   protected arr y() {
      return ars.ru;
   }

   @Override
   public int Q() {
      return 900;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.rt;
   }

   @Override
   protected arr n_() {
      return ars.rv;
   }

   private float ge() {
      return (float)this.b(bnr.c);
   }

   @Override
   public boolean C(blv $$0) {
      return $$0.a(this.dN().b((bml)this), this.ge());
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
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

         return bkb.a(this.dM().B);
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
         this.bZ = new bym.a<>(this, cfi.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.bZ);
      if (!this.A()) {
         this.bO.a(4, this.bZ);
      }
   }

   @Nullable
   public bym b(and $$0, blq $$1) {
      return blz.ar.a((ctp)$$0);
   }

   @Override
   public boolean m(cmy $$0) {
      return bX.a($$0);
   }

   public static boolean c(blz<bym> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(cts $$0) {
      if ($$0.f(this) && !$$0.d(this.cH())) {
         hx $$1 = this.dm();
         if ($$1.v() < $$0.A_()) {
            return false;
         }

         djh $$2 = $$0.a_($$1.d());
         if ($$2.a(cws.i) || $$2.a(ash.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if ($$3 == null) {
         $$3 = new blq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public elt cJ() {
      return new elt(0.0, (double)(0.5F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - 0.0625F * $$2, 0.0F);
   }

   static class a<T extends bml> extends bso<T> {
      private final bym i;

      public a(bym $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bly.e::test);
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

   static class b extends bup {
      private final bym c;

      public b(bym $$0, double $$1, cpz $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.A();
      }
   }
}
