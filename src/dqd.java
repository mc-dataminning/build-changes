import com.mojang.serialization.MapCodec;

public class dqd extends dky {
   public static final MapCodec<dqd> c = b(dqd::new);
   public static final ezm g = dhj.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dqd> a() {
      return c;
   }

   public dqd(dun.d $$0) {
      super($$0, jj.b, g, false, 0.1);
   }

   @Override
   protected int a(azl $$0) {
      return dmp.a($$0);
   }

   @Override
   protected dhj b() {
      return dhl.oC;
   }

   @Override
   protected boolean h(duo $$0) {
      return dmp.a($$0);
   }
}
