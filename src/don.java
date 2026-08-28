import com.mojang.serialization.MapCodec;

public class don extends dio {
   public static final MapCodec<don> c = b(don::new);
   protected static final ewk g = dez.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<don> a() {
      return c;
   }

   public don(dsb.d $$0) {
      super($$0, je.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dkf.a($$0);
   }

   @Override
   protected dez b() {
      return dfb.oA;
   }

   @Override
   protected boolean g(dsc $$0) {
      return dkf.a($$0);
   }
}
