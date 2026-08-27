import com.mojang.serialization.MapCodec;

public class dbh extends dbi {
   public static final MapCodec<dbh> a = b(dbh::new);
   protected static final float b = 6.0F;
   protected static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dbh> a() {
      return a;
   }

   protected dbh(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }
}
