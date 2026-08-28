import java.util.function.Consumer;

public interface fox extends foy {
   void b(Consumer<foy> var1);

   @Override
   default void a(Consumer<flf> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fox $$1) {
            $$1.a();
         }
      });
   }
}
