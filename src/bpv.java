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

public class bpv {
   private static final Logger a = LogUtils.getLogger();
   private static final bri b = new bri(Integer.MAX_VALUE, new bpu() {
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
   private final Map<bpu.a, bri> c = new EnumMap<>(bpu.a.class);
   private final Set<bri> d = Sets.newLinkedHashSet();
   private final Supplier<bdh> e;
   private final EnumSet<bpu.a> f = EnumSet.noneOf(bpu.a.class);
   private int g;
   private int h = 3;

   public bpv(Supplier<bdh> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bpu $$1) {
      this.d.add(new bri($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bpu> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bpu $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(bri::h).forEach(bri::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(bri $$0, EnumSet<bpu.a> $$1) {
      for (bpu.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bri $$0, Map<bpu.a, bri> $$1) {
      for (bpu.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bdh $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (bri $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bpu.a, bri>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bpu.a, bri> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (bri $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bpu.a $$5 : $$4.j()) {
               bri $$6 = this.c.getOrDefault($$5, b);
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

      for (bri $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.K_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bri> b() {
      return this.d;
   }

   public Stream<bri> c() {
      return this.d.stream().filter(bri::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bpu.a $$0) {
      this.f.add($$0);
   }

   public void b(bpu.a $$0) {
      this.f.remove($$0);
   }

   public void a(bpu.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
