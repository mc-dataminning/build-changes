import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class cfc {
   private static final cgp a = new cgp(Integer.MAX_VALUE, new cfb() {
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
   private final Map<cfb.a, cgp> b = new EnumMap<>(cfb.a.class);
   private final Set<cgp> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cfb.a> d = EnumSet.noneOf(cfb.a.class);

   public void a(int $$0, cfb $$1) {
      this.c.add(new cgp($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cfb> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cfb $$0) {
      for (cgp $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cgp $$0, EnumSet<cfb.a> $$1) {
      for (cfb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cgp $$0, Map<cfb.a, cgp> $$1) {
      for (cfb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      brm $$0 = brl.a();
      $$0.a("goalCleanup");

      for (cgp $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cgp)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cgp $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cfb.a $$3 : $$2.j()) {
               cgp $$4 = this.b.getOrDefault($$3, a);
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
      brm $$1 = brl.a();
      $$1.a("goalTick");

      for (cgp $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.W_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cgp> b() {
      return this.c;
   }

   public void a(cfb.a $$0) {
      this.d.add($$0);
   }

   public void b(cfb.a $$0) {
      this.d.remove($$0);
   }

   public void a(cfb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
