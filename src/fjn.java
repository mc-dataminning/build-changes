import java.util.function.Consumer;

public interface fjn extends fjo {
   void b(Consumer<fjo> var1);

   @Override
   default void a(Consumer<ffx> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fjn $$1) {
            $$1.a();
         }
      });
   }
}
