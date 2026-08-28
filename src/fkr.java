import java.util.function.Consumer;

public interface fkr extends fks {
   void b(Consumer<fks> var1);

   @Override
   default void a(Consumer<fhb> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fkr $$1) {
            $$1.a();
         }
      });
   }
}
