import javax.annotation.Nullable;

public class chj extends cgn implements cgt, cjl {
   private static final aja<Boolean> b = aje.a(chj.class, ajc.k);
   private static final int e = 5;
   private static final int bX = 300;
   private final boo bY = new boo(5);

   public chj(bqg<? extends chj> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bxk(this));
      this.bR.a(2, new clm.a(this, 10.0F));
      this.bR.a(3, new byr<>(this, 1.0, 8.0F));
      this.bR.a(8, new byn(this, 0.6));
      this.bR.a(9, new bxy(this, cka.class, 15.0F, 1.0F));
      this.bR.a(10, new bxy(this, bqv.class, 15.0F));
      this.bS.a(1, new bzi(this, clm.class).a());
      this.bS.a(2, new bzj<>(this, cka.class, true));
      this.bS.a(3, new bzj<>(this, cji.class, false));
      this.bS.a(3, new bzj<>(this, ccu.class, true));
   }

   public static brz.a u() {
      return chg.gt().a(bsa.r, 0.35F).a(bsa.q, 24.0).a(bsa.c, 5.0).a(bsa.k, 32.0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(csi $$0) {
      return $$0 == crv.vR;
   }

   public boolean gn() {
      return this.an.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.an.a(b, $$0);
   }

   @Override
   public void a() {
      this.be = 0;
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.b($$0, this.dO());
   }

   @Override
   public cgn.a r() {
      if (this.gn()) {
         return cgn.a.f;
      } else if (this.b(crv.vR)) {
         return cgn.a.e;
      } else {
         return this.gf() ? cgn.a.b : cgn.a.h;
      }
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.a($$0, this.dO());
      this.s(true);
   }

   @Override
   public float a(id $$0, czj $$1) {
      return 0.0F;
   }

   @Override
   public int fO() {
      return 1;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      axt $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axt $$0, bod $$1) {
      this.a(bqh.a, new crs(crv.vR));
   }

   @Override
   protected void a(axt $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         crs $$2 = this.eU();
         if ($$2.a(crv.vR)) {
            $$2.a(cxc.K, 1);
            this.a(bqh.a, $$2);
         }
      }
   }

   @Override
   protected aun v() {
      return auo.tz;
   }

   @Override
   protected aun o_() {
      return auo.tB;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.tC;
   }

   @Override
   public void a(bqt $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public boo y() {
      return this.bY;
   }

   @Override
   protected void b(cgk $$0) {
      crs $$1 = $$0.p();
      if ($$1.f() instanceof cpn) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         crs $$2 = this.bY.a($$1);
         if ($$2.d()) {
            $$0.am();
         } else {
            $$1.e($$2.G());
         }
      }
   }

   private boolean n(crs $$0) {
      return this.gC() && $$0.a(crv.uN);
   }

   @Override
   public brk a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bY.b() ? brk.a(this.bY, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cll $$2 = this.gB();
      boolean $$3 = this.ag.i() <= $$2.v();
      if ($$3) {
         crs $$4 = new crs(crv.vR);
         if ($$0 > $$2.a(boc.c)) {
            $$4.a(cxc.J, 2);
         } else if ($$0 > $$2.a(boc.b)) {
            $$4.a(cxc.J, 1);
         }

         $$4.a(cxc.I, 1);
         this.a(bqh.a, $$4);
      }
   }

   @Override
   public aun ae_() {
      return auo.tA;
   }
}
