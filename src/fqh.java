import org.joml.Matrix4f;

public interface fqh {
   static fqh a(axz $$0) {
      return new fqg($$0);
   }

   static fqh a(cry $$0) {
      if ($$0 instanceof crx $$1) {
         return new fqf($$1.a());
      } else if ($$0 instanceof fqe.a $$2) {
         return new fqe($$2);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(fhr var1);

   default void a(fhr $$0, int $$1, int $$2, Matrix4f $$3, get.a $$4) {
   }

   default void a(fhr $$0, int $$1, int $$2, fht $$3) {
   }
}
