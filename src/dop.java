import com.mojang.serialization.MapCodec;

public class dop extends diq {
   public static final MapCodec<dop> c = b(dop::new);
   protected static final ewm g = dfb.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dop> a() {
      return c;
   }

   public dop(dsd.d $$0) {
      super($$0, je.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dkh.a($$0);
   }

   @Override
   protected dfb b() {
      return dfd.oA;
   }

   @Override
   protected boolean g(dse $$0) {
      return dkh.a($$0);
   }
}
