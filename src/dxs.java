import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxs<T extends dxx> {
   private final T a;
   @Nullable
   private jt b;

   public dxs(T $$0) {
      this.a = $$0;
   }

   public void a(aqt $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aqt $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aqt $$0) {
      this.a.a().a($$0).map(jt::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dcd $$0, @Nullable jt $$1, Consumer<dxy> $$2) {
      if ($$1 != null) {
         duy $$3 = $$0.a($$1.a(), $$1.c(), dvx.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
