import com.mojang.serialization.MapCodec;

public class dgt extends dfd {
   public static final MapCodec<dgt> a = b(dgt::new);
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgt> a() {
      return a;
   }

   protected dgt(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.cl);
   }
}
