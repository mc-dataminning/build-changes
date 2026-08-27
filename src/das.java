import com.mojang.serialization.MapCodec;

public class das extends dbv {
   public static final MapCodec<das> a = b(das::new);
   private static final eqk[] b = new eqk[]{
      daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<das> a() {
      return a;
   }

   public das(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected cwy d() {
      return cqn.uc;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return b[this.g($$0)];
   }
}
