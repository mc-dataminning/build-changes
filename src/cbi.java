import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cbi {
   private static final ccv a = new ccv(Integer.MAX_VALUE, new cbh() {
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
   private final Map<cbh.a, ccv> b = new EnumMap<>(cbh.a.class);
   private final Set<ccv> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bod> d;
   private final EnumSet<cbh.a> e = EnumSet.noneOf(cbh.a.class);

   public cbi(Supplier<bod> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cbh $$1) {
      this.c.add(new ccv($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cbh> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cbh $$0) {
      for (ccv $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(ccv $$0, EnumSet<cbh.a> $$1) {
      for (cbh.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(ccv $$0, Map<cbh.a, ccv> $$1) {
      for (cbh.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bod $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (ccv $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((ccv)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (ccv $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.b()) {
            for (cbh.a $$3 : $$2.j()) {
               ccv $$4 = this.b.getOrDefault($$3, a);
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
      bod $$1 = this.d.get();
      $$1.a("goalTick");

      for (ccv $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<ccv> b() {
      return this.c;
   }

   public void a(cbh.a $$0) {
      this.e.add($$0);
   }

   public void b(cbh.a $$0) {
      this.e.remove($$0);
   }

   public void a(cbh.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
