import com.mojang.serialization.MapCodec;

public class dts extends dma {
   public static final MapCodec<dts> b = b(dts::new);
   public static final eaq c = eap.E;

   @Override
   protected MapCodec<? extends dts> a() {
      return b;
   }

   protected dts(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      return $$4 == ja.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(dzz $$0) {
      return $$0.a(axc.bB);
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(c);
   }
}
