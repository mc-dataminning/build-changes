import java.util.function.Consumer;

public interface fuc extends fud {
   void b(Consumer<fud> var1);

   @Override
   default void a(Consumer<fql> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fuc $$1) {
            $$1.a();
         }
      });
   }
}
