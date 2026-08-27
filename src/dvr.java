import java.util.function.Consumer;
import javax.annotation.Nullable;

public class dvr<T extends dvw> {
   private final T a;
   @Nullable
   private jq b;

   public dvr(T $$0) {
      this.a = $$0;
   }

   public void a(aqm $$0) {
      this.c($$0);
   }

   public T a() {
      return this.a;
   }

   public void b(aqm $$0) {
      a($$0, this.b, $$0x -> $$0x.b(this.a));
   }

   public void c(aqm $$0) {
      this.a.a().a($$0).map(jq::a).ifPresent($$1 -> {
         if (this.b == null || !this.b.equals($$1)) {
            a($$0, this.b, $$0xx -> $$0xx.b(this.a));
            this.b = $$1;
            a($$0, this.b, $$0xx -> $$0xx.a(this.a));
         }
      });
   }

   private static void a(dba $$0, @Nullable jq $$1, Consumer<dvx> $$2) {
      if ($$1 != null) {
         dsx $$3 = $$0.a($$1.a(), $$1.c(), dtw.n, false);
         if ($$3 != null) {
            $$2.accept($$3.a($$1.b()));
         }
      }
   }
}
