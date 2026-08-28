import java.util.function.Consumer;

public interface fod extends foe {
   void b(Consumer<foe> var1);

   @Override
   default void a(Consumer<fkm> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fod $$1) {
            $$1.a();
         }
      });
   }
}
