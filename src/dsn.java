import com.mojang.serialization.MapCodec;

public class dsn extends dno {
   public static final MapCodec<dsn> a = b(dsn::new);
   private static final int b = 20;

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(ebp.d $$0) {
      super($$0);
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      if (!$$3.cd() && $$3 instanceof byf) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      dnv.b($$1, $$2.d(), $$0);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$4 == jc.b && $$6.a(dnq.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
