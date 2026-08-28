import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cet {
   private static final cgg a = new cgg(Integer.MAX_VALUE, new ces() {
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
   private final Map<ces.a, cgg> b = new EnumMap<>(ces.a.class);
   private final Set<cgg> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ces.a> d = EnumSet.noneOf(ces.a.class);

   public void a(int $$0, ces $$1) {
      this.c.add(new cgg($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ces> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ces $$0) {
      for (cgg $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cgg $$0, EnumSet<ces.a> $$1) {
      for (ces.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cgg $$0, Map<ces.a, cgg> $$1) {
      for (ces.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      brd $$0 = brc.a();
      $$0.a("goalCleanup");

      for (cgg $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cgg)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cgg $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ces.a $$3 : $$2.j()) {
               cgg $$4 = this.b.getOrDefault($$3, a);
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
      brd $$1 = brc.a();
      $$1.a("goalTick");

      for (cgg $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cgg> b() {
      return this.c;
   }

   public void a(ces.a $$0) {
      this.d.add($$0);
   }

   public void b(ces.a $$0) {
      this.d.remove($$0);
   }

   public void a(ces.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
