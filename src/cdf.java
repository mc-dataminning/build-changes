import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cdf {
   private static final ces a = new ces(Integer.MAX_VALUE, new cde() {
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
   private final Map<cde.a, ces> b = new EnumMap<>(cde.a.class);
   private final Set<ces> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cde.a> d = EnumSet.noneOf(cde.a.class);

   public void a(int $$0, cde $$1) {
      this.c.add(new ces($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cde> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cde $$0) {
      for (ces $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(ces $$0, EnumSet<cde.a> $$1) {
      for (cde.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(ces $$0, Map<cde.a, ces> $$1) {
      for (cde.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bpt $$0 = bps.a();
      $$0.a("goalCleanup");

      for (ces $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((ces)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (ces $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cde.a $$3 : $$2.j()) {
               ces $$4 = this.b.getOrDefault($$3, a);
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
      bpt $$1 = bps.a();
      $$1.a("goalTick");

      for (ces $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<ces> b() {
      return this.c;
   }

   public void a(cde.a $$0) {
      this.d.add($$0);
   }

   public void b(cde.a $$0) {
      this.d.remove($$0);
   }

   public void a(cde.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
