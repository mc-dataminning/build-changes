import com.mojang.serialization.MapCodec;

public class dpq extends dkj {
   public static final MapCodec<dpq> c = b(dpq::new);
   public static final eyx e = dgv.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dpq> a() {
      return c;
   }

   public dpq(dtz.d $$0) {
      super($$0, jj.b, e, false);
   }

   @Override
   protected dkk c() {
      return (dkk)dgx.oB;
   }
}
