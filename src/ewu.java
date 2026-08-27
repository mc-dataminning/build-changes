import java.util.function.Consumer;

public interface ewu extends ewv {
   void b(Consumer<ewv> var1);

   @Override
   default void a(Consumer<eth> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof ewu $$1) {
            $$1.a();
         }
      });
   }
}
