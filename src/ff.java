import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ff implements Predicate<dfp> {
   private final dfl a;
   private final Set<dgo<?>> b;
   @Nullable
   private final qy c;

   public ff(dfl $$0, Set<dgo<?>> $$1, @Nullable qy $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dfl a() {
      return this.a;
   }

   public Set<dgo<?>> b() {
      return this.b;
   }

   public boolean a(dfp $$0) {
      dfl $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgo<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dcx $$3 = $$0.b();
            return $$3 != null && rl.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(aks $$0, gw $$1) {
      return this.a(new dfp($$0, $$1, false));
   }

   public boolean a(aks $$0, gw $$1, int $$2) {
      dfl $$3 = csx.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dcx $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
