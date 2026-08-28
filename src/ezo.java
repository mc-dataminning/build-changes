import it.unimi.dsi.fastutil.doubles.DoubleList;

public class ezo extends ezq {
   private final ezq b;
   private final jk.a c;
   private static final DoubleList d = new ezc(1);

   public ezo(ezq $$0, jk.a $$1, int $$2) {
      super(a($$0.a, $$1, $$2));
      this.b = $$0;
      this.c = $$1;
   }

   private static ezf a(ezf $$0, jk.a $$1, int $$2) {
      return new ezp(
         $$0, $$1.a($$2, 0, 0), $$1.a(0, $$2, 0), $$1.a(0, 0, $$2), $$1.a($$2 + 1, $$0.a, $$0.a), $$1.a($$0.b, $$2 + 1, $$0.b), $$1.a($$0.c, $$0.c, $$2 + 1)
      );
   }

   @Override
   public DoubleList a(jk.a $$0) {
      return $$0 == this.c ? d : this.b.a($$0);
   }
}
