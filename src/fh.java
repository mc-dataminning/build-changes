import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fh implements Predicate<dha> {
   private final dgw a;
   private final Set<dhz<?>> b;
   @Nullable
   private final rz c;

   public fh(dgw $$0, Set<dhz<?>> $$1, @Nullable rz $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dgw a() {
      return this.a;
   }

   public Set<dhz<?>> b() {
      return this.b;
   }

   public boolean a(dha $$0) {
      dgw $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dhz<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            der $$3 = $$0.b();
            return $$3 != null && so.a(this.c, $$3.m(), true);
         }
      }
   }

   public boolean a(ama $$0, ht $$1) {
      return this.a(new dha($$0, $$1, false));
   }

   public boolean a(ama $$0, ht $$1, int $$2) {
      dgw $$3 = cut.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            der $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c);
            }
         }

         return true;
      }
   }
}
