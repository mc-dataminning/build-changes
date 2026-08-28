import com.mojang.serialization.MapCodec;

public class dqh extends dla {
   public static final MapCodec<dqh> c = b(dqh::new);
   public static final ezq e = dhm.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqh> a() {
      return c;
   }

   public dqh(dur.d $$0) {
      super($$0, jk.b, e, false);
   }

   @Override
   protected dlb c() {
      return (dlb)dho.oB;
   }
}
