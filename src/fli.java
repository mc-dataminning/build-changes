import java.util.function.Consumer;

public interface fli extends flj {
   void b(Consumer<flj> var1);

   @Override
   default void a(Consumer<fhs> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fli $$1) {
            $$1.a();
         }
      });
   }
}
