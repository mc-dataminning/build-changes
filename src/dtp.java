import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dtp<T extends dtu> {
   private final T a;
   @Nullable
   private je b;

   public dtp(T $$0) {
      this.a = $$0;
   }

   public void a(aps $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aps $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aps $$0) {
      this.a.a().a($$0).map(je::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cza $$0, @Nullable je $$1, Consumer<dtv> $$2) {
      if ($$1 != null) {
         dqv $$3 = $$0.a($$1.a(), $$1.c(), dru.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
