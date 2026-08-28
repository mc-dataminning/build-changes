import com.mojang.serialization.MapCodec;

public class dmj extends dez {
   public static final MapCodec<dmj> b = b(dmj::new);
   public static final dst c = dss.z;

   @Override
   protected MapCodec<? extends dmj> a() {
      return b;
   }

   protected dmj(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsc a(cya $$0) {
      dsc $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsc $$0) {
      return $$0.a(awp.bz);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(c);
   }
}
