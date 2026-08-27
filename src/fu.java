import java.util.Set;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fu implements Predicate<dql> {
   private final dqh a;
   private final Set<drk<?>> b;
   @Nullable
   private final ua c;

   public fu(dqh $$0, Set<drk<?>> $$1, @Nullable ua $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public dqh a() {
      return this.a;
   }

   public Set<drk<?>> b() {
      return this.b;
   }

   public boolean a(dql $$0) {
      dqh $$1 = $$0.a();
      if (!$$1.a(this.a.b())) {
         return false;
      } else {
         for (drk<?> $$2 : this.b) {
            if ($$1.c($$2) != this.a.c($$2)) {
               return false;
            }
         }

         if (this.c == null) {
            return true;
         } else {
            dnm $$3 = $$0.b();
            return $$3 != null && up.a(this.c, $$3.b($$0.c().H_()), true);
         }
      }
   }

   public boolean a(aqh $$0, in $$1) {
      return this.a(new dql($$0, $$1, false));
   }

   public boolean a(aqh $$0, in $$1, int $$2) {
      dqh $$3 = dde.b(this.a, $$0, $$1);
      if ($$3.i()) {
         $$3 = this.a;
      }

      if (!$$0.a($$1, $$3, $$2)) {
         return false;
      } else {
         if (this.c != null) {
            dnm $$4 = $$0.c_($$1);
            if ($$4 != null) {
               $$4.a(this.c, $$0.H_());
            }
         }

         return true;
      }
   }
}
