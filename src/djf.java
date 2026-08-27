import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djf<T extends djk> {
   private final T a;
   @Nullable
   private hy b;

   public djf(T $$0) {
      this.a = $$0;
   }

   public void a(aki $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aki $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aki $$0) {
      this.a.a().a($$0).map(hy::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cpn $$0, @Nullable hy $$1, Consumer<djl> $$2) {
      if ($$1 != null) {
         dgu $$3 = $$0.a($$1.a(), $$1.c(), dgz.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
