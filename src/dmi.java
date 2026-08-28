import com.mojang.serialization.MapCodec;

public class dmi extends dey {
   public static final MapCodec<dmi> b = b(dmi::new);
   public static final dss c = dsr.z;

   @Override
   protected MapCodec<? extends dmi> a() {
      return b;
   }

   protected dmi(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsb $$0) {
      return $$0.a(awo.bz);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c);
   }
}
