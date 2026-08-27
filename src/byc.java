import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class byc {
   private static final bzp a = new bzp(Integer.MAX_VALUE, new byb() {
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
   private final Map<byb.a, bzp> b = new EnumMap<>(byb.a.class);
   private final Set<bzp> c = new ObjectLinkedOpenHashSet();
   private final Supplier<ble> d;
   private final EnumSet<byb.a> e = EnumSet.noneOf(byb.a.class);

   public byc(Supplier<ble> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, byb $$1) {
      this.c.add(new bzp($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<byb> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(byb $$0) {
      for (bzp $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(bzp $$0, EnumSet<byb.a> $$1) {
      for (byb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bzp $$0, Map<byb.a, bzp> $$1) {
      for (byb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      ble $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (bzp $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((bzp)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (bzp $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (byb.a $$3 : $$2.j()) {
               bzp $$4 = this.b.getOrDefault($$3, a);
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
      ble $$1 = this.d.get();
      $$1.a("goalTick");

      for (bzp $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bzp> b() {
      return this.c;
   }

   public void a(byb.a $$0) {
      this.e.add($$0);
   }

   public void b(byb.a $$0) {
      this.e.remove($$0);
   }

   public void a(byb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
