import java.util.function.Consumer;

public interface eyk extends eyl {
   void b(Consumer<eyl> var1);

   @Override
   default void a(Consumer<eux> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof eyk $$1) {
            $$1.a();
         }
      });
   }
}
