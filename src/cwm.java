import javax.annotation.Nullable;

public class cwm extends cvy implements cwz {
   protected static final ehw f = csl.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double g = 0.14;

   protected cwm(dey.d $$0) {
      super($$0, ha.b, f, true, 0.14);
   }

   @Override
   protected boolean g(dez $$0) {
      return $$0.a(csm.G);
   }

   @Override
   protected csl a() {
      return csm.md;
   }

   @Override
   protected boolean h(dez $$0) {
      return !$$0.a(csm.kJ);
   }

   @Override
   public boolean a(@Nullable cbm $$0, cor $$1, gu $$2, dez $$3, eab $$4) {
      return false;
   }

   @Override
   public boolean a(cpm $$0, gu $$1, dez $$2, eac $$3) {
      return false;
   }

   @Override
   protected int a(aru $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      return $$1.a(apq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public eac c_(dez $$0) {
      return ead.c.a(false);
   }
}
