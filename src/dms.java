import com.mojang.serialization.MapCodec;

public class dms extends dfi {
   public static final MapCodec<dms> b = b(dms::new);
   public static final dtc c = dtb.z;

   @Override
   protected MapCodec<? extends dms> a() {
      return b;
   }

   protected dms(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return $$1 == jf.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dsl a(cxn $$0) {
      dsl $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dsl $$0) {
      return $$0.a(avw.bz);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c);
   }
}
