import com.mojang.serialization.MapCodec;

public class dqe extends dkx {
   public static final MapCodec<dqe> c = b(dqe::new);
   public static final ezm e = dhj.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqe> a() {
      return c;
   }

   public dqe(dun.d $$0) {
      super($$0, jj.b, e, false);
   }

   @Override
   protected dky c() {
      return (dky)dhl.oB;
   }
}
