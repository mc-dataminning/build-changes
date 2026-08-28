import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dte {
   private final dcx a;
   private final jd b;
   private final boolean c;
   @Nullable
   private dta d;
   @Nullable
   private dqf e;
   private boolean f;

   public dte(dcx $$0, jd $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dta a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dqf b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcx c() {
      return this.a;
   }

   public jd d() {
      return this.b;
   }

   public static Predicate<dte> a(Predicate<dta> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
