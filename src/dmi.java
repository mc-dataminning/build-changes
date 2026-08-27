import com.mojang.serialization.MapCodec;

public class dmi extends dmm {
   public static final MapCodec<dmi> a = b(dmi::new);

   @Override
   public MapCodec<dmi> a() {
      return a;
   }

   public dmi(drc.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(drd $$0, daf $$1, io $$2) {
      return false;
   }

   @Override
   protected int g(drd $$0, daf $$1, io $$2) {
      return $$1.P();
   }
}
