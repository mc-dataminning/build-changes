import com.mojang.serialization.MapCodec;

public class dnq extends dim {
   public static final MapCodec<dnq> c = b(dnq::new);
   public static final ewi g = dex.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dnq> a() {
      return c;
   }

   public dnq(drz.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azf $$0) {
      return dkd.a($$0);
   }

   @Override
   protected dex b() {
      return dez.oC;
   }

   @Override
   protected boolean g(dsa $$0) {
      return dkd.a($$0);
   }
}
