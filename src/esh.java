import java.util.function.Consumer;

public interface esh extends esi {
   void b(Consumer<esi> var1);

   @Override
   default void a(Consumer<epf> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void c() {
      this.b($$0 -> {
         if ($$0 instanceof esh $$1) {
            $$1.c();
         }
      });
   }
}
