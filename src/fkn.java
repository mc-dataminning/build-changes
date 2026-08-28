import java.util.function.Consumer;

public interface fkn extends fko {
   void b(Consumer<fko> var1);

   @Override
   default void a(Consumer<fgx> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fkn $$1) {
            $$1.a();
         }
      });
   }
}
