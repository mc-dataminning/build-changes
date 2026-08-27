import java.util.function.Consumer;

public interface fdb extends fdc {
   void b(Consumer<fdc> var1);

   @Override
   default void a(Consumer<ezm> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fdb $$1) {
            $$1.a();
         }
      });
   }
}
