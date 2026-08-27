import java.util.function.Consumer;

public interface fis extends fit {
   void b(Consumer<fit> var1);

   @Override
   default void a(Consumer<ffc> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fis $$1) {
            $$1.a();
         }
      });
   }
}
