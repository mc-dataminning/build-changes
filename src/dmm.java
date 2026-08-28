import com.mojang.serialization.MapCodec;

public class dmm extends deo {
   public static final MapCodec<dmm> c = b(dmm::new);

   @Override
   public MapCodec<dmm> a() {
      return c;
   }

   public dmm(dsd.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfd.a.o();
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dse $$0) {
      return $$0.a(awp.aT);
   }

   @Override
   protected boolean f(dse $$0) {
      return true;
   }
}
