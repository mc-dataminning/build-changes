import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements Predicate<dfn> {
   private final dfj a;
   private final Set<dgm<?>> b;
   @Nullable
   private final qx c;

   public ff(dfj $$0, Set<dgm<?>> $$1, @Nullable qx $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfj a() {
      return this.a;
   }

   public Set<dgm<?>> b() {
      return this.b;
   }

   public boolean a(dfn $$0) {
      dfj $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgm<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dcv $$3 = $$0.b();
            return $$3 != null && rj.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(akr $$0, gw $$1) {
      return this.a(new dfn($$0, $$1, false));
   }

   public boolean a(akr $$0, gw $$1, int $$2) {
      dfj $$3 = csv.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dcv $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
