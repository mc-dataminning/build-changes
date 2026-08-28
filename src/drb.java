import com.mojang.serialization.MapCodec;

public class drb extends dlb {
   public static final MapCodec<drb> c = b(drb::new);
   protected static final ezq g = dhm.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<drb> a() {
      return c;
   }

   public drb(dur.d $$0) {
      super($$0, jk.a, g, false, 0.1);
   }

   @Override
   protected int a(azn $$0) {
      return dms.a($$0);
   }

   @Override
   protected dhm b() {
      return dho.oA;
   }

   @Override
   protected boolean h(dus $$0) {
      return dms.a($$0);
   }
}
