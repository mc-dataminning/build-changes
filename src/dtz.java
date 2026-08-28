import com.mojang.serialization.MapCodec;

public class dtz extends dmf {
   public static final MapCodec<dtz> b = b(dtz::new);
   public static final eay c = eax.E;

   @Override
   protected MapCodec<? extends dtz> a() {
      return b;
   }

   protected dtz(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      return $$4 == ja.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(eah $$0) {
      return $$0.a(axc.bC);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(c);
   }
}
