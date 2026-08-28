import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eas {
   private final djk a;
   private final iv b;
   private final boolean c;
   @Nullable
   private eao d;
   @Nullable
   private dxm e;
   private boolean f;

   public eas(djk $$0, iv $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public eao a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dxm b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public djk c() {
      return this.a;
   }

   public iv d() {
      return this.b;
   }

   public static Predicate<eas> a(Predicate<eao> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
