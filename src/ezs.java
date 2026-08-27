import java.util.function.Consumer;

public interface ezs extends ezt {
   void b(Consumer<ezt> var1);

   @Override
   default void a(Consumer<ewf> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof ezs $$1) {
            $$1.a();
         }
      });
   }
}
