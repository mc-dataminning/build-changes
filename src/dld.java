import com.mojang.serialization.MapCodec;

public abstract class dld extends dgx {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewf h = deu.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewf i = deu.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewf j = deu.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dld(drw.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dld> a();

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
