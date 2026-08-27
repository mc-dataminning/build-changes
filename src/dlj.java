import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dlj {
   private final cvq a;
   private final hz b;
   private final boolean c;
   @Nullable
   private dlf d;
   @Nullable
   private dit e;
   private boolean f;

   public dlj(cvq $$0, hz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dlf a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dit b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public cvq c() {
      return this.a;
   }

   public hz d() {
      return this.b;
   }

   public static Predicate<dlj> a(Predicate<dlf> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
