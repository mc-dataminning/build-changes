import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dlp<T extends dlu> {
   private final T a;
   @Nullable
   private iu b;

   public dlp(T $$0) {
      this.a = $$0;
   }

   public void a(ame $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(ame $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(ame $$0) {
      this.a.a().a($$0).map(iu::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(csd $$0, @Nullable iu $$1, Consumer<dlv> $$2) {
      if ($$1 != null) {
         dje $$3 = $$0.a($$1.a(), $$1.c(), djj.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
