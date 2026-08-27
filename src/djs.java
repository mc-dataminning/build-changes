import java.util.function.Consumer;
import javax.annotation.Nullable;

public class djs<T extends djx> {
   private final T a;
   @Nullable
   private hz b;

   public djs(T $$0) {
      this.a = $$0;
   }

   public void a(aks $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aks $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aks $$0) {
      this.a.a().a($$0).map(hz::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cqa $$0, @Nullable hz $$1, Consumer<djy> $$2) {
      if ($$1 != null) {
         dhh $$3 = $$0.a($$1.a(), $$1.c(), dhm.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
