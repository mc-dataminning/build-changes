import com.mojang.serialization.MapCodec;

public class dqg extends dlb {
   public static final MapCodec<dqg> c = b(dqg::new);
   public static final ezq g = dhm.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dqg> a() {
      return c;
   }

   public dqg(dur.d $$0) {
      super($$0, jk.b, g, false, 0.1);
   }

   @Override
   protected int a(azn $$0) {
      return dms.a($$0);
   }

   @Override
   protected dhm b() {
      return dho.oC;
   }

   @Override
   protected boolean h(dus $$0) {
      return dms.a($$0);
   }
}
