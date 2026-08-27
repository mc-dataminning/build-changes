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

public class bqi {
   private static final Logger a = LogUtils.getLogger();
   private static final brv b = new brv(Integer.MAX_VALUE, new bqh() {
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
   private final Map<bqh.a, brv> c = new EnumMap<>(bqh.a.class);
   private final Set<brv> d = Sets.newLinkedHashSet();
   private final Supplier<bdv> e;
   private final EnumSet<bqh.a> f = EnumSet.noneOf(bqh.a.class);
   private int g;
   private int h = 3;

   public bqi(Supplier<bdv> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bqh $$1) {
      this.d.add(new brv($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bqh> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bqh $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(brv::h).forEach(brv::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(brv $$0, EnumSet<bqh.a> $$1) {
      for (bqh.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(brv $$0, Map<bqh.a, brv> $$1) {
      for (bqh.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bdv $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (brv $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bqh.a, brv>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bqh.a, brv> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (brv $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bqh.a $$5 : $$4.j()) {
               brv $$6 = this.c.getOrDefault($$5, b);
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
      bdv $$1 = this.e.get();
      $$1.a("goalTick");

      for (brv $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<brv> b() {
      return this.d;
   }

   public Stream<brv> c() {
      return this.d.stream().filter(brv::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bqh.a $$0) {
      this.f.add($$0);
   }

   public void b(bqh.a $$0) {
      this.f.remove($$0);
   }

   public void a(bqh.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
