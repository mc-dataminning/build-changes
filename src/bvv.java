import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bvv {
   private static final bxi a = new bxi(Integer.MAX_VALUE, new bvu() {
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
   private final Map<bvu.a, bxi> b = new EnumMap<>(bvu.a.class);
   private final Set<bxi> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bjc> d;
   private final EnumSet<bvu.a> e = EnumSet.noneOf(bvu.a.class);

   public bvv(Supplier<bjc> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, bvu $$1) {
      this.c.add(new bxi($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bvu> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bvu $$0) {
      for (bxi $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(bxi $$0, EnumSet<bvu.a> $$1) {
      for (bvu.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bxi $$0, Map<bvu.a, bxi> $$1) {
      for (bvu.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bjc $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (bxi $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((bxi)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (bxi $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (bvu.a $$3 : $$2.j()) {
               bxi $$4 = this.b.getOrDefault($$3, a);
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
      bjc $$1 = this.d.get();
      $$1.a("goalTick");

      for (bxi $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bxi> b() {
      return this.c;
   }

   public void a(bvu.a $$0) {
      this.e.add($$0);
   }

   public void b(bvu.a $$0) {
      this.e.remove($$0);
   }

   public void a(bvu.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
