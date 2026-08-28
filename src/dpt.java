import com.mojang.serialization.MapCodec;

public class dpt extends dij {
   public static final MapCodec<dpt> b = b(dpt::new);
   public static final dwf c = dwe.z;

   @Override
   protected MapCodec<? extends dpt> a() {
      return b;
   }

   protected dpt(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      return $$4 == jm.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dvo $$0) {
      return $$0.a(axd.bA);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(c);
   }
}
