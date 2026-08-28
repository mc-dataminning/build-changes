import com.mojang.serialization.MapCodec;

public class doi extends dij {
   public static final MapCodec<doi> c = b(doi::new);
   protected static final ewf g = deu.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<doi> a() {
      return c;
   }

   public doi(drw.d $$0) {
      super($$0, je.a, g, false, 0.1);
   }

   @Override
   protected int a(azc $$0) {
      return dka.a($$0);
   }

   @Override
   protected deu b() {
      return dew.oA;
   }

   @Override
   protected boolean g(drx $$0) {
      return dka.a($$0);
   }
}
