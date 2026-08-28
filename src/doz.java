import com.mojang.serialization.MapCodec;

public class doz extends dhm {
   public static final MapCodec<doz> a = b(doz::new);
   protected static final ezq b = dhm.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<doz> a() {
      return a;
   }

   public doz(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return b;
   }

   @Override
   protected ezq b_(dus $$0, ddo $$1, jf $$2) {
      return ezn.b();
   }

   @Override
   protected ezq c(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return ezn.b();
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      dhs.b($$1, $$2.d(), $$0);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.b && $$2.a(dho.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dus $$0, dej $$1, jf $$2, dus $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return 0.2F;
   }
}
