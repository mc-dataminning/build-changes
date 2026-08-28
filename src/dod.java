import com.mojang.serialization.MapCodec;

public class dod extends dfj {
   public static final MapCodec<dod> a = b(dod::new);
   protected static final ewl b = dfa.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dod> a() {
      return a;
   }

   protected dod(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dsd $$0, dbz $$1, iz $$2, bsv $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arf && $$3 instanceof cow) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected boolean b(dsd $$0, dbf $$1, iz $$2) {
      enw $$3 = $$1.b_($$2);
      enw $$4 = $$1.b_($$2.c());
      return ($$3.a() == enx.c || $$0.b() instanceof diy) && $$4.a() == enx.a;
   }
}
