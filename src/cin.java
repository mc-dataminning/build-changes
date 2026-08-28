import javax.annotation.Nullable;

public class cin extends cig {
   private static final bvv bE = bwb.C.n().a(0.5F).b(0.665F);

   public cin(bwb<? extends cin> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(0, new cdh(this));
      this.bB.a(1, new ceg(this, 2.0));
      this.bB.a(2, new ccz(this, 1.0));
      this.bB.a(3, new cev(this, 1.25, $$0 -> $$0.a(axi.ad), false));
      this.bB.a(4, new cdm(this, 1.25));
      this.bB.a(5, new cfa(this, 1.0));
      this.bB.a(6, new cdv(this, cqi.class, 6.0F));
      this.bB.a(7, new cei(this));
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ad);
   }

   public static bxw.a q() {
      return cig.gv().a(bxx.s, 10.0).a(bxx.v, 0.2F);
   }

   @Override
   protected awj u() {
      return awk.gd;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.gf;
   }

   @Override
   protected awj l_() {
      return awk.ge;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.gh, 0.15F, 1.0F);
   }

   @Override
   protected float fd() {
      return 0.4F;
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.rj) && !this.n_()) {
         $$0.a(awk.gg, 1.0F, 1.0F);
         cxy $$3 = cyb.a($$2, $$0, cyc.rp.n());
         $$0.a($$1, $$3);
         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public cin b(arn $$0, bvi $$1) {
      return bwb.C.a($$0, bwa.e);
   }

   @Override
   public bvv e(bxd $$0) {
      return this.n_() ? bE : super.e($$0);
   }
}
