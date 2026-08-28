import com.mojang.serialization.MapCodec;

public class dov extends diw {
   public static final MapCodec<dov> c = b(dov::new);
   protected static final ewy g = dfh.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dov> a() {
      return c;
   }

   public dov(dsj.d $$0) {
      super($$0, jf.a, g, false, 0.1);
   }

   @Override
   protected int a(ayo $$0) {
      return dkn.a($$0);
   }

   @Override
   protected dfh b() {
      return dfj.oA;
   }

   @Override
   protected boolean g(dsk $$0) {
      return dkn.a($$0);
   }
}
