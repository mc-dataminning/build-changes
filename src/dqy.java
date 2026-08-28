import com.mojang.serialization.MapCodec;

public class dqy extends dky {
   public static final MapCodec<dqy> c = b(dqy::new);
   protected static final ezm g = dhj.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dqy> a() {
      return c;
   }

   public dqy(dun.d $$0) {
      super($$0, jj.a, g, false, 0.1);
   }

   @Override
   protected int a(azl $$0) {
      return dmp.a($$0);
   }

   @Override
   protected dhj b() {
      return dhl.oA;
   }

   @Override
   protected boolean h(duo $$0) {
      return dmp.a($$0);
   }
}
