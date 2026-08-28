import com.mojang.serialization.MapCodec;

public class doh extends dno {
   public static final MapCodec<doh> a = b(doh::new);
   private static final fgw b = dno.b(16.0, 0.0, 1.0);

   @Override
   public MapCodec<? extends doh> a() {
      return a;
   }

   public doh(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return !$$0.a($$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return !$$1.v($$2.e());
   }
}
