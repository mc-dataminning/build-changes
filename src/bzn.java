import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bzn {
   private static final cba a = new cba(Integer.MAX_VALUE, new bzm() {
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
   private final Map<bzm.a, cba> b = new EnumMap<>(bzm.a.class);
   private final Set<cba> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bmi> d;
   private final EnumSet<bzm.a> e = EnumSet.noneOf(bzm.a.class);

   public bzn(Supplier<bmi> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, bzm $$1) {
      this.c.add(new cba($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bzm> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bzm $$0) {
      for (cba $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cba $$0, EnumSet<bzm.a> $$1) {
      for (bzm.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cba $$0, Map<bzm.a, cba> $$1) {
      for (bzm.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bmi $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cba $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cba)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cba $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (bzm.a $$3 : $$2.j()) {
               cba $$4 = this.b.getOrDefault($$3, a);
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
      bmi $$1 = this.d.get();
      $$1.a("goalTick");

      for (cba $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<cba> b() {
      return this.c;
   }

   public void a(bzm.a $$0) {
      this.e.add($$0);
   }

   public void b(bzm.a $$0) {
      this.e.remove($$0);
   }

   public void a(bzm.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
