import java.util.function.Predicate;
import javax.annotation.Nullable;

public class djl {
   private final cts a;
   private final hx b;
   private final boolean c;
   @Nullable
   private djh d;
   @Nullable
   private dgv e;
   private boolean f;

   public djl(cts $$0, hx $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public djh a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dgv b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cts c() {
      return this.a;
   }

   public hx d() {
      return this.b;
   }

   public static Predicate<djl> a(Predicate<djh> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
