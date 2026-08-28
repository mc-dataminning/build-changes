import com.mojang.serialization.MapCodec;

public class dtf extends dna {
   public static final MapCodec<dtf> c = b(dtf::new);
   public static final fbt e = djl.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dtf> a() {
      return c;
   }

   public dtf(dwv.d $$0) {
      super($$0, jn.a, e, false);
   }

   @Override
   protected dnb c() {
      return (dnb)djn.pb;
   }
}
