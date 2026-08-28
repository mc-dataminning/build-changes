import com.mojang.serialization.MapCodec;

public class dol extends djk {
   public static final MapCodec<dol> a = b(dol::new);
   protected static final fbs b = djk.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   public dol(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return b;
   }

   @Override
   protected fbs b_(dwv $$0, dfl $$1, ji $$2) {
      return fbp.b();
   }

   @Override
   protected fbs c(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return fbp.b();
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }

   @Override
   protected float c(dwv $$0, dfl $$1, ji $$2) {
      return 0.2F;
   }
}
