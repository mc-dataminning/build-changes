import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cam {
   private static final cbz a = new cbz(Integer.MAX_VALUE, new cal() {
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
   private final Map<cal.a, cbz> b = new EnumMap<>(cal.a.class);
   private final Set<cbz> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bng> d;
   private final EnumSet<cal.a> e = EnumSet.noneOf(cal.a.class);

   public cam(Supplier<bng> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cal $$1) {
      this.c.add(new cbz($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cal> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cal $$0) {
      for (cbz $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.d();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(cbz $$0, EnumSet<cal.a> $$1) {
      for (cal.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(cbz $$0, Map<cal.a, cbz> $$1) {
      for (cal.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bng $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (cbz $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.b())) {
            $$1.d();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((cbz)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (cbz $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.a()) {
            for (cal.a $$3 : $$2.j()) {
               cbz $$4 = this.b.getOrDefault($$3, a);
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
      bng $$1 = this.d.get();
      $$1.a("goalTick");

      for (cbz $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<cbz> b() {
      return this.c;
   }

   public void a(cal.a $$0) {
      this.e.add($$0);
   }

   public void b(cal.a $$0) {
      this.e.remove($$0);
   }

   public void a(cal.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
