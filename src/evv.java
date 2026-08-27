import java.util.function.Consumer;

public interface evv extends evw {
   void b(Consumer<evw> var1);

   @Override
   default void a(Consumer<esj> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof evv $$1) {
            $$1.a();
         }
      });
   }
}
