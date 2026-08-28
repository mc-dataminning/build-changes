import com.mojang.serialization.MapCodec;

public abstract class dne extends dno {
   private static final fgw a = dno.b(4.0, 0.0, 10.0);

   protected dne(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dne> a();

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return a;
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.a && !this.a($$0, $$1, $$3) ? dnq.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return a($$1, $$2.e(), jc.b);
   }
}
