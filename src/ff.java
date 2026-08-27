import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements Predicate<dfi> {
   private final dfe a;
   private final Set<dgh<?>> b;
   @Nullable
   private final qu c;

   public ff(dfe $$0, Set<dgh<?>> $$1, @Nullable qu $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfe a() {
      return this.a;
   }

   public Set<dgh<?>> b() {
      return this.b;
   }

   public boolean a(dfi $$0) {
      dfe $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgh<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dcq $$3 = $$0.b();
            return $$3 != null && rg.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(akn $$0, gw $$1) {
      return this.a(new dfi($$0, $$1, false));
   }

   public boolean a(akn $$0, gw $$1, int $$2) {
      dfe $$3 = csq.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dcq $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
