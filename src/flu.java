import java.util.function.Consumer;

public interface flu extends flv {
   void b(Consumer<flv> var1);

   @Override
   default void a(Consumer<fie> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof flu $$1) {
            $$1.a();
         }
      });
   }
}
