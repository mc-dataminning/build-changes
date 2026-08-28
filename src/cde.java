import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cde {
   private static final cer a = new cer(Integer.MAX_VALUE, new cdd() {
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
   private final Map<cdd.a, cer> b = new EnumMap<>(cdd.a.class);
   private final Set<cer> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cdd.a> d = EnumSet.noneOf(cdd.a.class);

   public void a(int $$0, cdd $$1) {
      this.c.add(new cer($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cdd> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cdd $$0) {
      for (cer $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cer $$0, EnumSet<cdd.a> $$1) {
      for (cdd.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cer $$0, Map<cdd.a, cer> $$1) {
      for (cdd.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bps $$0 = bpr.a();
      $$0.a("goalCleanup");

      for (cer $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cer)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cer $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cdd.a $$3 : $$2.j()) {
               cer $$4 = this.b.getOrDefault($$3, a);
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
      bps $$1 = bpr.a();
      $$1.a("goalTick");

      for (cer $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cer> b() {
      return this.c;
   }

   public void a(cdd.a $$0) {
      this.d.add($$0);
   }

   public void b(cdd.a $$0) {
      this.d.remove($$0);
   }

   public void a(cdd.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
