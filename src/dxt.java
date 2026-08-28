import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dxt<T extends dxy> {
   private final T a;
   @Nullable
   private kf b;

   public dxt(T $$0) {
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
      this.a.a().a($$0).map(kf::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dcx $$0, @Nullable kf $$1, Consumer<dxz> $$2) {
      if ($$1 != null) {
         duw $$3 = $$0.a($$1.a(), $$1.c(), dvx.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
