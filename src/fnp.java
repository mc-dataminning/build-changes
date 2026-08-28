import java.util.function.Consumer;

public interface fnp extends fnq {
   void b(Consumer<fnq> var1);

   @Override
   default void a(Consumer<fjy> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof fnp $$1) {
            $$1.a();
         }
      });
   }
}
