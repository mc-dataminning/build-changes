import javax.annotation.Nullable;

public class caa extends bzt {
   private static final bnr bT = bnu.v.n().a(0.5F).b(0.665F);

   public caa(bnu<? extends caa> $$0, cvn $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(0, new buv(this));
      this.bO.a(1, new bvu(this, 2.0));
      this.bO.a(2, new bun(this, 1.0));
      this.bO.a(3, new bwj(this, 1.25, cry.a(cpc.pv), false));
      this.bO.a(4, new bva(this, 1.25));
      this.bO.a(5, new bwo(this, 1.0));
      this.bO.a(6, new bvj(this, chh.class, 6.0F));
      this.bO.a(7, new bvw(this));
   }

   public static bpk.a u() {
      return boi.C().a(bpl.n, 10.0).a(bpl.o, 0.2F);
   }

   @Override
   protected atj y() {
      return atk.fN;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.fP;
   }

   @Override
   protected atj n_() {
      return atk.fO;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(atk.fR, 0.15F, 1.0F);
   }

   @Override
   protected float eW() {
      return 0.4F;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.qx) && !this.o_()) {
         $$0.a(atk.fQ, 1.0F, 1.0F);
         coz $$3 = cpb.a($$2, $$0, cpc.qD.ao_());
         $$0.a($$1, $$3);
         return blu.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Nullable
   public caa b(aov $$0, bnj $$1) {
      return bnu.v.a((cvn)$$0);
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? bT : super.e($$0);
   }
}
