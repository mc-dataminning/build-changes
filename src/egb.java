import java.util.function.Consumer;
import javax.annotation.Nullable;

public class egb<T extends egg> {
   private final T a;
   @Nullable
   private jy b;

   public egb(T $$0) {
      this.a = $$0;
   }

   public void a(ars $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(ars $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(ars $$0) {
      this.a.a().a($$0).map(jy::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dka $$0, @Nullable jy $$1, Consumer<egh> $$2) {
      if ($$1 != null) {
         edb $$3 = $$0.a($$1.a(), $$1.c(), eec.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
