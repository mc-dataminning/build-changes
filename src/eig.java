import it.unimi.dsi.fastutil.doubles.DoubleList;

public class eig extends eii {
   private final eii b;
   private final hc.a c;
   private static final DoubleList d = new ehv(1);

   public eig(eii $$0, hc.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static ehy a(ehy $$0, hc.a $$1, int $$2) {
      return new eih(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(hc.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
