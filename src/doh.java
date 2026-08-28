import com.mojang.serialization.MapCodec;

public class doh extends dgi {
   public static final MapCodec<doh> c = b(doh::new);

   @Override
   public MapCodec<doh> a() {
      return c;
   }

   public doh(dtz.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dgx.a.o();
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dua $$0) {
      return $$0.a(aws.aU);
   }

   @Override
   protected boolean g(dua $$0) {
      return true;
   }
}
