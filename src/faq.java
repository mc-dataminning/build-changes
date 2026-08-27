import java.util.function.Consumer;

public interface faq extends far {
   void b(Consumer<far> var1);

   @Override
   default void a(Consumer<exd> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof faq $$1) {
            $$1.a();
         }
      });
   }
}
