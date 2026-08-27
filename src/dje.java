import com.mojang.serialization.MapCodec;

public class dje extends dal {
   public static final MapCodec<dje> a = b(dje::new);
   protected static final eqm b = dac.a(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(dna.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dnb $$0, cxb $$1, ib $$2, box $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$1 instanceof apf && $$3 instanceof ckr) {
         $$1.a(new ib($$2), true, $$3);
      }
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      eip $$3 = $$1.b_($$2);
      eip $$4 = $$1.b_($$2.c());
      return ($$3.a() == eiq.c || $$0.b() instanceof ddz) && $$4.a() == eiq.a;
   }
}
