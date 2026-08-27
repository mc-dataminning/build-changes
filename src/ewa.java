import java.util.function.Consumer;

public interface ewa extends ewb {
   void b(Consumer<ewb> var1);

   @Override
   default void a(Consumer<eso> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof ewa $$1) {
            $$1.a();
         }
      });
   }
}
