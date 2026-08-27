import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dmi> {
   private final dme a;
   private final Set<dnh<?>> b;
   @Nullable
   private final sy c;

   public fj(dme $$0, Set<dnh<?>> $$1, @Nullable sy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dme a() {
      return this.a;
   }

   public Set<dnh<?>> b() {
      return this.b;
   }

   public boolean a(dmi $$0) {
      dme $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dnh<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            djl $$3 = $$0.b();
            return $$3 != null && tn.a(this.c, $$3.b($$0.c().I_()), true);
         }
      }
   }

   public boolean a(apa $$0, ib $$1) {
      return this.a(new dmi($$0, $$1, false));
   }

   public boolean a(apa $$0, ib $$1, int $$2) {
      dme $$3 = czf.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            djl $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.I_());
            }
         }

         return true;
      }
   }
}
