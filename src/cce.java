import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cce {
   private static final cdr a = new cdr(Integer.MAX_VALUE, new ccd() {
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
   private final Map<ccd.a, cdr> b = new EnumMap<>(ccd.a.class);
   private final Set<cdr> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccd.a> d = EnumSet.noneOf(ccd.a.class);

   public void a(int $$0, ccd $$1) {
      this.c.add(new cdr($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccd> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccd $$0) {
      for (cdr $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdr $$0, EnumSet<ccd.a> $$1) {
      for (ccd.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdr $$0, Map<ccd.a, cdr> $$1) {
      for (ccd.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bor $$0 = boq.a();
      $$0.a("goalCleanup");

      for (cdr $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdr)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdr $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccd.a $$3 : $$2.j()) {
               cdr $$4 = this.b.getOrDefault($$3, a);
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

      for (cdr $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdr> b() {
      return this.c;
   }

   public void a(ccd.a $$0) {
      this.d.add($$0);
   }

   public void b(ccd.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccd.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
