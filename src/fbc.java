import java.util.function.Consumer;

public interface fbc extends fbd {
   void b(Consumer<fbd> var1);

   @Override
   default void a(Consumer<exp> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fbc $$1) {
            $$1.a();
         }
      });
   }
}
