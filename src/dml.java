import com.mojang.serialization.MapCodec;

public class dml extends dny {
   public static final MapCodec<dml> b = b(dml::new);

   @Override
   public MapCodec<dml> a() {
      return b;
   }

   protected dml(dtz.d $$0) {
      super(dny.b.e, $$0);
   }
}
