import java.util.function.Consumer;

public interface eyp extends eyq {
   void b(Consumer<eyq> var1);

   @Override
   default void a(Consumer<evc> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof eyp $$1) {
            $$1.a();
         }
      });
   }
}
