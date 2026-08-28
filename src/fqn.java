import org.joml.Matrix4f;

public interface fqn {
   static fqn a(aya $$0) {
      return new fqm($$0);
   }

   static fqn a(csa $$0) {
      if ($$0 instanceof crz $$1) {
         return new fql($$1.a());
      } else if ($$0 instanceof fqk.a $$2) {
         return new fqk($$2);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fhx var1);

   default void a(fhx $$0, int $$1, int $$2, Matrix4f $$3, gez.a $$4) {
   }

   default void a(fhx $$0, int $$1, int $$2, fhz $$3) {
   }
}
