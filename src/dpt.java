import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dpt<T extends dpy> {
   private final T a;
   @Nullable
   private jb b;

   public dpt(T $$0) {
      this.a = $$0;
   }

   public void a(aow $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aow $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aow $$0) {
      this.a.a().a($$0).map(jb::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(cvu $$0, @Nullable jb $$1, Consumer<dpz> $$2) {
      if ($$1 != null) {
         dnf $$3 = $$0.a($$1.a(), $$1.c(), dnk.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
