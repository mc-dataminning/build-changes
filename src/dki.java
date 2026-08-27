import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dki<T extends dkn> {
   private final T a;
   @Nullable
   private iu b;

   public dki(T $$0) {
      this.a = $$0;
   }

   public void a(alq $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(alq $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(alq $$0) {
      this.a.a().a($$0).map(iu::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(crc $$0, @Nullable iu $$1, Consumer<dko> $$2) {
      if ($$1 != null) {
         dhx $$3 = $$0.a($$1.a(), $$1.c(), dic.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
