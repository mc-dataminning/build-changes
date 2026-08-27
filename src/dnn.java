import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dnn<T extends dns> {
   private final T a;
   @Nullable
   private iz b;

   public dnn(T $$0) {
      this.a = $$0;
   }

   public void a(and $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(and $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(and $$0) {
      this.a.a().a($$0).map(iz::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(ctr $$0, @Nullable iz $$1, Consumer<dnt> $$2) {
      if ($$1 != null) {
         dlc $$3 = $$0.a($$1.a(), $$1.c(), dlh.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
