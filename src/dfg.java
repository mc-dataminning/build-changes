import com.mojang.serialization.MapCodec;

public class dfg extends dal {
   public static final MapCodec<dfg> a = b(dfg::new);
   protected static final eqm b = dac.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dae.dX) || super.b($$0, $$1, $$2);
   }
}
