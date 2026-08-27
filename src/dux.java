import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dux<T extends dvc> {
   private final T a;
   @Nullable
   private jp b;

   public dux(T $$0) {
      this.a = $$0;
   }

   public void a(aqh $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aqh $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aqh $$0) {
      this.a.a().a($$0).map(jp::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dag $$0, @Nullable jp $$1, Consumer<dvd> $$2) {
      if ($$1 != null) {
         dsd $$3 = $$0.a($$1.a(), $$1.c(), dtc.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
