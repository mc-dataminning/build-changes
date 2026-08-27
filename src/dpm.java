import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dpm {
   private final czj a;
   private final id b;
   private final boolean c;
   @Nullable
   private dpi d;
   @Nullable
   private dmo e;
   private boolean f;

   public dpm(czj $$0, id $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dpi a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dmo b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public czj c() {
      return this.a;
   }

   public id d() {
      return this.b;
   }

   public static Predicate<dpm> a(Predicate<dpi> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
