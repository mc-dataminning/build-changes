import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dvh {
   private final dey a;
   private final jg b;
   private final boolean c;
   @Nullable
   private dvd d;
   @Nullable
   private dsg e;
   private boolean f;

   public dvh(dey $$0, jg $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dvd a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dsg b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dey c() {
      return this.a;
   }

   public jg d() {
      return this.b;
   }

   public static Predicate<dvh> a(Predicate<dvd> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
