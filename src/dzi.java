import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzi<T extends dzn> {
   private final T a;
   @Nullable
   private kg b;

   public dzi(T $$0) {
      this.a = $$0;
   }

   public void a(arh $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(arh $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(arh $$0) {
      this.a.a().a($$0).map(kg::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dej $$0, @Nullable kg $$1, Consumer<dzo> $$2) {
      if ($$1 != null) {
         dwk $$3 = $$0.a($$1.a(), $$1.c(), dxl.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
