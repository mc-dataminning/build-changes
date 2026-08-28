import com.mojang.serialization.MapCodec;

public class dog extends djl {
   public static final MapCodec<dog> a = b(dog::new);
   private static final int b = 20;

   @Override
   public MapCodec<dog> a() {
      return a;
   }

   public dog(dwv.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, buk $$3) {
      if (!$$3.ce() && $$3 instanceof bvg) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      djs.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djn.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dww $$0, dgh $$1, ji $$2, dww $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
