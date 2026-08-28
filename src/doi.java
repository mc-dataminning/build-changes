import com.mojang.serialization.MapCodec;

public class doi extends dfo {
   public static final MapCodec<doi> a = b(doi::new);
   protected static final ews b = dff.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   protected doi(dsg.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsh $$0, dcd $$1, ja $$2, bsd $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqk && $$3 instanceof coe) {
         $$1.a(new ja($$2), true, $$3);
      }
   }

   @Override
   protected ews a(dsh $$0, dbj $$1, ja $$2, ewe $$3) {
      return b;
   }

   @Override
   protected boolean b(dsh $$0, dbj $$1, ja $$2) {
      eob $$3 = $$1.b_($$2);
      eob $$4 = $$1.b_($$2.c());
      return ($$3.a() == eoc.c || $$0.b() instanceof djd) && $$4.a() == eoc.a;
   }
}
