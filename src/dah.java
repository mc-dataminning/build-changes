import com.mojang.serialization.MapCodec;

public abstract class dah extends cwb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final eiy h = cua.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final eiy i = cua.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final eiy j = cua.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dah(dga.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dah> a();

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
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
   public dgb a(dgb $$0, dal $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dgb a(dgb $$0, cyv $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
