import org.joml.Matrix4f;

public interface fql {
   static fql a(aya $$0) {
      return new fqk($$0);
   }

   static fql a(csa $$0) {
      if ($$0 instanceof crz $$1) {
         return new fqj($$1.a());
      } else if ($$0 instanceof fqi.a $$2) {
         return new fqi($$2);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fhv var1);

   default void a(fhv $$0, int $$1, int $$2, Matrix4f $$3, gex.a $$4) {
   }

   default void a(fhv $$0, int $$1, int $$2, fhx $$3) {
   }
}
