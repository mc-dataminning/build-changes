import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dse {
   private final dbz a;
   private final iz b;
   private final boolean c;
   @Nullable
   private dsa d;
   @Nullable
   private dpf e;
   private boolean f;

   public dse(dbz $$0, iz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dsa a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dpf b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dbz c() {
      return this.a;
   }

   public iz d() {
      return this.b;
   }

   public static Predicate<dse> a(Predicate<dsa> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
