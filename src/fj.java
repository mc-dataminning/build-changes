import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dnf> {
   private final dnb a;
   private final Set<doe<?>> b;
   @Nullable
   private final ta c;

   public fj(dnb $$0, Set<doe<?>> $$1, @Nullable ta $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dnb a() {
      return this.a;
   }

   public Set<doe<?>> b() {
      return this.b;
   }

   public boolean a(dnf $$0) {
      dnb $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (doe<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dki $$3 = $$0.b();
            return $$3 != null && tp.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(apf $$0, ib $$1) {
      return this.a(new dnf($$0, $$1, false));
   }

   public boolean a(apf $$0, ib $$1, int $$2) {
      dnb $$3 = dac.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dki $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
