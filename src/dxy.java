import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxy {
   private final dhk a;
   private final jh b;
   private final boolean c;
   @Nullable
   private dxu d;
   @Nullable
   private duw e;
   private boolean f;

   public dxy(dhk $$0, jh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dxu a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public duw b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhk c() {
      return this.a;
   }

   public jh d() {
      return this.b;
   }

   public static Predicate<dxy> a(Predicate<dxu> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
