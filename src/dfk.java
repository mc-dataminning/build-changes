import com.mojang.serialization.MapCodec;

public class dfk extends czo {
   public static final MapCodec<dfk> c = b(dfk::new);
   protected static final elu g = cvz.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dfk> a() {
      return c;
   }

   public dfk(dio.d $$0) {
      super($$0, ia.a, g, false, 0.1);
   }

   @Override
   protected int a(auf $$0) {
      return dbe.a($$0);
   }

   @Override
   protected cvz b() {
      return cwb.oA;
   }

   @Override
   protected boolean g(dip $$0) {
      return dbe.a($$0);
   }
}
