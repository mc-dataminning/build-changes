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

public class bru {
   private static final Logger a = LogUtils.getLogger();
   private static final bth b = new bth(Integer.MAX_VALUE, new brt() {
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
   private final Map<brt.a, bth> c = new EnumMap<>(brt.a.class);
   private final Set<bth> d = Sets.newLinkedHashSet();
   private final Supplier<bfh> e;
   private final EnumSet<brt.a> f = EnumSet.noneOf(brt.a.class);
   private int g;
   private int h = 3;

   public bru(Supplier<bfh> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, brt $$1) {
      this.d.add(new bth($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<brt> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(brt $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(bth::h).forEach(bth::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(bth $$0, EnumSet<brt.a> $$1) {
      for (brt.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bth $$0, Map<brt.a, bth> $$1) {
      for (brt.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bfh $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (bth $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<brt.a, bth>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<brt.a, bth> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (bth $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (brt.a $$5 : $$4.j()) {
               bth $$6 = this.c.getOrDefault($$5, b);
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
      bfh $$1 = this.e.get();
      $$1.a("goalTick");

      for (bth $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.R_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bth> b() {
      return this.d;
   }

   public Stream<bth> c() {
      return this.d.stream().filter(bth::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(brt.a $$0) {
      this.f.add($$0);
   }

   public void b(brt.a $$0) {
      this.f.remove($$0);
   }

   public void a(brt.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
