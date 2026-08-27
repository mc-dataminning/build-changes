import com.mojang.serialization.MapCodec;

public class dkl extends ddb {
   public static final MapCodec<dkl> n = b(dkl::new);

   @Override
   public MapCodec<dkl> a() {
      return n;
   }

   public dkl(doy.d $$0) {
      super($$0, () -> dmh.c);
   }

   @Override
   public dmf a(ib $$0, doz $$1) {
      return new dny($$0, $$1);
   }

   @Override
   protected aut<ajt> c() {
      return auw.i.b(auw.ai);
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return axk.a(dmm.a($$1, $$2), 0, 15);
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$3 == ih.b ? $$0.b($$1, $$2, $$3) : 0;
   }
}
