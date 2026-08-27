import com.mojang.serialization.MapCodec;

public class deq extends cyt {
   public static final MapCodec<deq> c = b(deq::new);
   public static final eks e = cvf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<deq> a() {
      return c;
   }

   public deq(dhm.d $$0) {
      super($$0, ib.a, e, false);
   }

   @Override
   protected cyu c() {
      return (cyu)cvh.oz;
   }
}
