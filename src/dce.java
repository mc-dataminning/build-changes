import com.mojang.serialization.MapCodec;

public class dce extends cut {
   public static final MapCodec<dce> a = b(dce::new);
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dce> a() {
      return a;
   }

   public dce(dgv.d $$0) {
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
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      cuz.b($$1, $$2.c(), $$0);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.b && $$2.a(cuv.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void b(dgw $$0, crs $$1, ht $$2, dgw $$3, boolean $$4) {
      $$1.a($$2, this, 20);
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
