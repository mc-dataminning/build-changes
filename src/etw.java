import it.unimi.dsi.fastutil.doubles.DoubleList;

public class etw extends ety {
   private final ety b;
   private final ir.a c;
   private static final DoubleList d = new etl(1);

   public etw(ety $$0, ir.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static eto a(eto $$0, ir.a $$1, int $$2) {
      return new etx(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(ir.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
