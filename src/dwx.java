import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dwx<T extends dxc> {
   private final T a;
   @Nullable
   private kc b;

   public dwx(T $$0) {
      this.a = $$0;
   }

   public void a(aqk $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aqk $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aqk $$0) {
      this.a.a().a($$0).map(kc::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dcg $$0, @Nullable kc $$1, Consumer<dxd> $$2) {
      if ($$1 != null) {
         dud $$3 = $$0.a($$1.a(), $$1.c(), dvc.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
