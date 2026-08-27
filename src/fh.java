import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<dhr> {
   private final dhn a;
   private final Set<diq<?>> b;
   @Nullable
   private final sd c;

   public fh(dhn $$0, Set<diq<?>> $$1, @Nullable sd $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhn a() {
      return this.a;
   }

   public Set<diq<?>> b() {
      return this.b;
   }

   public boolean a(dhr $$0) {
      dhn $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (diq<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dfi $$3 = $$0.b();
            return $$3 != null && ss.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(ami $$0, hx $$1) {
      return this.a(new dhr($$0, $$1, false));
   }

   public boolean a(ami $$0, hx $$1, int $$2) {
      dhn $$3 = cvf.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dfi $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
