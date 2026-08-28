import com.mojang.serialization.MapCodec;

public class dmf extends dhm {
   public static final MapCodec<dmf> a = b(dmf::new);
   private static final int b = 20;

   @Override
   public MapCodec<dmf> a() {
      return a;
   }

   public dmf(dur.d $$0) {
      super($$0);
   }

   @Override
   public void a(dej $$0, jf $$1, dus $$2, btr $$3) {
      if (!$$3.cb() && $$3 instanceof bun) {
         $$3.a($$0.ak().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
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
}
