import it.unimi.dsi.fastutil.doubles.DoubleList;

public class eqk extends eqm {
   private final eqm b;
   private final ih.a c;
   private static final DoubleList d = new epz(1);

   public eqk(eqm $$0, ih.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static eqc a(eqc $$0, ih.a $$1, int $$2) {
      return new eql(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(ih.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
