import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxs {
   private final dhc a;
   private final jh b;
   private final boolean c;
   @Nullable
   private dxo d;
   @Nullable
   private duq e;
   private boolean f;

   public dxs(dhc $$0, jh $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dxo a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public duq b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhc c() {
      return this.a;
   }

   public jh d() {
      return this.b;
   }

   public static Predicate<dxs> a(Predicate<dxo> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
