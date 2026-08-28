import it.unimi.dsi.fastutil.doubles.DoubleList;

public class fcj extends fcl {
   private final fcl b;
   private final jm.a c;
   private static final DoubleList d = new fbx(1);

   public fcj(fcl $$0, jm.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static fca a(fca $$0, jm.a $$1, int $$2) {
      return new fck(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   public DoubleList a(jm.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
