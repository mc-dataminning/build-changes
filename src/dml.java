import com.mojang.serialization.MapCodec;

public class dml extends dfb {
   public static final MapCodec<dml> b = b(dml::new);
   public static final dsv c = dsu.z;

   @Override
   protected MapCodec<? extends dml> a() {
      return b;
   }

   protected dml(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dse a(cyc $$0) {
      dse $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dse $$0) {
      return $$0.a(awp.bz);
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c);
   }
}
