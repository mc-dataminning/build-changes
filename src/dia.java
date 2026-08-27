import com.mojang.serialization.MapCodec;

public class dia extends dcd {
   public static final MapCodec<dia> c = b(dia::new);
   protected static final eol g = cyo.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dia> a() {
      return c;
   }

   public dia(dle.d $$0) {
      super($$0, ie.a, g, false, 0.1);
   }

   @Override
   protected int a(awo $$0) {
      return ddt.a($$0);
   }

   @Override
   protected cyo b() {
      return cyq.oA;
   }

   @Override
   protected boolean g(dlf $$0) {
      return ddt.a($$0);
   }
}
