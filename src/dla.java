import com.mojang.serialization.MapCodec;

public class dla extends dhc {
   public static final MapCodec<dla> a = b(dla::new);
   private static final ewy[] b = new ewy[]{
      dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dfh.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected dce d() {
      return cuf.ug;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b[this.g($$0)];
   }
}
