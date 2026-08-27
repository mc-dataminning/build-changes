import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<djt> {
   private final djp a;
   private final Set<dks<?>> b;
   @Nullable
   private final so c;

   public fh(djp $$0, Set<dks<?>> $$1, @Nullable so $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djp a() {
      return this.a;
   }

   public Set<dks<?>> b() {
      return this.b;
   }

   public boolean a(djt $$0) {
      djp $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dks<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dhd $$3 = $$0.b();
            return $$3 != null && td.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(ane $$0, hx $$1) {
      return this.a(new djt($$0, $$1, false));
   }

   public boolean a(ane $$0, hx $$1, int $$2) {
      djp $$3 = cwy.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dhd $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
