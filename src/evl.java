import java.util.function.Consumer;

public interface evl extends evm {
   void b(Consumer<evm> var1);

   @Override
   default void a(Consumer<esg> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof evl $$1) {
            $$1.a();
         }
      });
   }
}
