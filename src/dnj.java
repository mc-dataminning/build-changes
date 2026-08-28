import com.mojang.serialization.MapCodec;

public class dnj extends dfy {
   public static final MapCodec<dnj> b = b(dnj::new);
   public static final dtt c = dts.z;

   @Override
   protected MapCodec<? extends dnj> a() {
      return b;
   }

   protected dnj(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      return $$1 == ji.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = $$0.q().a_($$0.a().d());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dtc $$0) {
      return $$0.a(awe.bA);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c);
   }
}
