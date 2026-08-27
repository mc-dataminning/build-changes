import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class byy {
   private static final cal a = new cal(Integer.MAX_VALUE, new byx() {
      @Override
      public boolean a() {
         return false;
      }
   }) {
      @Override
      public boolean h() {
         return false;
      }
   };
   private final Map<byx.a, cal> b = new EnumMap<>(byx.a.class);
   private final Set<cal> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bma> d;
   private final EnumSet<byx.a> e = EnumSet.noneOf(byx.a.class);

   public byy(Supplier<bma> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, byx $$1) {
      this.c.add(new cal($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<byx> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(byx $$0) {
      for (cal $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cal $$0, EnumSet<byx.a> $$1) {
      for (byx.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cal $$0, Map<byx.a, cal> $$1) {
      for (byx.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bma $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cal $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cal)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cal $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (byx.a $$3 : $$2.j()) {
               cal $$4 = this.b.getOrDefault($$3, a);
               $$4.d();
               this.b.put($$3, $$2);
            }

            $$2.c();
         }
      }

      $$0.c();
      this.a(true);
   }

   public void a(boolean $$0) {
      bma $$1 = this.d.get();
      $$1.a("goalTick");

      for (cal $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<cal> b() {
      return this.c;
   }

   public void a(byx.a $$0) {
      this.e.add($$0);
   }

   public void b(byx.a $$0) {
      this.e.remove($$0);
   }

   public void a(byx.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
