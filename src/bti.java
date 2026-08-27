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

public class bti {
   private static final Logger a = LogUtils.getLogger();
   private static final buv b = new buv(Integer.MAX_VALUE, new bth() {
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
   private final Map<bth.a, buv> c = new EnumMap<>(bth.a.class);
   private final Set<buv> d = Sets.newLinkedHashSet();
   private final Supplier<bgs> e;
   private final EnumSet<bth.a> f = EnumSet.noneOf(bth.a.class);
   private int g;
   private int h = 3;

   public bti(Supplier<bgs> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bth $$1) {
      this.d.add(new buv($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bth> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bth $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(buv::h).forEach(buv::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(buv $$0, EnumSet<bth.a> $$1) {
      for (bth.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(buv $$0, Map<bth.a, buv> $$1) {
      for (bth.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bgs $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (buv $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bth.a, buv>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bth.a, buv> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (buv $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bth.a $$5 : $$4.j()) {
               buv $$6 = this.c.getOrDefault($$5, b);
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
      bgs $$1 = this.e.get();
      $$1.a("goalTick");

      for (buv $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<buv> b() {
      return this.d;
   }

   public Stream<buv> c() {
      return this.d.stream().filter(buv::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bth.a $$0) {
      this.f.add($$0);
   }

   public void b(bth.a $$0) {
      this.f.remove($$0);
   }

   public void a(bth.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
