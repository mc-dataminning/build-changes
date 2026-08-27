import com.mojang.serialization.MapCodec;

public class dhg extends dcd {
   public static final MapCodec<dhg> c = b(dhg::new);
   public static final eol g = cyo.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dhg> a() {
      return c;
   }

   public dhg(dle.d $$0) {
      super($$0, ie.b, g, false, 0.1);
   }

   @Override
   protected int a(awo $$0) {
      return ddt.a($$0);
   }

   @Override
   protected cyo b() {
      return cyq.oC;
   }

   @Override
   protected boolean g(dlf $$0) {
      return ddt.a($$0);
   }
}
