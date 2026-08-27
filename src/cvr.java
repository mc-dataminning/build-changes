import com.mojang.serialization.MapCodec;

public class cvr extends cva {
   public static final MapCodec<cvr> a = b(cvr::new);
   protected static final ekn b = cva.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends cvr> a() {
      return a;
   }

   public cvr(dhh.d $$0) {
      super($$0);
   }

   @Override
   public ekn a(dhi $$0, crg $$1, ht $$2, ejz $$3) {
      return b;
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cvc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      return !$$1.t($$2.d());
   }
}
