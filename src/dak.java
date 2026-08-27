import com.mojang.serialization.MapCodec;

public class dak extends ctc {
   public static final MapCodec<dak> b = b(dak::new);
   public static final dfu c = dft.z;

   @Override
   protected MapCodec<? extends dak> a() {
      return b;
   }

   protected dak(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      return $$1 == ha.b ? $$0.a(c, Boolean.valueOf(h($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(h($$1)));
   }

   private static boolean h(dfd $$0) {
      return $$0.a(apv.by);
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(c);
   }
}
