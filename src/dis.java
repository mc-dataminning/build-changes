import com.mojang.serialization.MapCodec;

public class dis extends dcu {
   public static final MapCodec<dis> c = b(dis::new);
   protected static final epo g = czf.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dis> a() {
      return c;
   }

   public dis(dmd.d $$0) {
      super($$0, ih.a, g, false, 0.1);
   }

   @Override
   protected int a(awt $$0) {
      return dek.a($$0);
   }

   @Override
   protected czf b() {
      return czh.oA;
   }

   @Override
   protected boolean g(dme $$0) {
      return dek.a($$0);
   }
}
