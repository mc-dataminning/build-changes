import java.util.function.Consumer;

public interface fap extends faq {
   void b(Consumer<faq> var1);

   @Override
   default void a(Consumer<exc> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fap $$1) {
            $$1.a();
         }
      });
   }
}
