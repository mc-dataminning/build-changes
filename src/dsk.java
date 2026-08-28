import com.mojang.serialization.MapCodec;

public class dsk extends dna {
   public static final MapCodec<dsk> c = b(dsk::new);
   public static final fbt e = djl.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dsk> a() {
      return c;
   }

   public dsk(dwv.d $$0) {
      super($$0, jn.b, e, false);
   }

   @Override
   protected dnb c() {
      return (dnb)djn.pd;
   }
}
