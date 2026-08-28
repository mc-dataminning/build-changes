import com.mojang.serialization.MapCodec;

public class dnc extends dih {
   public static final MapCodec<dnc> a = b(dnc::new);
   protected static final fab b = dhy.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dnc> a() {
      return a;
   }

   public dnc(dvc.d $$0) {
      super($$0);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return b;
   }

   @Override
   protected boolean b(dvd $$0, dea $$1, jg $$2) {
      return $$0.a(awz.aM) || $$0.a(dia.dX) || super.b($$0, $$1, $$2);
   }
}
