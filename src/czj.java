import com.mojang.serialization.MapCodec;

public class czj extends czk {
   public static final MapCodec<czj> a = b(czj::new);
   protected static final float b = 6.0F;
   protected static final eqk c = daa.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<czj> a() {
      return a;
   }

   protected czj(dmy.d $$0) {
      super($$0);
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return c;
   }
}
