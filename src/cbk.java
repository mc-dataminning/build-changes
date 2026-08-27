import javax.annotation.Nullable;

public class cbk extends cbd {
   private static final boz bX = bpc.w.n().a(0.5F).b(0.665F);

   public cbk(bpc<? extends cbk> $$0, cwz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(0, new bwf(this));
      this.bR.a(1, new bxe(this, 2.0));
      this.bR.a(2, new bvx(this, 1.0));
      this.bR.a(3, new bxt(this, 1.25, ctk.a(cqn.pv), false));
      this.bR.a(4, new bwk(this, 1.25));
      this.bR.a(5, new bxy(this, 1.0));
      this.bR.a(6, new bwt(this, cis.class, 6.0F));
      this.bR.a(7, new bxg(this));
   }

   public static bqu.a r() {
      return bpq.A().a(bqv.q, 10.0).a(bqv.r, 0.2F);
   }

   @Override
   protected atx v() {
      return aty.fR;
   }

   @Override
   protected atx d(bnv $$0) {
      return aty.fT;
   }

   @Override
   protected atx n_() {
      return aty.fS;
   }

   @Override
   protected void b(ib $$0, dmz $$1) {
      this.a(aty.fV, 0.15F, 1.0F);
   }

   @Override
   protected float fb() {
      return 0.4F;
   }

   @Override
   public bnc b(cis $$0, bnb $$1) {
      cqk $$2 = $$0.b($$1);
      if ($$2.a(cqn.qx) && !this.o_()) {
         $$0.a(aty.fU, 1.0F, 1.0F);
         cqk $$3 = cqm.a($$2, $$0, cqn.qD.am_());
         $$0.a($$1, $$3);
         return bnc.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cbk b(apf $$0, bor $$1) {
      return bpc.w.a((cwz)$$0);
   }

   @Override
   public boz e(bpz $$0) {
      return this.o_() ? bX : super.e($$0);
   }
}
