import java.util.function.Predicate;
import javax.annotation.Nullable;

public class eal {
   private final djd a;
   private final iu b;
   private final boolean c;
   @Nullable
   private eah d;
   @Nullable
   private dxf e;
   private boolean f;

   public eal(djd $$0, iu $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.j();
      this.c = $$2;
   }

   public eah a() {
      if (this.d == null && (this.c || this.a.C(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dxf b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public djd c() {
      return this.a;
   }

   public iu d() {
      return this.b;
   }

   public static Predicate<eal> a(Predicate<eah> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
