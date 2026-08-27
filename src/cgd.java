import javax.annotation.Nullable;

public class cgd extends cfh implements cfn, cif {
   private static final aim<Boolean> b = aiq.a(cgd.class, aio.k);
   private static final int e = 5;
   private static final int bX = 300;
   private static final float bY = 1.6F;
   private final bnm bZ = new bnm(5);

   public cgd(bpd<? extends cgd> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      super.z();
      this.bR.a(0, new bwg(this));
      this.bR.a(2, new ckg.a(this, 10.0F));
      this.bR.a(3, new bxn<>(this, 1.0, 8.0F));
      this.bR.a(8, new bxj(this, 0.6));
      this.bR.a(9, new bwu(this, ciu.class, 15.0F, 1.0F));
      this.bR.a(10, new bwu(this, bpr.class, 15.0F));
      this.bS.a(1, new bye(this, ckg.class).a());
      this.bS.a(2, new byf<>(this, ciu.class, true));
      this.bS.a(3, new byf<>(this, cic.class, false));
      this.bS.a(3, new byf<>(this, cbq.class, true));
   }

   public static bqv.a s() {
      return cga.gt().a(bqw.r, 0.35F).a(bqw.q, 24.0).a(bqw.c, 5.0).a(bqw.k, 32.0);
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
   }

   @Override
   public boolean a(crc $$0) {
      return $$0 == cqp.vR;
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
   public void b(ta $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public cfh.a r() {
      if (this.gn()) {
         return cfh.a.f;
      } else if (this.b(cqp.vR)) {
         return cfh.a.e;
      } else {
         return this.gf() ? cfh.a.b : cfh.a.h;
      }
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      this.c($$0);
      this.s(true);
   }

   @Override
   public float a(ib $$0, cxe $$1) {
      return 0.0F;
   }

   @Override
   public int fO() {
      return 1;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      axd $$4 = $$0.E_();
      this.a($$4, $$1);
      this.b($$4, $$1);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(axd $$0, bnb $$1) {
      this.a(bpe.a, new cqm(cqp.vR));
   }

   @Override
   protected void a(axd $$0, float $$1) {
      super.a($$0, $$1);
      if ($$0.a(300) == 0) {
         cqm $$2 = this.eU();
         if ($$2.a(cqp.vR)) {
            $$2.a(cuz.K, 1);
            this.a(bpe.a, $$2);
         }
      }
   }

   @Override
   protected atx v() {
      return aty.tw;
   }

   @Override
   protected atx n_() {
      return aty.ty;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.tz;
   }

   @Override
   public void a(bpp $$0, float $$1) {
      this.b(this, 1.6F);
   }

   @Override
   public void a(bpp $$0, cqm $$1, cjm $$2, float $$3) {
      this.a(this, $$0, $$2, $$3, 1.6F);
   }

   @Override
   public bnm y() {
      return this.bZ;
   }

   @Override
   protected void b(cfe $$0) {
      cqm $$1 = $$0.p();
      if ($$1.d() instanceof coe) {
         super.b($$0);
      } else if (this.n($$1)) {
         this.a($$0);
         cqm $$2 = this.bZ.a($$1);
         if ($$2.b()) {
            $$0.am();
         } else {
            $$1.f($$2.M());
         }
      }
   }

   private boolean n(cqm $$0) {
      return this.gC() && $$0.a(cqp.uN);
   }

   @Override
   public bqg a_(int $$0) {
      int $$1 = $$0 - 300;
      return $$1 >= 0 && $$1 < this.bZ.b() ? bqg.a(this.bZ, $$1) : super.a_($$0);
   }

   @Override
   public void a(int $$0, boolean $$1) {
      ckf $$2 = this.gB();
      boolean $$3 = this.ag.i() <= $$2.w();
      if ($$3) {
         cqm $$4 = new cqm(cqp.vR);
         if ($$0 > $$2.a(bna.c)) {
            $$4.a(cuz.J, 2);
         } else if ($$0 > $$2.a(bna.b)) {
            $$4.a(cuz.J, 1);
         }

         $$4.a(cuz.I, 1);
         this.a(bpe.a, $$4);
      }
   }

   @Override
   public atx ae_() {
      return aty.tx;
   }
}
