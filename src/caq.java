import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class caq {
   private static final ccd a = new ccd(Integer.MAX_VALUE, new cap() {
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
   private final Map<cap.a, ccd> b = new EnumMap<>(cap.a.class);
   private final Set<ccd> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bnk> d;
   private final EnumSet<cap.a> e = EnumSet.noneOf(cap.a.class);

   public caq(Supplier<bnk> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cap $$1) {
      this.c.add(new ccd($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cap> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cap $$0) {
      for (ccd $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(ccd $$0, EnumSet<cap.a> $$1) {
      for (cap.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(ccd $$0, Map<cap.a, ccd> $$1) {
      for (cap.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bnk $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (ccd $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((ccd)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (ccd $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (cap.a $$3 : $$2.j()) {
               ccd $$4 = this.b.getOrDefault($$3, a);
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
      bnk $$1 = this.d.get();
      $$1.a("goalTick");

      for (ccd $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<ccd> b() {
      return this.c;
   }

   public void a(cap.a $$0) {
      this.e.add($$0);
   }

   public void b(cap.a $$0) {
      this.e.remove($$0);
   }

   public void a(cap.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
