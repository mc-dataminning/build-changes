import java.util.function.Consumer;

public interface faj extends fak {
   void b(Consumer<fak> var1);

   @Override
   default void a(Consumer<eww> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof faj $$1) {
            $$1.a();
         }
      });
   }
}
