import com.mojang.serialization.MapCodec;

public class dsd extends dne {
   public static final MapCodec<dsd> a = b(dsd::new);
   private static final int b = 20;

   @Override
   public MapCodec<dsd> a() {
      return a;
   }

   public dsd(ebf.d $$0) {
      super($$0);
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, bwv $$3) {
      if (!$$3.cd() && $$3 instanceof bxw) {
         $$3.a($$0.al().f(), 1.0F);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      dnl.b($$1, $$2.d(), $$0);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.b && $$6.a(dng.J)) {
         $$2.a($$3, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, ebg $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }
}
