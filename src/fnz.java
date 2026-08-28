import java.util.function.Consumer;

public interface fnz extends foa {
   void b(Consumer<foa> var1);

   @Override
   default void a(Consumer<fki> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fnz $$1) {
            $$1.a();
         }
      });
   }
}
