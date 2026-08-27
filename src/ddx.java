import com.mojang.serialization.MapCodec;

public class ddx extends cyt {
   public static final MapCodec<ddx> c = b(ddx::new);
   public static final eks e = cvf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<ddx> a() {
      return c;
   }

   public ddx(dhm.d $$0) {
      super($$0, ib.b, e, false);
   }

   @Override
   protected cyu c() {
      return (cyu)cvh.oB;
   }
}
