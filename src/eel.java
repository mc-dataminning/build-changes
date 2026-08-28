import java.util.function.Consumer;
import javax.annotation.Nullable;

public class eel<T extends eeq> {
   private final T a;
   @Nullable
   private jx b;

   public eel(T $$0) {
      this.a = $$0;
   }

   public void a(aro $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aro $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aro $$0) {
      this.a.a().a($$0).map(jx::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dis $$0, @Nullable jx $$1, Consumer<eer> $$2) {
      if ($$1 != null) {
         ebl $$3 = $$0.a($$1.a(), $$1.c(), ecm.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
