import it.unimi.dsi.fastutil.doubles.DoubleList;

public class evb extends evd {
   private final evd b;
   private final it.a c;
   private static final DoubleList d = new euq(1);

   public evb(evd $$0, it.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static eut a(eut $$0, it.a $$1, int $$2) {
      return new evc(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(it.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
