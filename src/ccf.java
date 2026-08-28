import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

public class ccf {
   private static final cds a = new cds(Integer.MAX_VALUE, new cce() {
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
   private final Map<cce.a, cds> b = new EnumMap<>(cce.a.class);
   private final Set<cds> c = new ObjectLinkedOpenHashSet();
   private final EnumSet<cce.a> d = EnumSet.noneOf(cce.a.class);

   public void a(int $$0, cce $$1) {
      this.c.add(new cds($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cce> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cce $$0) {
      for (cds $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cds $$0, EnumSet<cce.a> $$1) {
      for (cce.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cds $$0, Map<cce.a, cds> $$1) {
      for (cce.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bos $$0 = bor.a();
      $$0.a("goalCleanup");

      for (cds $$1 : this.c) {
         if ($$1.h() && (a($$1, this.d) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cds)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cds $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.d) && a($$2, this.b) && $$2.b()) {
            for (cce.a $$3 : $$2.j()) {
               cds $$4 = this.b.getOrDefault($$3, a);
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
      bos $$1 = bor.a();
      $$1.a("goalTick");

      for (cds $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.V_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<cds> b() {
      return this.c;
   }

   public void a(cce.a $$0) {
      this.d.add($$0);
   }

   public void b(cce.a $$0) {
      this.d.remove($$0);
   }

   public void a(cce.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
