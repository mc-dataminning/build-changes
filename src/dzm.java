import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dzm<T extends dzr> {
   private final T a;
   @Nullable
   private kh b;

   public dzm(T $$0) {
      this.a = $$0;
   }

   public void a(arj $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(arj $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(arj $$0) {
      this.a.a().a($$0).map(kh::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dem $$0, @Nullable kh $$1, Consumer<dzs> $$2) {
      if ($$1 != null) {
         dwo $$3 = $$0.a($$1.a(), $$1.c(), dxp.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
