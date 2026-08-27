import it.unimi.dsi.fastutil.doubles.DoubleList;

public class emt extends emv {
   private final emv b;
   private final ic.a c;
   private static final DoubleList d = new emi(1);

   public emt(emv $$0, ic.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static eml a(eml $$0, ic.a $$1, int $$2) {
      return new emu(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(ic.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
