import com.mojang.serialization.MapCodec;

public class dko extends dde {
   public static final MapCodec<dko> b = b(dko::new);
   public static final dqy c = dqx.z;

   @Override
   protected MapCodec<? extends dko> a() {
      return b;
   }

   protected dko(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return $$1 == is.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dqh $$0) {
      return $$0.a(avr.bz);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }
}
