import com.mojang.serialization.MapCodec;

public class dmj extends del {
   public static final MapCodec<dmj> c = b(dmj::new);

   @Override
   public MapCodec<dmj> a() {
      return c;
   }

   public dmj(dsa.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfa.a.o();
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsb $$0) {
      return $$0.a(awo.aT);
   }

   @Override
   protected boolean f(dsb $$0) {
      return true;
   }
}
