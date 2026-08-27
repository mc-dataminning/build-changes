import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import com.mojang.logging.LogUtils;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class bpu {
   private static final Logger a = LogUtils.getLogger();
   private static final brh b = new brh(Integer.MAX_VALUE, new bpt() {
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
   private final Map<bpt.a, brh> c = new EnumMap<>(bpt.a.class);
   private final Set<brh> d = Sets.newLinkedHashSet();
   private final Supplier<bdh> e;
   private final EnumSet<bpt.a> f = EnumSet.noneOf(bpt.a.class);
   private int g;
   private int h = 3;

   public bpu(Supplier<bdh> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bpt $$1) {
      this.d.add(new brh($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bpt> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bpt $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(brh::h).forEach(brh::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(brh $$0, EnumSet<bpt.a> $$1) {
      for (bpt.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(brh $$0, Map<bpt.a, brh> $$1) {
      for (bpt.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bdh $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (brh $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bpt.a, brh>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bpt.a, brh> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (brh $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bpt.a $$5 : $$4.j()) {
               brh $$6 = this.c.getOrDefault($$5, b);
               $$6.d();
               this.c.put($$5, $$4);
            }

            $$4.c();
         }
      }

      $$0.c();
      this.a(true);
   }

   public void a(boolean $$0) {
      bdh $$1 = this.e.get();
      $$1.a("goalTick");

      for (brh $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.K_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<brh> b() {
      return this.d;
   }

   public Stream<brh> c() {
      return this.d.stream().filter(brh::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bpt.a $$0) {
      this.f.add($$0);
   }

   public void b(bpt.a $$0) {
      this.f.remove($$0);
   }

   public void a(bpt.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
