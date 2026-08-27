import java.util.function.Consumer;

public interface fcu extends fcv {
   void b(Consumer<fcv> var1);

   @Override
   default void a(Consumer<ezf> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fcu $$1) {
            $$1.a();
         }
      });
   }
}
