import com.mojang.serialization.MapCodec;

public class dqz extends dkx {
   public static final MapCodec<dqz> c = b(dqz::new);
   public static final ezm e = dhj.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dqz> a() {
      return c;
   }

   public dqz(dun.d $$0) {
      super($$0, jj.a, e, false);
   }

   @Override
   protected dky c() {
      return (dky)dhl.oz;
   }
}
