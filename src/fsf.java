import java.util.function.Consumer;

public interface fsf extends fsg {
   void b(Consumer<fsg> var1);

   @Override
   default void a(Consumer<fon> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fsf $$1) {
            $$1.a();
         }
      });
   }
}
