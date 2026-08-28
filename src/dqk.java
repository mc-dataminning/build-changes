import com.mojang.serialization.MapCodec;

public class dqk extends dkk {
   public static final MapCodec<dqk> c = b(dqk::new);
   protected static final eyx g = dgv.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqk> a() {
      return c;
   }

   public dqk(dtz.d $$0) {
      super($$0, jj.a, g, false, 0.1);
   }

   @Override
   protected int a(azk $$0) {
      return dmb.a($$0);
   }

   @Override
   protected dgv b() {
      return dgx.oA;
   }

   @Override
   protected boolean h(dua $$0) {
      return dmb.a($$0);
   }
}
