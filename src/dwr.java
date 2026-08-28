import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwr<T extends dww> {
   private final T a;
   @Nullable
   private kb b;

   public dwr(T $$0) {
      this.a = $$0;
   }

   public void a(are $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(are $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(are $$0) {
      this.a.a().a($$0).map(kb::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dca $$0, @Nullable kb $$1, Consumer<dwx> $$2) {
      if ($$1 != null) {
         dtx $$3 = $$0.a($$1.a(), $$1.c(), duw.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
