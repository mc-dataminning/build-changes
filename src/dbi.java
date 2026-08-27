import com.mojang.serialization.MapCodec;

public abstract class dbi extends cxd {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ekn h = cva.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ekn i = cva.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ekn j = cva.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dbi(dhh.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dbi> a();

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
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
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
