import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class bzp {
   private static final cbc a = new cbc(Integer.MAX_VALUE, new bzo() {
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
   private final Map<bzo.a, cbc> b = new EnumMap<>(bzo.a.class);
   private final Set<cbc> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bmk> d;
   private final EnumSet<bzo.a> e = EnumSet.noneOf(bzo.a.class);

   public bzp(Supplier<bmk> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, bzo $$1) {
      this.c.add(new cbc($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bzo> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bzo $$0) {
      for (cbc $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cbc $$0, EnumSet<bzo.a> $$1) {
      for (bzo.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cbc $$0, Map<bzo.a, cbc> $$1) {
      for (bzo.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bmk $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cbc $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cbc)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cbc $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (bzo.a $$3 : $$2.j()) {
               cbc $$4 = this.b.getOrDefault($$3, a);
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
      bmk $$1 = this.d.get();
      $$1.a("goalTick");

      for (cbc $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<cbc> b() {
      return this.c;
   }

   public void a(bzo.a $$0) {
      this.e.add($$0);
   }

   public void b(bzo.a $$0) {
      this.e.remove($$0);
   }

   public void a(bzo.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
