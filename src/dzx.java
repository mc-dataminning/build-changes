import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzx<T extends eac> {
   private final T a;
   @Nullable
   private ki b;

   public dzx(T $$0) {
      this.a = $$0;
   }

   public void a(arm $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(arm $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(arm $$0) {
      this.a.a().a($$0).map(ki::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dey $$0, @Nullable ki $$1, Consumer<ead> $$2) {
      if ($$1 != null) {
         dwz $$3 = $$0.a($$1.a(), $$1.c(), dya.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
