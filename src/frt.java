import java.util.function.Consumer;

public interface frt extends fru {
   void b(Consumer<fru> var1);

   @Override
   default void a(Consumer<fob> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof frt $$1) {
            $$1.a();
         }
      });
   }
}
