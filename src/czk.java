import javax.annotation.Nullable;

public class czk extends csu implements cso, cxa {
   protected static final float a = 6.0F;
   protected static final ehx b = csm.a(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);

   protected czk(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return b;
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(csn.kJ);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      return $$1.a(apq.a) && $$1.e() == 8 ? super.a($$0) : null;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      dfa $$6 = super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!$$6.i()) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return $$6;
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return true;
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public ead c_(dfa $$0) {
      return eae.c.a(false);
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      dfa $$4 = csn.bx.n();
      dfa $$5 = $$4.a(dat.b, dfw.a);
      gu $$6 = $$2.c();
      if ($$0.a_($$6).a(csn.G)) {
         $$0.a($$2, $$4, 2);
         $$0.a($$6, $$5, 2);
      }
   }

   @Override
   public boolean a(@Nullable cbn $$0, cos $$1, gu $$2, dfa $$3, eac $$4) {
      return false;
   }

   @Override
   public boolean a(cpn $$0, gu $$1, dfa $$2, ead $$3) {
      return false;
   }
}
