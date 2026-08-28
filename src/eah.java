import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eah<T extends eam> {
   private final T a;
   @Nullable
   private kj b;

   public eah(T $$0) {
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
      this.a.a().a($$0).map(kj::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dfi $$0, @Nullable kj $$1, Consumer<ean> $$2) {
      if ($$1 != null) {
         dxj $$3 = $$0.a($$1.a(), $$1.c(), dyk.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
