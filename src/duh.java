import com.mojang.serialization.MapCodec;

public class duh extends dlz {
   public static final MapCodec<duh> b = b(duh::new);

   @Override
   public MapCodec<duh> a() {
      return b;
   }

   public duh(ean.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      return this.a($$0, $$1, $$3) ? this.m() : dmo.a.m();
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(eao $$0) {
      return $$0.a(axc.aV);
   }

   @Override
   protected boolean g(eao $$0) {
      return true;
   }
}
