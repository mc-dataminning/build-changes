import com.mojang.serialization.MapCodec;

public class ded extends dee {
   public static final MapCodec<ded> a = b(ded::new);
   protected static final float b = 6.0F;
   protected static final ewf c = deu.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<ded> a() {
      return a;
   }

   protected ded(drw.d $$0) {
      super($$0);
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return c;
   }
}
