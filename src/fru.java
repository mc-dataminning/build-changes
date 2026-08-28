import java.util.function.Consumer;

public interface fru extends frv {
   void b(Consumer<frv> var1);

   @Override
   default void a(Consumer<foc> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fru $$1) {
            $$1.a();
         }
      });
   }
}
