import java.util.function.Consumer;

public interface foo extends fop {
   void b(Consumer<fop> var1);

   @Override
   default void a(Consumer<fkx> $$0) {
      this.b($$1 -> $$1.a($$0));
   }

   default void a() {
      this.b($$0 -> {
         if ($$0 instanceof foo $$1) {
            $$1.a();
         }
      });
   }
}
