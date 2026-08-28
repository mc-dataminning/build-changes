import java.util.function.Consumer;

public interface fsh extends fsi {
   void b(Consumer<fsi> var1);

   @Override
   default void a(Consumer<fop> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fsh $$1) {
            $$1.a();
         }
      });
   }
}
