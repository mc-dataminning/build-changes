import com.mojang.serialization.MapCodec;

public class dol extends dim {
   public static final MapCodec<dol> c = b(dol::new);
   protected static final ewi g = dex.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dol> a() {
      return c;
   }

   public dol(drz.d $$0) {
      super($$0, je.a, g, false, 0.1);
   }

   @Override
   protected int a(azf $$0) {
      return dkd.a($$0);
   }

   @Override
   protected dex b() {
      return dez.oA;
   }

   @Override
   protected boolean g(dsa $$0) {
      return dkd.a($$0);
   }
}
