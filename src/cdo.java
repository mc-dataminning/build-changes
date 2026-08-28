import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cdo {
   private static final cfb a = new cfb(Integer.MAX_VALUE, new cdn() {
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
   private final Map<cdn.a, cfb> b = new EnumMap<>(cdn.a.class);
   private final Set<cfb> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cdn.a> d = EnumSet.noneOf(cdn.a.class);

   public void a(int $$0, cdn $$1) {
      this.c.add(new cfb($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cdn> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cdn $$0) {
      for (cfb $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cfb $$0, EnumSet<cdn.a> $$1) {
      for (cdn.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cfb $$0, Map<cdn.a, cfb> $$1) {
      for (cdn.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bqb $$0 = bqa.a();
      $$0.a("goalCleanup");

      for (cfb $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cfb)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cfb $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cdn.a $$3 : $$2.j()) {
               cfb $$4 = this.b.getOrDefault($$3, a);
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
      bqb $$1 = bqa.a();
      $$1.a("goalTick");

      for (cfb $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cfb> b() {
      return this.c;
   }

   public void a(cdn.a $$0) {
      this.d.add($$0);
   }

   public void b(cdn.a $$0) {
      this.d.remove($$0);
   }

   public void a(cdn.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
