import java.util.function.Consumer;

public interface fpt extends fpu {
   void b(Consumer<fpu> var1);

   @Override
   default void a(Consumer<fmb> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fpt $$1) {
            $$1.a();
         }
      });
   }
}
