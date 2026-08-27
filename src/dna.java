import com.mojang.serialization.MapCodec;

public class dna extends dfc {
   public static final MapCodec<dna> b = b(dna::new);
   public static final dtt c = dts.z;

   @Override
   protected MapCodec<? extends dna> a() {
      return b;
   }

   protected dna(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      return $$1 == iw.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a().c());
      return this.n().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dtc $$0) {
      return $$0.a(awe.bB);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(c);
   }
}
