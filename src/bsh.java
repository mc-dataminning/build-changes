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

public class bsh {
   private static final Logger a = LogUtils.getLogger();
   private static final btu b = new btu(Integer.MAX_VALUE, new bsg() {
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
   private final Map<bsg.a, btu> c = new EnumMap<>(bsg.a.class);
   private final Set<btu> d = Sets.newLinkedHashSet();
   private final Supplier<bfs> e;
   private final EnumSet<bsg.a> f = EnumSet.noneOf(bsg.a.class);
   private int g;
   private int h = 3;

   public bsh(Supplier<bfs> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bsg $$1) {
      this.d.add(new btu($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bsg> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bsg $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(btu::h).forEach(btu::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(btu $$0, EnumSet<bsg.a> $$1) {
      for (bsg.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(btu $$0, Map<bsg.a, btu> $$1) {
      for (bsg.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bfs $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (btu $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bsg.a, btu>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bsg.a, btu> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (btu $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bsg.a $$5 : $$4.j()) {
               btu $$6 = this.c.getOrDefault($$5, b);
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
      bfs $$1 = this.e.get();
      $$1.a("goalTick");

      for (btu $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<btu> b() {
      return this.d;
   }

   public Stream<btu> c() {
      return this.d.stream().filter(btu::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bsg.a $$0) {
      this.f.add($$0);
   }

   public void b(bsg.a $$0) {
      this.f.remove($$0);
   }

   public void a(bsg.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
