import java.util.function.Predicate;
import javax.annotation.Nullable;

public class dsg {
   private final dcb a;
   private final iz b;
   private final boolean c;
   @Nullable
   private dsc d;
   @Nullable
   private dph e;
   private boolean f;

   public dsg(dcb $$0, iz $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.i();
      this.c = $$2;
   }

   public dsc a() {
      if (this.d == null && (this.c || this.a.B(this.b))) {
         this.d = this.a.a_(this.b);
      }

      return this.d;
   }

   @Nullable
   public dph b() {
      if (this.e == null && !this.f) {
         this.e = this.a.c_(this.b);
         this.f = true;
      }

      return this.e;
   }

   public dcb c() {
      return this.a;
   }

   public iz d() {
      return this.b;
   }

   public static Predicate<dsg> a(Predicate<dsc> $$0) {
      return $$1 -> $$1 != null && $$0.test($$1.a());
   }
}
