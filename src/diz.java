import com.mojang.serialization.MapCodec;

public class diz extends dea {
   public static final MapCodec<diz> a = b(diz::new);
   protected static final evf b = dea.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<diz> a() {
      return a;
   }

   public diz(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return b;
   }

   @Override
   protected evf b_(drd $$0, daf $$1, io $$2) {
      return evc.b();
   }

   @Override
   protected evf c(drd $$0, daf $$1, io $$2, eur $$3) {
      return evc.b();
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }

   @Override
   protected float d(drd $$0, daf $$1, io $$2) {
      return 0.2F;
   }
}
