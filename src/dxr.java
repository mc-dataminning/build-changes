import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxr {
   private final dhd a;
   private final jh b;
   private final boolean c;
   @Nullable
   private dxn d;
   @Nullable
   private dup e;
   private boolean f;

   public dxr(dhd $$0, jh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dxn a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dup b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhd c() {
      return this.a;
   }

   public jh d() {
      return this.b;
   }

   public static Predicate<dxr> a(Predicate<dxn> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
