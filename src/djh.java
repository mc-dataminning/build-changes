import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djh<T extends djm> {
   private final T a;
   @Nullable
   private hx b;

   public djh(T $$0) {
      this.a = $$0;
   }

   public void a(akk $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(akk $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(akk $$0) {
      this.a.a().a($$0).map(hx::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cpp $$0, @Nullable hx $$1, Consumer<djn> $$2) {
      if ($$1 != null) {
         dgw $$3 = $$0.a($$1.a(), $$1.c(), dhb.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
