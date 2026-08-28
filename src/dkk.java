import com.mojang.serialization.MapCodec;

public class dkk extends dfo {
   public static final MapCodec<dkk> a = b(dkk::new);
   protected static final ews b = dff.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      return $$0.a(avu.aL) || $$0.a(dfh.dX) || super.b($$0, $$1, $$2);
   }
}
