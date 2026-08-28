import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dyu<T extends dyz> {
   private final T a;
   @Nullable
   private kg b;

   public dyu(T $$0) {
      this.a = $$0;
   }

   public void a(arg $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(arg $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(arg $$0) {
      this.a.a().a($$0).map(kg::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(ddv $$0, @Nullable kg $$1, Consumer<dza> $$2) {
      if ($$1 != null) {
         dvw $$3 = $$0.a($$1.a(), $$1.c(), dwx.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
