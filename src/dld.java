import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dld<T extends dli> {
   private final T a;
   @Nullable
   private iu b;

   public dld(T $$0) {
      this.a = $$0;
   }

   public void a(ama $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(ama $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(ama $$0) {
      this.a.a().a($$0).map(iu::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(crv $$0, @Nullable iu $$1, Consumer<dlj> $$2) {
      if ($$1 != null) {
         dis $$3 = $$0.a($$1.a(), $$1.c(), dix.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
