import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dpd> {
   private final doz a;
   private final Set<dqc<?>> b;
   @Nullable
   private final tm c;

   public fj(doz $$0, Set<dqc<?>> $$1, @Nullable tm $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public doz a() {
      return this.a;
   }

   public Set<dqc<?>> b() {
      return this.b;
   }

   public boolean a(dpd $$0) {
      doz $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dqc<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dmf $$3 = $$0.b();
            return $$3 != null && ub.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aps $$0, ib $$1) {
      return this.a(new dpd($$0, $$1, false));
   }

   public boolean a(aps $$0, ib $$1, int $$2) {
      doz $$3 = dby.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dmf $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
