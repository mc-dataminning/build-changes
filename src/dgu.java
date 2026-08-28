import com.mojang.serialization.MapCodec;

public class dgu extends dgw {
   public static final MapCodec<dgu> a = b(dgu::new);
   private static final ezq b = dhm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dgu> a() {
      return a;
   }

   protected dgu(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }
}
