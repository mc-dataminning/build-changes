import java.util.function.Consumer;

public interface ftf extends ftg {
   void b(Consumer<ftg> var1);

   @Override
   default void a(Consumer<fpo> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof ftf $$1) {
            $$1.a();
         }
      });
   }
}
