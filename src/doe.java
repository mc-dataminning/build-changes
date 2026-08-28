import com.mojang.serialization.MapCodec;

public class doe extends dfk {
   public static final MapCodec<doe> a = b(doe::new);
   protected static final ewm b = dfb.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<doe> a() {
      return a;
   }

   protected doe(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, bsw $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof arf && $$3 instanceof cox) {
         $$1.a(new iz($$2), true, $$3);
      }
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected boolean b(dse $$0, dbg $$1, iz $$2) {
      enx $$3 = $$1.b_($$2);
      enx $$4 = $$1.b_($$2.c());
      return ($$3.a() == eny.c || $$0.b() instanceof diz) && $$4.a() == eny.a;
   }
}
