import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cbu {
   private static final cdh a = new cdh(Integer.MAX_VALUE, new cbt() {
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
   private final Map<cbt.a, cdh> b = new EnumMap<>(cbt.a.class);
   private final Set<cdh> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bok> d;
   private final EnumSet<cbt.a> e = EnumSet.noneOf(cbt.a.class);

   public cbu(Supplier<bok> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cbt $$1) {
      this.c.add(new cdh($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cbt> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cbt $$0) {
      for (cdh $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cdh $$0, EnumSet<cbt.a> $$1) {
      for (cbt.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cdh $$0, Map<cbt.a, cdh> $$1) {
      for (cbt.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bok $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cdh $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cdh)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cdh $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.b()) {
            for (cbt.a $$3 : $$2.j()) {
               cdh $$4 = this.b.getOrDefault($$3, a);
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
      bok $$1 = this.d.get();
      $$1.a("goalTick");

      for (cdh $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cdh> b() {
      return this.c;
   }

   public void a(cbt.a $$0) {
      this.e.add($$0);
   }

   public void b(cbt.a $$0) {
      this.e.remove($$0);
   }

   public void a(cbt.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
