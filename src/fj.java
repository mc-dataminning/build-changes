import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fj implements Predicate<dnd> {
   private final dmz a;
   private final Set<doc<?>> b;
   @Nullable
   private final ta c;

   public fj(dmz $$0, Set<doc<?>> $$1, @Nullable ta $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dmz a() {
      return this.a;
   }

   public Set<doc<?>> b() {
      return this.b;
   }

   public boolean a(dnd $$0) {
      dmz $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (doc<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dkg $$3 = $$0.b();
            return $$3 != null && tp.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(apf $$0, ib $$1) {
      return this.a(new dnd($$0, $$1, false));
   }

   public boolean a(apf $$0, ib $$1, int $$2) {
      dmz $$3 = daa.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dkg $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
