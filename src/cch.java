import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cch {
   private static final cdu a = new cdu(Integer.MAX_VALUE, new ccg() {
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
   private final Map<ccg.a, cdu> b = new EnumMap<>(ccg.a.class);
   private final Set<cdu> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccg.a> d = EnumSet.noneOf(ccg.a.class);

   public void a(int $$0, ccg $$1) {
      this.c.add(new cdu($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccg> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccg $$0) {
      for (cdu $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdu $$0, EnumSet<ccg.a> $$1) {
      for (ccg.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdu $$0, Map<ccg.a, cdu> $$1) {
      for (ccg.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bou $$0 = bot.a();
      $$0.a("goalCleanup");

      for (cdu $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdu)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdu $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccg.a $$3 : $$2.j()) {
               cdu $$4 = this.b.getOrDefault($$3, a);
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
      bou $$1 = bot.a();
      $$1.a("goalTick");

      for (cdu $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdu> b() {
      return this.c;
   }

   public void a(ccg.a $$0) {
      this.d.add($$0);
   }

   public void b(ccg.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccg.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
