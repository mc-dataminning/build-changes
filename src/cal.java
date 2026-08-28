import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cal {
   private static final cby a = new cby(Integer.MAX_VALUE, new cak() {
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
   private final Map<cak.a, cby> b = new EnumMap<>(cak.a.class);
   private final Set<cby> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bne> d;
   private final EnumSet<cak.a> e = EnumSet.noneOf(cak.a.class);

   public cal(Supplier<bne> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cak $$1) {
      this.c.add(new cby($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cak> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cak $$0) {
      for (cby $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cby $$0, EnumSet<cak.a> $$1) {
      for (cak.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cby $$0, Map<cak.a, cby> $$1) {
      for (cak.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bne $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cby $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cby)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cby $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.b()) {
            for (cak.a $$3 : $$2.j()) {
               cby $$4 = this.b.getOrDefault($$3, a);
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
      bne $$1 = this.d.get();
      $$1.a("goalTick");

      for (cby $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cby> b() {
      return this.c;
   }

   public void a(cak.a $$0) {
      this.e.add($$0);
   }

   public void b(cak.a $$0) {
      this.e.remove($$0);
   }

   public void a(cak.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
