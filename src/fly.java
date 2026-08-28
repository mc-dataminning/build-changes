import java.util.function.Consumer;

public interface fly extends flz {
   void b(Consumer<flz> var1);

   @Override
   default void a(Consumer<fii> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fly $$1) {
            $$1.a();
         }
      });
   }
}
