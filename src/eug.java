import it.unimi.dsi.fastutil.doubles.DoubleList;

public class eug extends eui {
   private final eui b;
   private final is.a c;
   private static final DoubleList d = new etv(1);

   public eug(eui $$0, is.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static ety a(ety $$0, is.a $$1, int $$2) {
      return new euh(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   protected DoubleList a(is.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
