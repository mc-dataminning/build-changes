import javax.annotation.Nullable;

public class cbl extends cbe {
   private static final bpa bX = bpd.x.n().a(0.5F).b(0.665F);

   public cbl(bpd<? extends cbl> $$0, cxb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwg(this));
      this.bR.a(1, new bxf(this, 2.0));
      this.bR.a(2, new bvy(this, 1.0));
      this.bR.a(3, new bxu(this, 1.25, ctm.a(cqp.pv), false));
      this.bR.a(4, new bwl(this, 1.25));
      this.bR.a(5, new bxz(this, 1.0));
      this.bR.a(6, new bwu(this, ciu.class, 6.0F));
      this.bR.a(7, new bxh(this));
   }

   public static bqv.a r() {
      return bpr.A().a(bqw.q, 10.0).a(bqw.r, 0.2F);
   }

   @Override
   protected atx v() {
      return aty.fV;
   }

   @Override
   protected atx d(bnw $$0) {
      return aty.fX;
   }

   @Override
   protected atx n_() {
      return aty.fW;
   }

   @Override
   protected void b(ib $$0, dnb $$1) {
      this.a(aty.fZ, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.qx) && !this.o_()) {
         $$0.a(aty.fY, 1.0F, 1.0F);
         cqm $$3 = cqo.a($$2, $$0, cqp.qD.am_());
         $$0.a($$1, $$3);
         return bnd.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cbl b(apf $$0, bos $$1) {
      return bpd.x.a((cxb)$$0);
   }

   @Override
   public bpa e(bqa $$0) {
      return this.o_() ? bX : super.e($$0);
   }
}
