import java.util.function.Consumer;

public interface fks extends fkt {
   void b(Consumer<fkt> var1);

   @Override
   default void a(Consumer<fhc> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fks $$1) {
            $$1.a();
         }
      });
   }
}
