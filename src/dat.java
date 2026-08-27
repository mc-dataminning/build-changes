import javax.annotation.Nullable;

public class dat extends cuq implements cxa {
   public static final dfy<dfw> b = cuq.a;
   protected static final float c = 6.0F;
   protected static final ehx d = csm.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public dat(dez.d $$0) {
      super($$0);
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return d;
   }

   @Override
   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.d($$1, $$2, ha.b) && !$$0.a(csn.kJ);
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(csn.bw);
   }

   @Nullable
   @Override
   public dfa a(clg $$0) {
      dfa $$1 = super.a($$0);
      if ($$1 != null) {
         ead $$2 = $$0.q().b_($$0.a().c());
         if ($$2.a(apq.a) && $$2.e() == 8) {
            return $$1;
         }
      }

      return null;
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      if ($$0.c(b) == dfw.a) {
         dfa $$3 = $$1.a_($$2.d());
         return $$3.a(this) && $$3.c(b) == dfw.b;
      } else {
         ead $$4 = $$1.b_($$2);
         return super.a($$0, $$1, $$2) && $$4.a(apq.a) && $$4.e() == 8;
      }
   }

   @Override
   public ead c_(dfa $$0) {
      return eae.c.a(false);
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
