import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dlj> {
   private final dlf a;
   private final Set<dmi<?>> b;
   @Nullable
   private final sw c;

   public fj(dlf $$0, Set<dmi<?>> $$1, @Nullable sw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dlf a() {
      return this.a;
   }

   public Set<dmi<?>> b() {
      return this.b;
   }

   public boolean a(dlj $$0) {
      dlf $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dmi<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dit $$3 = $$0.b();
            return $$3 != null && tl.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(aov $$0, hz $$1) {
      return this.a(new dlj($$0, $$1, false));
   }

   public boolean a(aov $$0, hz $$1, int $$2) {
      dlf $$3 = cyo.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dit $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
