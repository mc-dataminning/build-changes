import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dln> {
   private final dlj a;
   private final Set<dmm<?>> b;
   @Nullable
   private final sw c;

   public fj(dlj $$0, Set<dmm<?>> $$1, @Nullable sw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dlj a() {
      return this.a;
   }

   public Set<dmm<?>> b() {
      return this.b;
   }

   public boolean a(dln $$0) {
      dlj $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dmm<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dix $$3 = $$0.b();
            return $$3 != null && tl.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(aow $$0, hz $$1) {
      return this.a(new dln($$0, $$1, false));
   }

   public boolean a(aow $$0, hz $$1, int $$2) {
      dlj $$3 = cys.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dix $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
