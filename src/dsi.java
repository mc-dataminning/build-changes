import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsi {
   private final dcd a;
   private final iz b;
   private final boolean c;
   @Nullable
   private dse d;
   @Nullable
   private dpj e;
   private boolean f;

   public dsi(dcd $$0, iz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dse a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dpj b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcd c() {
      return this.a;
   }

   public iz d() {
      return this.b;
   }

   public static Predicate<dsi> a(Predicate<dse> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
