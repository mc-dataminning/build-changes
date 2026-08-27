import java.util.function.Consumer;

public interface few extends fex {
   void b(Consumer<fex> var1);

   @Override
   default void a(Consumer<fbg> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof few $$1) {
            $$1.a();
         }
      });
   }
}
