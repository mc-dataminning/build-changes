import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ccg {
   private static final cdt a = new cdt(Integer.MAX_VALUE, new ccf() {
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
   private final Map<ccf.a, cdt> b = new EnumMap<>(ccf.a.class);
   private final Set<cdt> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccf.a> d = EnumSet.noneOf(ccf.a.class);

   public void a(int $$0, ccf $$1) {
      this.c.add(new cdt($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccf> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccf $$0) {
      for (cdt $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdt $$0, EnumSet<ccf.a> $$1) {
      for (ccf.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdt $$0, Map<ccf.a, cdt> $$1) {
      for (ccf.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bot $$0 = bos.a();
      $$0.a("goalCleanup");

      for (cdt $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdt)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdt $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccf.a $$3 : $$2.j()) {
               cdt $$4 = this.b.getOrDefault($$3, a);
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
      bot $$1 = bos.a();
      $$1.a("goalTick");

      for (cdt $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdt> b() {
      return this.c;
   }

   public void a(ccf.a $$0) {
      this.d.add($$0);
   }

   public void b(ccf.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccf.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
