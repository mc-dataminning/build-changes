import com.mojang.serialization.MapCodec;

public class dmf extends deh {
   public static final MapCodec<dmf> c = b(dmf::new);

   @Override
   public MapCodec<dmf> a() {
      return c;
   }

   public dmf(drw.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return this.a($$0, $$3, $$4) ? this.n() : dew.a.n();
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(drx $$0) {
      return $$0.a(awl.aT);
   }

   @Override
   protected boolean f(drx $$0) {
      return true;
   }
}
