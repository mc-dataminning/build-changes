import com.mojang.serialization.MapCodec;

public class dvk extends dno {
   public static final MapCodec<dvk> a = b(dvk::new);
   private static final fgw b = dno.b(16.0, 0.0, 14.0);
   private static final int c = 20;

   @Override
   public MapCodec<dvk> a() {
      return a;
   }

   public dvk(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected fgw b_(ebq $$0, djn $$1, iw $$2) {
      return fgt.b();
   }

   @Override
   protected fgw c(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return fgt.b();
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

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }

   @Override
   protected float c(ebq $$0, djn $$1, iw $$2) {
      return 0.2F;
   }
}
