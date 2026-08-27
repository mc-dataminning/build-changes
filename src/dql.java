import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dql {
   private final dag a;
   private final in b;
   private final boolean c;
   @Nullable
   private dqh d;
   @Nullable
   private dnm e;
   private boolean f;

   public dql(dag $$0, in $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dqh a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dnm b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dag c() {
      return this.a;
   }

   public in d() {
      return this.b;
   }

   public static Predicate<dql> a(Predicate<dqh> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
