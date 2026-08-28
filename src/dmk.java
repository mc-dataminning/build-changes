import com.mojang.serialization.MapCodec;

public class dmk extends dfa {
   public static final MapCodec<dmk> b = b(dmk::new);
   public static final dsu c = dst.z;

   @Override
   protected MapCodec<? extends dmk> a() {
      return b;
   }

   protected dmk(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return $$1 == je.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsd $$0) {
      return $$0.a(awp.bz);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(c);
   }
}
