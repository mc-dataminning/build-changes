import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eco<T extends ect> {
   private final T a;
   @Nullable
   private kj b;

   public eco(T $$0) {
      this.a = $$0;
   }

   public void a(ash $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(ash $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(ash $$0) {
      this.a.a().a($$0).map(kj::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dhl $$0, @Nullable kj $$1, Consumer<ecu> $$2) {
      if ($$1 != null) {
         dzq $$3 = $$0.a($$1.a(), $$1.c(), ear.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
