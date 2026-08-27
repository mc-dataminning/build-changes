import com.mojang.serialization.MapCodec;

public class dih extends czo {
   public static final MapCodec<dih> a = b(dih::new);
   protected static final epo b = czf.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dih> a() {
      return a;
   }

   protected dih(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dme $$0, cwe $$1, ib $$2, bof $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof apa && $$3 instanceof cjv) {
         $$1.a(new ib($$2), true, $$3);
      }
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return b;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      ehr $$3 = $$1.b_($$2);
      ehr $$4 = $$1.b_($$2.c());
      return ($$3.a() == ehs.c || $$0.b() instanceof ddc) && $$4.a() == ehs.a;
   }
}
