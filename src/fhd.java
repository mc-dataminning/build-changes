import java.util.function.Consumer;

public interface fhd extends fhe {
   void b(Consumer<fhe> var1);

   @Override
   default void a(Consumer<fdn> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fhd $$1) {
            $$1.a();
         }
      });
   }
}
