import com.mojang.serialization.MapCodec;

public class czr extends cut {
   public static final MapCodec<czr> a = b(czr::new);
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   @Override
   public MapCodec<czr> a() {
      return a;
   }

   public czr(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public ekb b_(dgw $$0, cqy $$1, ht $$2) {
      return ejy.b();
   }

   @Override
   public ekb b(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return ejy.b();
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }

   @Override
   public float b(dgw $$0, cqy $$1, ht $$2) {
      return 0.2F;
   }
}
