import com.mojang.serialization.MapCodec;

public class dnf extends dmm {
   public static final MapCodec<dnf> a = b(dnf::new);
   private static final ffr b = dmm.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends dnf> a() {
      return a;
   }

   public dnf(ean.d $$0) {
      super($$0);
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return b;
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return !$$0.a($$1, $$3) ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return !$$1.v($$2.e());
   }
}
