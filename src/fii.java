import java.util.function.Consumer;

public interface fii extends fij {
   void b(Consumer<fij> var1);

   @Override
   default void a(Consumer<fes> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fii $$1) {
            $$1.a();
         }
      });
   }
}
