import com.mojang.serialization.MapCodec;

public class dhl extends dac {
   public static final MapCodec<dhl> b = b(dhl::new);
   public static final dns c = dnr.z;

   @Override
   protected MapCodec<? extends dhl> a() {
      return b;
   }

   protected dhl(dna.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return $$1 == ih.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dnb a(csu $$0) {
      dnb $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dnb $$0) {
      return $$0.a(aun.bz);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(c);
   }
}
