import com.mojang.serialization.MapCodec;

public class dco extends cvf {
   public static final MapCodec<dco> b = b(dco::new);
   public static final die c = did.z;

   @Override
   protected MapCodec<? extends dco> a() {
      return b;
   }

   protected dco(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      return $$1 == ib.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dhn a(cnw $$0) {
      dhn $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dhn $$0) {
      return $$0.a(ark.by);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(c);
   }
}
