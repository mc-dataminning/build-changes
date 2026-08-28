import com.mojang.serialization.MapCodec;

public class doj extends dih {
   public static final MapCodec<doj> a = b(doj::new);
   protected static final float b = 6.0F;
   protected static final fab c = dhy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return c;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.aM) || $$0.a(dia.dX) || super.b($$0, $$1, $$2);
   }
}
