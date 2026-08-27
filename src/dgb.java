import com.mojang.serialization.MapCodec;

public class dgb extends dae {
   public static final MapCodec<dgb> c = b(dgb::new);
   protected static final eml g = cwp.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dgb> a() {
      return c;
   }

   public dgb(djf.d $$0) {
      super($$0, ic.a, g, false, 0.1);
   }

   @Override
   protected int a(auu $$0) {
      return dbu.a($$0);
   }

   @Override
   protected cwp b() {
      return cwr.oA;
   }

   @Override
   protected boolean g(djg $$0) {
      return dbu.a($$0);
   }
}
