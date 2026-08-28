import java.util.function.Consumer;

public interface flg extends flh {
   void b(Consumer<flh> var1);

   @Override
   default void a(Consumer<fhq> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof flg $$1) {
            $$1.a();
         }
      });
   }
}
