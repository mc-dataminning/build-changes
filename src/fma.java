import java.util.function.Consumer;

public interface fma extends fmb {
   void b(Consumer<fmb> var1);

   @Override
   default void a(Consumer<fik> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fma $$1) {
            $$1.a();
         }
      });
   }
}
