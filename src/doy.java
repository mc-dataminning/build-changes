import com.mojang.serialization.MapCodec;

public class doy extends dgz {
   public static final MapCodec<doy> c = b(doy::new);

   @Override
   public MapCodec<doy> a() {
      return c;
   }

   public doy(dur.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dho.a.n();
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      return o($$1.a_($$2.e()));
   }

   public static boolean o(dus $$0) {
      return $$0.a(awv.aU);
   }

   @Override
   protected boolean g(dus $$0) {
      return true;
   }
}
