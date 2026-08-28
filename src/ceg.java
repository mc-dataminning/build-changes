import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ceg {
   private static final cft a = new cft(Integer.MAX_VALUE, new cef() {
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
   private final Map<cef.a, cft> b = new EnumMap<>(cef.a.class);
   private final Set<cft> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cef.a> d = EnumSet.noneOf(cef.a.class);

   public void a(int $$0, cef $$1) {
      this.c.add(new cft($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cef> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cef $$0) {
      for (cft $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cft $$0, EnumSet<cef.a> $$1) {
      for (cef.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cft $$0, Map<cef.a, cft> $$1) {
      for (cef.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bqq $$0 = bqp.a();
      $$0.a("goalCleanup");

      for (cft $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cft)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cft $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cef.a $$3 : $$2.j()) {
               cft $$4 = this.b.getOrDefault($$3, a);
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
      bqq $$1 = bqp.a();
      $$1.a("goalTick");

      for (cft $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cft> b() {
      return this.c;
   }

   public void a(cef.a $$0) {
      this.d.add($$0);
   }

   public void b(cef.a $$0) {
      this.d.remove($$0);
   }

   public void a(cef.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
