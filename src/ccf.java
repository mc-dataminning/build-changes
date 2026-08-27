import javax.annotation.Nullable;

public class ccf extends cbv {
   private static final bnr bT = bnu.bt.n().a(bnq.a().a(bnp.a, 0.0F, bnu.bt.l() - 0.03125F, 0.0F)).a(0.5F);

   public ccf(bnu<? extends ccf> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public static bpk.a u() {
      return gG().a(bpl.n, 15.0).a(bpl.o, 0.2F);
   }

   public static boolean c(bnu<? extends bzt> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      return !bok.a($$2) ? bzt.b($$0, $$1, $$2, $$3, $$4) : bok.b($$2) || a($$1, $$3);
   }

   @Override
   protected void a(awo $$0) {
      this.f(bpl.j).a(a($$0::j));
   }

   @Override
   protected atj y() {
      return atk.Cy;
   }

   @Override
   protected atj n_() {
      return atk.Cz;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.CA;
   }

   @Nullable
   @Override
   public bnj a(aov $$0, bnj $$1) {
      return bnu.bt.a((cvn)$$0);
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      return !this.gv() ? blu.d : super.b($$0, $$1);
   }

   @Override
   protected void gw() {
   }

   @Override
   public bnr e(bor $$0) {
      return this.o_() ? bT : super.e($$0);
   }
}
