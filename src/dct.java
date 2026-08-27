import com.mojang.serialization.MapCodec;

public class dct extends cws {
   public static final MapCodec<dct> a = b(dct::new);
   protected static final float b = 6.0F;
   protected static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dct> a() {
      return a;
   }

   protected dct(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.aK) || $$0.a(cwl.dX) || super.b($$0, $$1, $$2);
   }
}
