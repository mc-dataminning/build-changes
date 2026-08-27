import com.mojang.serialization.MapCodec;

public class dht extends czb {
   public static final MapCodec<dht> a = b(dht::new);
   protected static final eos b = cys.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dht> a() {
      return a;
   }

   protected dht(dli.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, bnq $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof aow && $$3 instanceof cjg) {
         $$1.a(new hz($$2), true, $$3);
      }
   }

   @Override
   protected eos a(dlj $$0, cux $$1, hz $$2, eoe $$3) {
      return b;
   }

   @Override
   protected boolean b(dlj $$0, cux $$1, hz $$2) {
      egw $$3 = $$1.b_($$2);
      egw $$4 = $$1.b_($$2.c());
      return ($$3.a() == egx.c || $$0.b() instanceof dcp) && $$4.a() == egx.a;
   }
}
