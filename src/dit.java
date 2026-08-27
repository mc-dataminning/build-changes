import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dit {
   private final ctb a;
   private final hv b;
   private final boolean c;
   @Nullable
   private dip d;
   @Nullable
   private dgd e;
   private boolean f;

   public dit(ctb $$0, hv $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dip a() {
      if (this.d == null && (this.c || this.a.A(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dgd b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public ctb c() {
      return this.a;
   }

   public hv d() {
      return this.b;
   }

   public static Predicate<dit> a(Predicate<dip> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
