import java.util.function.Consumer;

public interface fkq extends fkr {
   void b(Consumer<fkr> var1);

   @Override
   default void a(Consumer<fha> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fkq $$1) {
            $$1.a();
         }
      });
   }
}
