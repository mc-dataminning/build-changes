import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<dhm> {
   private final dhi a;
   private final Set<dil<?>> b;
   @Nullable
   private final rz c;

   public fh(dhi $$0, Set<dil<?>> $$1, @Nullable rz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dhi a() {
      return this.a;
   }

   public Set<dil<?>> b() {
      return this.b;
   }

   public boolean a(dhm $$0) {
      dhi $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dil<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dfd $$3 = $$0.b();
            return $$3 != null && so.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(ame $$0, ht $$1) {
      return this.a(new dhm($$0, $$1, false));
   }

   public boolean a(ame $$0, ht $$1, int $$2) {
      dhi $$3 = cva.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dfd $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
