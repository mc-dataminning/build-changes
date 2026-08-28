import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cda {
   private static final cen a = new cen(Integer.MAX_VALUE, new ccz() {
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
   private final Map<ccz.a, cen> b = new EnumMap<>(ccz.a.class);
   private final Set<cen> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccz.a> d = EnumSet.noneOf(ccz.a.class);

   public void a(int $$0, ccz $$1) {
      this.c.add(new cen($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccz> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccz $$0) {
      for (cen $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cen $$0, EnumSet<ccz.a> $$1) {
      for (ccz.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cen $$0, Map<ccz.a, cen> $$1) {
      for (ccz.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bpo $$0 = bpn.a();
      $$0.a("goalCleanup");

      for (cen $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cen)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cen $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccz.a $$3 : $$2.j()) {
               cen $$4 = this.b.getOrDefault($$3, a);
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
      bpo $$1 = bpn.a();
      $$1.a("goalTick");

      for (cen $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cen> b() {
      return this.c;
   }

   public void a(ccz.a $$0) {
      this.d.add($$0);
   }

   public void b(ccz.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccz.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
