import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djl<T extends djq> {
   private final T a;
   @Nullable
   private hz b;

   public djl(T $$0) {
      this.a = $$0;
   }

   public void a(akn $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(akn $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(akn $$0) {
      this.a.a().a($$0).map(hz::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cpt $$0, @Nullable hz $$1, Consumer<djr> $$2) {
      if ($$1 != null) {
         dha $$3 = $$0.a($$1.a(), $$1.c(), dhf.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
