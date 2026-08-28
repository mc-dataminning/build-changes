import com.mojang.serialization.MapCodec;

public class dol extends dfr {
   public static final MapCodec<dol> a = b(dol::new);
   protected static final exa b = dfi.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, bsh $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aqm && $$3 instanceof coi) {
         $$1.a(new ja($$2), true, $$3);
      }
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      eoj $$3 = $$1.b_($$2);
      eoj $$4 = $$1.b_($$2.c());
      return ($$3.a() == eok.c || $$0.b() instanceof djg) && $$4.a() == eok.a;
   }
}
