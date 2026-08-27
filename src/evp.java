import java.util.function.Consumer;

public interface evp extends evq {
   void b(Consumer<evq> var1);

   @Override
   default void a(Consumer<esf> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof evp $$1) {
            $$1.a();
         }
      });
   }
}
