import com.mojang.serialization.MapCodec;

public class dlf extends dfd {
   public static final MapCodec<dlf> a = b(dlf::new);
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   protected dlf(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.aL) || $$0.a(dew.dX) || super.b($$0, $$1, $$2);
   }
}
