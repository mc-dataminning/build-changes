import com.mojang.serialization.MapCodec;

public class dnr extends din {
   public static final MapCodec<dnr> c = b(dnr::new);
   public static final ewj g = dey.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dnr> a() {
      return c;
   }

   public dnr(dsa.d $$0) {
      super($$0, je.b, g, false, 0.1);
   }

   @Override
   protected int a(azg $$0) {
      return dke.a($$0);
   }

   @Override
   protected dey b() {
      return dfa.oC;
   }

   @Override
   protected boolean g(dsb $$0) {
      return dke.a($$0);
   }
}
