import com.mojang.serialization.MapCodec;

public class cvk extends cut {
   public static final MapCodec<cvk> a = b(cvk::new);
   protected static final ekb b = cut.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends cvk> a() {
      return a;
   }

   public cvk(dgv.d $$0) {
      super($$0);
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return b;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      return !$$0.a($$3, $$4) ? cuv.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      return !$$1.t($$2.d());
   }
}
