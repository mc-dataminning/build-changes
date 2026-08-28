import com.mojang.serialization.MapCodec;

public class dhe extends dfo {
   public static final MapCodec<dhe> a = b(dhe::new);
   protected static final float b = 6.0F;
   protected static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   protected dhe(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.cl);
   }
}
