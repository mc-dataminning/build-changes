import com.mojang.serialization.MapCodec;

public class djx extends dih {
   public static final MapCodec<djx> a = b(djx::new);
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<djx> a() {
      return a;
   }

   protected djx(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.cn);
   }
}
