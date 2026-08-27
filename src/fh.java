import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<djl> {
   private final djh a;
   private final Set<dkk<?>> b;
   @Nullable
   private final sn c;

   public fh(djh $$0, Set<dkk<?>> $$1, @Nullable sn $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public djh a() {
      return this.a;
   }

   public Set<dkk<?>> b() {
      return this.b;
   }

   public boolean a(djl $$0) {
      djh $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dkk<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dgv $$3 = $$0.b();
            return $$3 != null && tc.a(this.c, $$3.o(), true);
         }
      }
   }

   public boolean a(and $$0, hx $$1) {
      return this.a(new djl($$0, $$1, false));
   }

   public boolean a(and $$0, hx $$1, int $$2) {
      djh $$3 = cwq.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dgv $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
