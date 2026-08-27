import com.mojang.serialization.MapCodec;

public class djh extends dby {
   public static final MapCodec<djh> b = b(djh::new);
   public static final dpq c = dpp.z;

   @Override
   protected MapCodec<? extends djh> a() {
      return b;
   }

   protected djh(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return $$1 == ih.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(doz $$0) {
      return $$0.a(avc.bz);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }
}
