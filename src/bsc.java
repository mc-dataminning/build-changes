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

public class bsc {
   private static final Logger a = LogUtils.getLogger();
   private static final btp b = new btp(Integer.MAX_VALUE, new bsb() {
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
   private final Map<bsb.a, btp> c = new EnumMap<>(bsb.a.class);
   private final Set<btp> d = Sets.newLinkedHashSet();
   private final Supplier<bfo> e;
   private final EnumSet<bsb.a> f = EnumSet.noneOf(bsb.a.class);
   private int g;
   private int h = 3;

   public bsc(Supplier<bfo> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bsb $$1) {
      this.d.add(new btp($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bsb> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bsb $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(btp::h).forEach(btp::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(btp $$0, EnumSet<bsb.a> $$1) {
      for (bsb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(btp $$0, Map<bsb.a, btp> $$1) {
      for (bsb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bfo $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (btp $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bsb.a, btp>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bsb.a, btp> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (btp $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bsb.a $$5 : $$4.j()) {
               btp $$6 = this.c.getOrDefault($$5, b);
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
      bfo $$1 = this.e.get();
      $$1.a("goalTick");

      for (btp $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.S_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<btp> b() {
      return this.d;
   }

   public Stream<btp> c() {
      return this.d.stream().filter(btp::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bsb.a $$0) {
      this.f.add($$0);
   }

   public void b(bsb.a $$0) {
      this.f.remove($$0);
   }

   public void a(bsb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
