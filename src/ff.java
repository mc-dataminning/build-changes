import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements Predicate<dit> {
   private final dip a;
   private final Set<djs<?>> b;
   @Nullable
   private final sj c;

   public ff(dip $$0, Set<djs<?>> $$1, @Nullable sj $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dip a() {
      return this.a;
   }

   public Set<djs<?>> b() {
      return this.b;
   }

   public boolean a(dit $$0) {
      dip $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (djs<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dgd $$3 = $$0.b();
            return $$3 != null && sy.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(amp $$0, hv $$1) {
      return this.a(new dit($$0, $$1, false));
   }

   public boolean a(amp $$0, hv $$1, int $$2) {
      dip $$3 = cvz.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dgd $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
