import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.objects.ObjectLinkedOpenHashSet;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class cbl {
   private static final ccy a = new ccy(Integer.MAX_VALUE, new cbk() {
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
   private final Map<cbk.a, ccy> b = new EnumMap<>(cbk.a.class);
   private final Set<ccy> c = new ObjectLinkedOpenHashSet();
   private final Supplier<bog> d;
   private final EnumSet<cbk.a> e = EnumSet.noneOf(cbk.a.class);

   public cbl(Supplier<bog> $$0) {
      this.d = $$0;
   }

   public void a(int $$0, cbk $$1) {
      this.c.add(new ccy($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<cbk> $$0) {
      this.c.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(cbk $$0) {
      for (ccy $$1 : this.c) {
         if ($$1.k() == $$0 && $$1.h()) {
            $$1.e();
         }
      }

      this.c.removeIf($$1x -> $$1x.k() == $$0);
   }

   private static boolean a(ccy $$0, EnumSet<cbk.a> $$1) {
      for (cbk.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(ccy $$0, Map<cbk.a, ccy> $$1) {
      for (cbk.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, a).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bog $$0 = this.d.get();
      $$0.a("goalCleanup");

      for (ccy $$1 : this.c) {
         if ($$1.h() && (a($$1, this.e) || !$$1.c())) {
            $$1.e();
         }
      }

      this.b.entrySet().removeIf($$0x -> !((ccy)$$0x.getValue()).h());
      $$0.c();
      $$0.a("goalUpdate");

      for (ccy $$2 : this.c) {
         if (!$$2.h() && !a($$2, this.e) && a($$2, this.b) && $$2.b()) {
            for (cbk.a $$3 : $$2.j()) {
               ccy $$4 = this.b.getOrDefault($$3, a);
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
      bog $$1 = this.d.get();
      $$1.a("goalTick");

      for (ccy $$2 : this.c) {
         if ($$2.h() && ($$0 || $$2.U_())) {
            $$2.a();
         }
      }

      $$1.c();
   }

   public Set<ccy> b() {
      return this.c;
   }

   public void a(cbk.a $$0) {
      this.e.add($$0);
   }

   public void b(cbk.a $$0) {
      this.e.remove($$0);
   }

   public void a(cbk.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
