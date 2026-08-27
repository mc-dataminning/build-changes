import java.util.function.Consumer;

public interface fjo extends fjp {
   void b(Consumer<fjp> var1);

   @Override
   default void a(Consumer<ffy> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fjo $$1) {
            $$1.a();
         }
      });
   }
}
