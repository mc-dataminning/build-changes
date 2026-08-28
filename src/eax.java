import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eax {
   private final djp a;
   private final iv b;
   private final boolean c;
   @Nullable
   private eat d;
   @Nullable
   private dxr e;
   private boolean f;

   public eax(djp $$0, iv $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public eat a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dxr b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public djp c() {
      return this.a;
   }

   public iv d() {
      return this.b;
   }

   public static Predicate<eax> a(Predicate<eat> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
