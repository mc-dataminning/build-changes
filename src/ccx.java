import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ccx {
   private static final cek a = new cek(Integer.MAX_VALUE, new ccw() {
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
   private final Map<ccw.a, cek> b = new EnumMap<>(ccw.a.class);
   private final Set<cek> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<ccw.a> d = EnumSet.noneOf(ccw.a.class);

   public void a(int $$0, ccw $$1) {
      this.c.add(new cek($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<ccw> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(ccw $$0) {
      for (cek $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cek $$0, EnumSet<ccw.a> $$1) {
      for (ccw.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cek $$0, Map<ccw.a, cek> $$1) {
      for (ccw.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bpj $$0 = bpi.a();
      $$0.a("goalCleanup");

      for (cek $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cek)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cek $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (ccw.a $$3 : $$2.j()) {
               cek $$4 = this.b.getOrDefault($$3, a);
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
      bpj $$1 = bpi.a();
      $$1.a("goalTick");

      for (cek $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cek> b() {
      return this.c;
   }

   public void a(ccw.a $$0) {
      this.d.add($$0);
   }

   public void b(ccw.a $$0) {
      this.d.remove($$0);
   }

   public void a(ccw.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
