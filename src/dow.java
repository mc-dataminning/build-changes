import com.mojang.serialization.MapCodec;

public class dow extends dix {
   public static final MapCodec<dow> c = b(dow::new);
   protected static final exa g = dfi.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dow> a() {
      return c;
   }

   public dow(dsk.d $$0) {
      super($$0, jf.a, g, false, 0.1);
   }

   @Override
   protected int a(ayo $$0) {
      return dko.a($$0);
   }

   @Override
   protected dfi b() {
      return dfk.oA;
   }

   @Override
   protected boolean g(dsl $$0) {
      return dko.a($$0);
   }
}
