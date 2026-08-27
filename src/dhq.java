import com.mojang.serialization.MapCodec;

public class dhq extends ddt {
   public static final MapCodec<dhq> a = b(dhq::new);
   private static final est[] b = new est[]{
      dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 3.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 7.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0)
   };

   @Override
   public MapCodec<dhq> a() {
      return a;
   }

   public dhq(doy.d $$0) {
      super($$0);
   }

   @Override
   protected cyw d() {
      return crm.ue;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b[this.g($$0)];
   }
}
