import java.util.function.Consumer;
import javax.annotation.Nullable;

public class ebr<T extends ebw> {
   private final T a;
   @Nullable
   private kk b;

   public ebr(T $$0) {
      this.a = $$0;
   }

   public void a(ard $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(ard $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(ard $$0) {
      this.a.a().a($$0).map(kk::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dgm $$0, @Nullable kk $$1, Consumer<ebx> $$2) {
      if ($$1 != null) {
         dyt $$3 = $$0.a($$1.a(), $$1.c(), dzu.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
