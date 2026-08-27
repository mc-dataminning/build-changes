import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fd implements Predicate<dfd> {
   private final dez a;
   private final Set<dgc<?>> b;
   @Nullable
   private final qr c;

   public fd(dez $$0, Set<dgc<?>> $$1, @Nullable qr $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dez a() {
      return this.a;
   }

   public Set<dgc<?>> b() {
      return this.b;
   }

   public boolean a(dfd $$0) {
      dez $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgc<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dcl $$3 = $$0.b();
            return $$3 != null && rd.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(akk $$0, gu $$1) {
      return this.a(new dfd($$0, $$1, false));
   }

   public boolean a(akk $$0, gu $$1, int $$2) {
      dez $$3 = csl.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dcl $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
