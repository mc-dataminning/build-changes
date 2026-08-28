import com.mojang.serialization.MapCodec;

public class djz extends dfd {
   public static final MapCodec<djz> a = b(djz::new);
   protected static final ewf b = deu.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<djz> a() {
      return a;
   }

   public djz(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return b;
   }

   @Override
   protected boolean b(drx $$0, daz $$1, iz $$2) {
      return $$0.a(awl.aL) || $$0.a(dew.dX) || super.b($$0, $$1, $$2);
   }
}
