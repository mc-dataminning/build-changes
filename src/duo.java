import java.util.function.Consumer;
import javax.annotation.Nullable;

public class duo<T extends dut> {
   private final T a;
   @Nullable
   private jo b;

   public duo(T $$0) {
      this.a = $$0;
   }

   public void a(aqe $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aqe $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aqe $$0) {
      this.a.a().a($$0).map(jo::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(czx $$0, @Nullable jo $$1, Consumer<duu> $$2) {
      if ($$1 != null) {
         dru $$3 = $$0.a($$1.a(), $$1.c(), dst.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
