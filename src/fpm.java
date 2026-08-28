import java.util.function.Consumer;

public interface fpm extends fpn {
   void b(Consumer<fpn> var1);

   @Override
   default void a(Consumer<flu> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fpm $$1) {
            $$1.a();
         }
      });
   }
}
