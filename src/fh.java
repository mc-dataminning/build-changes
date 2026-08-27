import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<djk> {
   private final djg a;
   private final Set<dkj<?>> b;
   @Nullable
   private final sn c;

   public fh(djg $$0, Set<dkj<?>> $$1, @Nullable sn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djg a() {
      return this.a;
   }

   public Set<dkj<?>> b() {
      return this.b;
   }

   public boolean a(djk $$0) {
      djg $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dkj<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dgu $$3 = $$0.b();
            return $$3 != null && tc.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(and $$0, hx $$1) {
      return this.a(new djk($$0, $$1, false));
   }

   public boolean a(and $$0, hx $$1, int $$2) {
      djg $$3 = cwp.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dgu $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
