import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fs implements Predicate<dqc> {
   private final dpy a;
   private final Set<drb<?>> b;
   @Nullable
   private final ty c;

   public fs(dpy $$0, Set<drb<?>> $$1, @Nullable ty $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dpy a() {
      return this.a;
   }

   public Set<drb<?>> b() {
      return this.b;
   }

   public boolean a(dqc $$0) {
      dpy $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (drb<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dnd $$3 = $$0.b();
            return $$3 != null && un.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqe $$0, im $$1) {
      return this.a(new dqc($$0, $$1, false));
   }

   public boolean a(aqe $$0, im $$1, int $$2) {
      dpy $$3 = dcv.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dnd $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
