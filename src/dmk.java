import com.mojang.serialization.MapCodec;

public class dmk extends dem {
   public static final MapCodec<dmk> c = b(dmk::new);

   @Override
   public MapCodec<dmk> a() {
      return c;
   }

   public dmk(dsb.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dfb.a.o();
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dsc $$0) {
      return $$0.a(awp.aT);
   }

   @Override
   protected boolean f(dsc $$0) {
      return true;
   }
}
