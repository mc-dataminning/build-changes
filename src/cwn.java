import javax.annotation.Nullable;

public class cwn extends cvz implements cxa {
   protected static final ehx f = csm.a(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);
   private static final double g = 0.14;

   protected cwn(dez.d $$0) {
      super($$0, ha.b, f, true, 0.14);
   }

   @Override
   protected boolean g(dfa $$0) {
      return $$0.a(csn.G);
   }

   @Override
   protected csm a() {
      return csn.md;
   }

   @Override
   protected boolean h(dfa $$0) {
      return !$$0.a(csn.kJ);
   }

   @Override
   public boolean a(@Nullable cbn $$0, cos $$1, gu $$2, dfa $$3, eac $$4) {
      return false;
   }

   @Override
   public boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      return false;
   }

   @Override
   protected int a(aru $$0) {
      return 1;
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      return $$1.a(apq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public ead c_(dfa $$0) {
      return eae.c.a(false);
   }
}
