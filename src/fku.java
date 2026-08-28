import java.util.function.Consumer;

public interface fku extends fkv {
   void b(Consumer<fkv> var1);

   @Override
   default void a(Consumer<fhe> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fku $$1) {
            $$1.a();
         }
      });
   }
}
