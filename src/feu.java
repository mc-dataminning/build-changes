import java.util.function.Consumer;

public interface feu extends fev {
   void b(Consumer<fev> var1);

   @Override
   default void a(Consumer<fbe> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof feu $$1) {
            $$1.a();
         }
      });
   }
}
