import java.util.function.Consumer;

public interface fro extends frp {
   void b(Consumer<frp> var1);

   @Override
   default void a(Consumer<fnw> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fro $$1) {
            $$1.a();
         }
      });
   }
}
