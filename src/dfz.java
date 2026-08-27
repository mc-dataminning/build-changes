import com.mojang.serialization.MapCodec;

public class dfz extends dej {
   public static final MapCodec<dfz> a = b(dfz::new);
   protected static final float b = 6.0F;
   protected static final evf c = dea.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfz> a() {
      return a;
   }

   protected dfz(drc.d $$0) {
      super($$0);
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return c;
   }

   @Override
   protected boolean b(drd $$0, daf $$1, io $$2) {
      return $$0.a(avx.cl);
   }
}
