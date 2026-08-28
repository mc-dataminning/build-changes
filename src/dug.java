import com.mojang.serialization.MapCodec;

public class dug extends dmm {
   public static final MapCodec<dug> b = b(dug::new);
   public static final ebf c = ebe.E;

   @Override
   protected MapCodec<? extends dug> a() {
      return b;
   }

   protected dug(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return $$4 == jb.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(eao $$0) {
      return $$0.a(axc.bC);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(c);
   }
}
