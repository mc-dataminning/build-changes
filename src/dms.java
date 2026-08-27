import com.mojang.serialization.MapCodec;

public class dms extends dgt {
   public static final MapCodec<dms> c = b(dms::new);
   protected static final eui g = dde.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dms> a() {
      return c;
   }

   public dms(dqg.d $$0) {
      super($$0, is.a, g, false, 0.1);
   }

   @Override
   protected int a(ayg $$0) {
      return dik.a($$0);
   }

   @Override
   protected dde b() {
      return ddg.oA;
   }

   @Override
   protected boolean g(dqh $$0) {
      return dik.a($$0);
   }
}
