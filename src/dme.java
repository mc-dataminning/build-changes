import com.mojang.serialization.MapCodec;

public class dme extends deu {
   public static final MapCodec<dme> b = b(dme::new);
   public static final dso c = dsn.z;

   @Override
   protected MapCodec<? extends dme> a() {
      return b;
   }

   protected dme(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(drx $$0) {
      return $$0.a(awl.bz);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(c);
   }
}
