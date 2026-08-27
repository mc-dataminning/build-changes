import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<dgf> {
   private final dgb a;
   private final Set<dhe<?>> b;
   @Nullable
   private final rt c;

   public fh(dgb $$0, Set<dhe<?>> $$1, @Nullable rt $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dgb a() {
      return this.a;
   }

   public Set<dhe<?>> b() {
      return this.b;
   }

   public boolean a(dgf $$0) {
      dgb $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dhe<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            ddx $$3 = $$0.b();
            return $$3 != null && sg.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(alq $$0, ht $$1) {
      return this.a(new dgf($$0, $$1, false));
   }

   public boolean a(alq $$0, ht $$1, int $$2) {
      dgb $$3 = cua.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            ddx $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
