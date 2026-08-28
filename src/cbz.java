import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cbz {
   private static final cdm a = new cdm(Integer.MAX_VALUE, new cby() {
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
   private final Map<cby.a, cdm> b = new EnumMap<>(cby.a.class);
   private final Set<cdm> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cby.a> d = EnumSet.noneOf(cby.a.class);

   public void a(int $$0, cby $$1) {
      this.c.add(new cdm($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cby> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cby $$0) {
      for (cdm $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdm $$0, EnumSet<cby.a> $$1) {
      for (cby.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdm $$0, Map<cby.a, cdm> $$1) {
      for (cby.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bon $$0 = bom.a();
      $$0.a("goalCleanup");

      for (cdm $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdm)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdm $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cby.a $$3 : $$2.j()) {
               cdm $$4 = this.b.getOrDefault($$3, a);
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
      bon $$1 = bom.a();
      $$1.a("goalTick");

      for (cdm $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdm> b() {
      return this.c;
   }

   public void a(cby.a $$0) {
      this.d.add($$0);
   }

   public void b(cby.a $$0) {
      this.d.remove($$0);
   }

   public void a(cby.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
