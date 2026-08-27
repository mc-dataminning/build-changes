import com.mojang.serialization.MapCodec;

public class dan extends cyx {
   public static final MapCodec<dan> a = b(dan::new);
   protected static final float b = 6.0F;
   protected static final eol c = cyo.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dan> a() {
      return a;
   }

   protected dan(dle.d $$0) {
      super($$0);
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return c;
   }

   @Override
   protected boolean b(dlf $$0, cut $$1, hz $$2) {
      return $$0.a(atz.ce);
   }
}
