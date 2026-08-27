import java.util.function.Consumer;

public interface fdx extends fdy {
   void b(Consumer<fdy> var1);

   @Override
   default void a(Consumer<fai> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fdx $$1) {
            $$1.a();
         }
      });
   }
}
