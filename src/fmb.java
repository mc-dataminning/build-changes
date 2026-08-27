import java.util.function.Consumer;

public interface fmb extends fmc {
   void b(Consumer<fmc> var1);

   @Override
   default void a(Consumer<fil> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fmb $$1) {
            $$1.a();
         }
      });
   }
}
