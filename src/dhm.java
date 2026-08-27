import com.mojang.serialization.MapCodec;

public class dhm extends czp {
   public static final MapCodec<dhm> c = b(dhm::new);

   @Override
   public MapCodec<dhm> a() {
      return c;
   }

   public dhm(dna.d $$0) {
      super($$0, 2.0F);
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      return this.a($$0, $$3, $$4) ? this.o() : dae.a.o();
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      return m($$1.a_($$2.d()));
   }

   public static boolean m(dnb $$0) {
      return $$0.a(aun.aT);
   }

   @Override
   protected boolean f(dnb $$0) {
      return true;
   }
}
