import java.util.function.Consumer;

public interface fsi extends fsj {
   void b(Consumer<fsj> var1);

   @Override
   default void a(Consumer<foq> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fsi $$1) {
            $$1.a();
         }
      });
   }
}
