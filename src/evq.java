import java.util.function.Consumer;

public interface evq extends evr {
   void b(Consumer<evr> var1);

   @Override
   default void a(Consumer<ese> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof evq $$1) {
            $$1.a();
         }
      });
   }
}
