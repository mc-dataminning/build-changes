import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dso {
   private final dci a;
   private final ja b;
   private final boolean c;
   @Nullable
   private dsk d;
   @Nullable
   private dpp e;
   private boolean f;

   public dso(dci $$0, ja $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dsk a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dpp b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dci c() {
      return this.a;
   }

   public ja d() {
      return this.b;
   }

   public static Predicate<dso> a(Predicate<dsk> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
