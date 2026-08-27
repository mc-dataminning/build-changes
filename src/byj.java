import javax.annotation.Nullable;

public class byj extends byc {
   private static final blz bU = bmc.v.n().a(0.5F).b(0.665F);

   public byj(bmc<? extends byj> $$0, ctx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bP.a(0, new bte(this));
      this.bP.a(1, new bud(this, 2.0));
      this.bP.a(2, new bsw(this, 1.0));
      this.bP.a(3, new bus(this, 1.25, cqh.a(cnj.pv), false));
      this.bP.a(4, new btj(this, 1.25));
      this.bP.a(5, new bux(this, 1.0));
      this.bP.a(6, new bts(this, cfq.class, 6.0F));
      this.bP.a(7, new buf(this));
   }

   public static bnt.a u() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 0.2F);
   }

   @Override
   protected ars y() {
      return art.fN;
   }

   @Override
   protected ars d(bkv $$0) {
      return art.fP;
   }

   @Override
   protected ars n_() {
      return art.fO;
   }

   @Override
   protected void b(hx $$0, djp $$1) {
      this.a(art.fR, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if ($$2.a(cnj.qx) && !this.o_()) {
         $$0.a(art.fQ, 1.0F, 1.0F);
         cng $$3 = cni.a($$2, $$0, cnj.qD.ao_());
         $$0.a($$1, $$3);
         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public byj b(ane $$0, blr $$1) {
      return bmc.v.a((ctx)$$0);
   }

   @Override
   public blz e(bna $$0) {
      return this.o_() ? bU : super.e($$0);
   }
}
