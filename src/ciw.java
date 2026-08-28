import javax.annotation.Nullable;

public class ciw extends cio {
   private static final bwd bF = bwj.C.n().a(0.5F).b(0.665F);

   public ciw(bwj<? extends ciw> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new ceo(this, 2.0));
      this.bC.a(2, new cdh(this, 1.0));
      this.bC.a(3, new cfd(this, 1.25, $$0 -> $$0.a(axi.ad), false));
      this.bC.a(4, new cdu(this, 1.25));
      this.bC.a(5, new cfi(this, 1.0));
      this.bC.a(6, new ced(this, cqs.class, 6.0F));
      this.bC.a(7, new ceq(this));
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.ad);
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 10.0).a(byf.v, 0.2F);
   }

   @Override
   protected awk u() {
      return awl.gd;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.gf;
   }

   @Override
   protected awk l_() {
      return awl.ge;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.rj) && !this.n_()) {
         $$0.a(awl.gg, 1.0F, 1.0F);
         cys $$3 = cyv.a($$2, $$0, cyw.rp.m());
         $$0.a($$1, $$3);
         return bty.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public ciw b(aro $$0, bvq $$1) {
      return bwj.C.a($$0, bwi.e);
   }

   @Override
   public bwd e(bxl $$0) {
      return this.n_() ? bF : super.e($$0);
   }
}
