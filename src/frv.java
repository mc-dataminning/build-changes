import java.util.function.Consumer;

public interface frv extends frw {
   void b(Consumer<frw> var1);

   @Override
   default void a(Consumer<fod> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof frv $$1) {
            $$1.a();
         }
      });
   }
}
