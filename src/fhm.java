import java.util.function.Consumer;

public interface fhm extends fhn {
   void b(Consumer<fhn> var1);

   @Override
   default void a(Consumer<fdw> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fhm $$1) {
            $$1.a();
         }
      });
   }
}
