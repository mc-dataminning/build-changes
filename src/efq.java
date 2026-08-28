import java.util.function.Consumer;
import javax.annotation.Nullable;

public class efq<T extends efv> {
   private final T a;
   @Nullable
   private jy b;

   public efq(T $$0) {
      this.a = $$0;
   }

   public void a(arq $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(arq $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(arq $$0) {
      this.a.a().a($$0).map(jy::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(djp $$0, @Nullable jy $$1, Consumer<efw> $$2) {
      if ($$1 != null) {
         ecq $$3 = $$0.a($$1.a(), $$1.c(), edr.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
