import com.mojang.serialization.MapCodec;

public class dvp extends dnq {
   public static final MapCodec<dvp> g = b(dvp::new);

   @Override
   public MapCodec<dvp> a() {
      return g;
   }

   public dvp(ean.d $$0) {
      super(() -> dxo.c, $$0);
   }

   @Override
   public dxm a(iv $$0, eao $$1) {
      return new dzl($$0, $$1);
   }

   @Override
   protected awu<alg> c() {
      return awx.i.b(awx.ai);
   }

   @Override
   protected boolean f_(eao $$0) {
      return true;
   }

   @Override
   protected int a(eao $$0, din $$1, iv $$2, jb $$3) {
      return azm.a(dxu.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(eao $$0, din $$1, iv $$2, jb $$3) {
      return $$3 == jb.b ? $$0.a($$1, $$2, $$3) : 0;
   }
}
