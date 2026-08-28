import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cdz {
   private static final cfm a = new cfm(Integer.MAX_VALUE, new cdy() {
      @Override
      public boolean b() {
         return false;
      }
   }) {
      @Override
      public boolean h() {
         return false;
      }
   };
   private final Map<cdy.a, cfm> b = new EnumMap<>(cdy.a.class);
   private final Set<cfm> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cdy.a> d = EnumSet.noneOf(cdy.a.class);

   public void a(int $$0, cdy $$1) {
      this.c.add(new cfm($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cdy> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cdy $$0) {
      for (cfm $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cfm $$0, EnumSet<cdy.a> $$1) {
      for (cdy.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cfm $$0, Map<cdy.a, cfm> $$1) {
      for (cdy.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bqm $$0 = bql.a();
      $$0.a("goalCleanup");

      for (cfm $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cfm)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cfm $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cdy.a $$3 : $$2.j()) {
               cfm $$4 = this.b.getOrDefault($$3, a);
               $$4.e();
               this.b.put($$3, $$2);
            }

            $$2.d();
         }
      }

      $$0.c();
      this.a(true);
   }

   public void a(boolean $$0) {
      bqm $$1 = bql.a();
      $$1.a("goalTick");

      for (cfm $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cfm> b() {
      return this.c;
   }

   public void a(cdy.a $$0) {
      this.d.add($$0);
   }

   public void b(cdy.a $$0) {
      this.d.remove($$0);
   }

   public void a(cdy.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
