import com.mojang.serialization.MapCodec;

public class dhg extends dhi {
   public static final MapCodec<dhg> a = b(dhg::new);
   private static final fab b = dhy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends dhg> a() {
      return a;
   }

   protected dhg(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }
}
