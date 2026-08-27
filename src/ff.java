import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements Predicate<dfh> {
   private final dfd a;
   private final Set<dgg<?>> b;
   @Nullable
   private final qw c;

   public ff(dfd $$0, Set<dgg<?>> $$1, @Nullable qw $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfd a() {
      return this.a;
   }

   public Set<dgg<?>> b() {
      return this.b;
   }

   public boolean a(dfh $$0) {
      dfd $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgg<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dcz $$3 = $$0.b();
            return $$3 != null && rj.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(akt $$0, gw $$1) {
      return this.a(new dfh($$0, $$1, false));
   }

   public boolean a(akt $$0, gw $$1, int $$2) {
      dfd $$3 = ctc.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dcz $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
