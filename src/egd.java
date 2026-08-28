import java.util.function.Consumer;
import javax.annotation.Nullable;

public class egd<T extends egi> {
   private final T a;
   @Nullable
   private jz b;

   public egd(T $$0) {
      this.a = $$0;
   }

   public void a(aru $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aru $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aru $$0) {
      this.a.a().a($$0).map(jz::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dkc $$0, @Nullable jz $$1, Consumer<egj> $$2) {
      if ($$1 != null) {
         edd $$3 = $$0.a($$1.a(), $$1.c(), eee.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
