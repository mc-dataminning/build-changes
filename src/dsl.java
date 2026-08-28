import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsl {
   private final dcg a;
   private final ja b;
   private final boolean c;
   @Nullable
   private dsh d;
   @Nullable
   private dpn e;
   private boolean f;

   public dsl(dcg $$0, ja $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dsh a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dpn b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcg c() {
      return this.a;
   }

   public ja d() {
      return this.b;
   }

   public static Predicate<dsl> a(Predicate<dsh> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
