import com.mojang.serialization.MapCodec;

public class dqd extends drq {
   public static final MapCodec<dqd> b = b(dqd::new);

   @Override
   public MapCodec<dqd> a() {
      return b;
   }

   protected dqd(dxt.d $$0) {
      super(drq.b.e, $$0);
   }
}
