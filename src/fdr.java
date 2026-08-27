import org.joml.Matrix4f;

public interface fdr {
   static fdr a(atc $$0) {
      return new fdq($$0);
   }

   static fdr a(ciu $$0) {
      if ($$0 instanceof cit) {
         return new fdp((cit)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(eur var1);

   default void a(eur $$0, int $$1, int $$2, Matrix4f $$3, fqz.a $$4) {
   }

   default void a(eur $$0, int $$1, int $$2, eut $$3) {
   }
}
