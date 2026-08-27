import java.util.function.Consumer;

public interface far extends fas {
   void b(Consumer<fas> var1);

   @Override
   default void a(Consumer<exe> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof far $$1) {
            $$1.a();
         }
      });
   }
}
