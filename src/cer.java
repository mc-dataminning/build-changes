import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cer {
   private static final cge a = new cge(Integer.MAX_VALUE, new ceq() {
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
   private final Map<ceq.a, cge> b = new EnumMap<>(ceq.a.class);
   private final Set<cge> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ceq.a> d = EnumSet.noneOf(ceq.a.class);

   public void a(int $$0, ceq $$1) {
      this.c.add(new cge($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ceq> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ceq $$0) {
      for (cge $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cge $$0, EnumSet<ceq.a> $$1) {
      for (ceq.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cge $$0, Map<ceq.a, cge> $$1) {
      for (ceq.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      brb $$0 = bra.a();
      $$0.a("goalCleanup");

      for (cge $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cge)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cge $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ceq.a $$3 : $$2.j()) {
               cge $$4 = this.b.getOrDefault($$3, a);
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
      brb $$1 = bra.a();
      $$1.a("goalTick");

      for (cge $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cge> b() {
      return this.c;
   }

   public void a(ceq.a $$0) {
      this.d.add($$0);
   }

   public void b(ceq.a $$0) {
      this.d.remove($$0);
   }

   public void a(ceq.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
