import com.mojang.serialization.MapCodec;

public class cyi extends cws {
   public static final MapCodec<cyi> a = b(cyi::new);
   protected static final float b = 6.0F;
   protected static final emf c = cwj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<cyi> a() {
      return a;
   }

   protected cyi(diz.d $$0) {
      super($$0);
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return c;
   }

   @Override
   protected boolean b(dja $$0, cso $$1, hx $$2) {
      return $$0.a(asb.cd);
   }
}
