import com.mojang.serialization.MapCodec;

public class dfu extends dbx {
   public static final MapCodec<dfu> a = b(dfu::new);
   private static final eqm[] b = new eqm[]{
      dac.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dac.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(dna.d $$0) {
      super($$0);
   }

   @Override
   protected cxa d() {
      return cqp.ue;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b[this.g($$0)];
   }
}
