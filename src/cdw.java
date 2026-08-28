import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cdw {
   private static final cfj a = new cfj(Integer.MAX_VALUE, new cdv() {
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
   private final Map<cdv.a, cfj> b = new EnumMap<>(cdv.a.class);
   private final Set<cfj> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cdv.a> d = EnumSet.noneOf(cdv.a.class);

   public void a(int $$0, cdv $$1) {
      this.c.add(new cfj($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cdv> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cdv $$0) {
      for (cfj $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cfj $$0, EnumSet<cdv.a> $$1) {
      for (cdv.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cfj $$0, Map<cdv.a, cfj> $$1) {
      for (cdv.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bqj $$0 = bqi.a();
      $$0.a("goalCleanup");

      for (cfj $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cfj)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cfj $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cdv.a $$3 : $$2.j()) {
               cfj $$4 = this.b.getOrDefault($$3, a);
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
      bqj $$1 = bqi.a();
      $$1.a("goalTick");

      for (cfj $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cfj> b() {
      return this.c;
   }

   public void a(cdv.a $$0) {
      this.d.add($$0);
   }

   public void b(cdv.a $$0) {
      this.d.remove($$0);
   }

   public void a(cdv.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
