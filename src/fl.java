import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fl implements Predicate<dpm> {
   private final dpi a;
   private final Set<dql<?>> b;
   @Nullable
   private final to c;

   public fl(dpi $$0, Set<dql<?>> $$1, @Nullable to $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dpi a() {
      return this.a;
   }

   public Set<dql<?>> b() {
      return this.b;
   }

   public boolean a(dpm $$0) {
      dpi $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (dql<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dmo $$3 = $$0.b();
            return $$3 != null && ud.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(apu $$0, id $$1) {
      return this.a(new dpm($$0, $$1, false));
   }

   public boolean a(apu $$0, id $$1, int $$2) {
      dpi $$3 = dch.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dmo $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
