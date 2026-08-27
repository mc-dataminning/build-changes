import java.util.function.Consumer;

public interface exx extends exy {
   void b(Consumer<exy> var1);

   @Override
   default void a(Consumer<euk> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof exx $$1) {
            $$1.a();
         }
      });
   }
}
