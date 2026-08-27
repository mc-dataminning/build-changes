import com.mojang.serialization.MapCodec;

public class dgq extends dby {
   public static final MapCodec<dgq> a = b(dgq::new);
   private static final int b = 20;

   @Override
   public MapCodec<dgq> a() {
      return a;
   }

   public dgq(doy.d $$0) {
      super($$0);
   }

   @Override
   public void a(cyx $$0, ib $$1, doz $$2, bpv $$3) {
      if (!$$3.bT() && $$3 instanceof bqo && !cwr.j((bqo)$$3)) {
         $$3.a($$0.ai().e(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      dce.b($$1, $$2.c(), $$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$1 == ih.b && $$2.a(dca.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
