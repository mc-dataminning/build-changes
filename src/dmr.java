import com.mojang.serialization.MapCodec;

public class dmr extends dfh {
   public static final MapCodec<dmr> b = b(dmr::new);
   public static final dtb c = dta.z;

   @Override
   protected MapCodec<? extends dmr> a() {
      return b;
   }

   protected dmr(dsj.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsk a(cxm $$0) {
      dsk $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsk $$0) {
      return $$0.a(avw.bz);
   }

   @Override
   protected void a(dsl.a<dfh, dsk> $$0) {
      $$0.a(c);
   }
}
