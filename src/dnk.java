import com.mojang.serialization.MapCodec;

public class dnk extends dfo implements dfi {
   public static final MapCodec<dnk> a = b(dnk::new);
   protected static final float b = 6.0F;
   protected static final ews c = dff.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   protected dnk(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return c;
   }

   @Override
   public boolean b(dcg $$0, ja $$1, dsh $$2) {
      return true;
   }

   @Override
   public boolean a(dcd $$0, aym $$1, ja $$2, dsh $$3) {
      return true;
   }

   @Override
   public void a(aqk $$0, aym $$1, ja $$2, dsh $$3) {
      dhn $$4 = (dhn)($$3.a(dfh.bu) ? dfh.iI : dfh.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhn.a($$0, $$4.o(), $$2, 2);
      }
   }
}
