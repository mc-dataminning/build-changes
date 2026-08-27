import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djq<T extends djv> {
   private final T a;
   @Nullable
   private hw b;

   public djq(T $$0) {
      this.a = $$0;
   }

   public void a(akq $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(akq $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(akq $$0) {
      this.a.a().a($$0).map(hw::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cpy $$0, @Nullable hw $$1, Consumer<djw> $$2) {
      if ($$1 != null) {
         dhf $$3 = $$0.a($$1.a(), $$1.c(), dhk.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
