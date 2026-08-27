import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bvc {
   private static final bwp a = new bwp(Integer.MAX_VALUE, new bvb() {
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
   private final Map<bvb.a, bwp> b = new EnumMap<>(bvb.a.class);
   private final Set<bwp> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bil> d;
   private final EnumSet<bvb.a> e = EnumSet.noneOf(bvb.a.class);

   public bvc(Supplier<bil> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, bvb $$1) {
      this.c.add(new bwp($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bvb> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bvb $$0) {
      for (bwp $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(bwp $$0, EnumSet<bvb.a> $$1) {
      for (bvb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bwp $$0, Map<bvb.a, bwp> $$1) {
      for (bvb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bil $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (bwp $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((bwp)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (bwp $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (bvb.a $$3 : $$2.j()) {
               bwp $$4 = this.b.getOrDefault($$3, a);
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
      bil $$1 = this.d.get();
      $$1.a("goalTick");

      for (bwp $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bwp> b() {
      return this.c;
   }

   public void a(bvb.a $$0) {
      this.e.add($$0);
   }

   public void b(bvb.a $$0) {
      this.e.remove($$0);
   }

   public void a(bvb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
