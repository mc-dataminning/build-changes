import java.util.function.Consumer;

public interface fsj extends fsk {
   void b(Consumer<fsk> var1);

   @Override
   default void a(Consumer<fos> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fsj $$1) {
            $$1.a();
         }
      });
   }
}
