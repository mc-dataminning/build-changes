import java.util.function.Consumer;

public interface fkt extends fku {
   void b(Consumer<fku> var1);

   @Override
   default void a(Consumer<fhd> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fkt $$1) {
            $$1.a();
         }
      });
   }
}
