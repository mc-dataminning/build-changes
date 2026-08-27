import com.mojang.serialization.MapCodec;

public abstract class dbb extends cwv {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ekb h = cut.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ekb i = cut.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ekb j = cut.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dbb(dgv.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbb> a();

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
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
   public dgw a(dgw $$0, dbf $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgw a(dgw $$0, czp $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
