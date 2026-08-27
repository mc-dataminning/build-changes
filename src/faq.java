import org.joml.Matrix4f;

public interface faq {
   static faq a(arc $$0) {
      return new fap($$0);
   }

   static faq a(cgd $$0) {
      if ($$0 instanceof cgc) {
         return new fao((cgc)$$0);
      } else {
         throw new IllegalArgumentException("Unknown TooltipComponent");
      }
   }

   int a();

   int a(ert var1);

   default void a(ert $$0, int $$1, int $$2, Matrix4f $$3, fnu.a $$4) {
   }

   default void a(ert $$0, int $$1, int $$2, erv $$3) {
   }
}
