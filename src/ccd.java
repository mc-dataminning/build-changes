import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ccd {
   private static final cdq a = new cdq(Integer.MAX_VALUE, new ccc() {
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
   private final Map<ccc.a, cdq> b = new EnumMap<>(ccc.a.class);
   private final Set<cdq> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccc.a> d = EnumSet.noneOf(ccc.a.class);

   public void a(int $$0, ccc $$1) {
      this.c.add(new cdq($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccc> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccc $$0) {
      for (cdq $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdq $$0, EnumSet<ccc.a> $$1) {
      for (ccc.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdq $$0, Map<ccc.a, cdq> $$1) {
      for (ccc.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bor $$0 = boq.a();
      $$0.a("goalCleanup");

      for (cdq $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdq)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdq $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccc.a $$3 : $$2.j()) {
               cdq $$4 = this.b.getOrDefault($$3, a);
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
      bor $$1 = boq.a();
      $$1.a("goalTick");

      for (cdq $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdq> b() {
      return this.c;
   }

   public void a(ccc.a $$0) {
      this.d.add($$0);
   }

   public void b(ccc.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccc.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
