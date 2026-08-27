import javax.annotation.Nullable;

public class cjg extends cij implements cip, clj {
   private static final ajy<Boolean> b = akc.a(cjg.class, aka.k);
   private static final int e = 5;
   private static final int ch = 300;
   private final bqj ci = new bqj(5);

   public cjg(bsb<? extends cjg> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(2, new cnn.a(this, 10.0F));
      this.cb.a(3, new cam<>(this, 1.0, 8.0F));
      this.cb.a(8, new cai(this, 0.6));
      this.cb.a(9, new bzt(this, cly.class, 15.0F, 1.0F));
      this.cb.a(10, new bzt(this, bsq.class, 15.0F));
      this.cc.a(1, new cbd(this, cnn.class).a());
      this.cc.a(2, new cbe<>(this, cly.class, true));
      this.cc.a(3, new cbe<>(this, clg.class, false));
      this.cc.a(3, new cbe<>(this, ceq.class, true));
   }

   public static btu.a t() {
      return cjd.gG().a(btv.r, 0.35F).a(btv.q, 24.0).a(btv.c, 5.0).a(btv.k, 32.0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(cvi $$0) {
      return $$0 == cuk.xE;
   }

   public boolean gy() {
      return this.as.a(b);
   }

   @Override
   public void b(boolean $$0) {
      this.as.a(b, $$0);
   }

   @Override
   public void a() {
      this.bq = 0;
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.b($$0, this.dY());
   }

   @Override
   public cij.a r() {
      if (this.gy()) {
         return cij.a.f;
      } else if (this.b(cuk.xE)) {
         return cij.a.e;
      } else {
         return this.gq() ? cij.a.b : cij.a.h;
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a($$0, this.dY());
      this.a_(true);
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return 0.0F;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      ayt $$4 = $$0.F_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ayt $$0, bpy $$1) {
      this.a(bsc.a, new cuh(cuk.xE));
   }

   @Override
   protected void a(ayt $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cuh $$2 = this.fg();
         if ($$2.a(cuk.xE)) {
            $$2.a(dag.L, 1);
            this.a(bsc.a, $$2);
         }
      }
   }

   @Override
   protected avn u() {
      return avo.uq;
   }

   @Override
   protected avn n_() {
      return avo.us;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.ut;
   }

   @Override
   public void a(bso $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public bqj x() {
      return this.ci;
   }

   @Override
   protected void b(cig $$0) {
      cuh $$1 = $$0.p();
      if ($$1.f() instanceof crz) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cuh $$2 = this.ci.b($$1);
         if ($$2.d()) {
            $$0.ao();
         } else {
            $$1.e($$2.G());
         }
      }
   }

   private boolean n(cuh $$0) {
      return this.gN() && $$0.a(cuk.wA);
   }

   @Override
   public btf a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.ci.b() ? btf.a(this.ci, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      cnm $$2 = this.gM();
      boolean $$3 = this.al.i() <= $$2.v();
      if ($$3) {
         cuh $$4 = new cuh(cuk.xE);
         if ($$0 > $$2.a(bpx.c)) {
            $$4.a(dag.K, 2);
         } else if ($$0 > $$2.a(bpx.b)) {
            $$4.a(dag.K, 1);
         }

         $$4.a(dag.J, 1);
         this.a(bsc.a, $$4);
      }
   }

   @Override
   public avn af_() {
      return avo.ur;
   }
}
