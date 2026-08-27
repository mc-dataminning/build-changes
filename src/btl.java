import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class btl {
   private static final buy a = new buy(Integer.MAX_VALUE, new btk() {
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
   private final Map<btk.a, buy> b = new EnumMap<>(btk.a.class);
   private final Set<buy> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bgt> d;
   private final EnumSet<btk.a> e = EnumSet.noneOf(btk.a.class);

   public btl(Supplier<bgt> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, btk $$1) {
      this.c.add(new buy($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<btk> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(btk $$0) {
      for (buy $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(buy $$0, EnumSet<btk.a> $$1) {
      for (btk.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(buy $$0, Map<btk.a, buy> $$1) {
      for (btk.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bgt $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (buy $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((buy)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (buy $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (btk.a $$3 : $$2.j()) {
               buy $$4 = this.b.getOrDefault($$3, a);
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
      bgt $$1 = this.d.get();
      $$1.a("goalTick");

      for (buy $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<buy> b() {
      return this.c;
   }

   public void a(btk.a $$0) {
      this.e.add($$0);
   }

   public void b(btk.a $$0) {
      this.e.remove($$0);
   }

   public void a(btk.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
