import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fe implements Predicate<dfc> {
   private final dey a;
   private final Set<dgb<?>> b;
   @Nullable
   private final qs c;

   public fe(dey $$0, Set<dgb<?>> $$1, @Nullable qs $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dey a() {
      return this.a;
   }

   public Set<dgb<?>> b() {
      return this.b;
   }

   public boolean a(dfc $$0) {
      dey $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dgb<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dck $$3 = $$0.b();
            return $$3 != null && re.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(aki $$0, gv $$1) {
      return this.a(new dfc($$0, $$1, false));
   }

   public boolean a(aki $$0, gv $$1, int $$2) {
      dey $$3 = csk.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dck $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
