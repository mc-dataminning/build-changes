import com.mojang.serialization.MapCodec;

public class dmt extends deu {
   public static final MapCodec<dmt> a = b(dmt::new);
   private static final double b = 5.0;
   private static final ewf c = deu.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dmt> a() {
      return a;
   }

   protected dmt(drw.d $$0) {
      super($$0);
   }

   @Override
   protected dla a_(drx $$0) {
      return dla.a;
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected float d(drx $$0, daz $$1, iz $$2) {
      return 1.0F;
   }
}
