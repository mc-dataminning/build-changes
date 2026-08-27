import com.mojang.serialization.MapCodec;

public class dlk extends dea {
   public static final MapCodec<dlk> b = b(dlk::new);
   public static final dru c = drt.z;

   @Override
   protected MapCodec<? extends dlk> a() {
      return b;
   }

   protected dlk(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      return $$1 == it.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(drd $$0) {
      return $$0.a(avx.bz);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(c);
   }
}
