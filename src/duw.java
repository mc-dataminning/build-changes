import java.util.function.Predicate;
import javax.annotation.Nullable;

public class duw {
   private final dem a;
   private final jf b;
   private final boolean c;
   @Nullable
   private dus d;
   @Nullable
   private drv e;
   private boolean f;

   public duw(dem $$0, jf $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dus a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public drv b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dem c() {
      return this.a;
   }

   public jf d() {
      return this.b;
   }

   public static Predicate<duw> a(Predicate<dus> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
