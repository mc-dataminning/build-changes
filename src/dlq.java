import com.mojang.serialization.MapCodec;

public class dlq extends dfo {
   public static final MapCodec<dlq> a = b(dlq::new);
   protected static final float b = 6.0F;
   protected static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlq> a() {
      return a;
   }

   protected dlq(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.aL) || $$0.a(dfh.dX) || super.b($$0, $$1, $$2);
   }
}
