import com.mojang.serialization.MapCodec;

public class doi extends djn {
   public static final MapCodec<doi> a = b(doi::new);
   private static final int b = 20;

   @Override
   public MapCodec<doi> a() {
      return a;
   }

   public doi(dwx.d $$0) {
      super($$0);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, bum $$3) {
      if (!$$3.ce() && $$3 instanceof bvi) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dwy $$0, ard $$1, ji $$2, azh $$3) {
      dju.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$4 == jn.b && $$6.a(djp.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
