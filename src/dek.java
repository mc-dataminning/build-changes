import com.mojang.serialization.MapCodec;

public class dek extends cyp {
   public static final MapCodec<dek> c = b(dek::new);
   protected static final ekn g = cva.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dek> a() {
      return c;
   }

   public dek(dhh.d $$0) {
      super($$0, hx.a, g, false, 0.1);
   }

   @Override
   protected int a(ats $$0) {
      return daf.a($$0);
   }

   @Override
   protected cva b() {
      return cvc.oA;
   }

   @Override
   protected boolean g(dhi $$0) {
      return daf.a($$0);
   }
}
