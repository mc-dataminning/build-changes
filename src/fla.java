import java.util.function.Consumer;

public interface fla extends flb {
   void b(Consumer<flb> var1);

   @Override
   default void a(Consumer<fhk> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fla $$1) {
            $$1.a();
         }
      });
   }
}
