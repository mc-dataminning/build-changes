import com.mojang.serialization.MapCodec;

public class der extends czo {
   public static final MapCodec<der> c = b(der::new);
   public static final elu g = cvz.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<der> a() {
      return c;
   }

   public der(dio.d $$0) {
      super($$0, ia.b, g, false, 0.1);
   }

   @Override
   protected int a(auf $$0) {
      return dbe.a($$0);
   }

   @Override
   protected cvz b() {
      return cwb.oC;
   }

   @Override
   protected boolean g(dip $$0) {
      return dbe.a($$0);
   }
}
