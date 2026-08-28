import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dxu {
   private final dhc a;
   private final ji b;
   private final boolean c;
   @Nullable
   private dxq d;
   @Nullable
   private dus e;
   private boolean f;

   public dxu(dhc $$0, ji $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public dxq a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dus b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dhc c() {
      return this.a;
   }

   public ji d() {
      return this.b;
   }

   public static Predicate<dxu> a(Predicate<dxq> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
