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

public class bqc {
   private static final Logger a = LogUtils.getLogger();
   private static final brp b = new brp(Integer.MAX_VALUE, new bqb() {
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
   private final Map<bqb.a, brp> c = new EnumMap<>(bqb.a.class);
   private final Set<brp> d = Sets.newLinkedHashSet();
   private final Supplier<bdp> e;
   private final EnumSet<bqb.a> f = EnumSet.noneOf(bqb.a.class);
   private int g;
   private int h = 3;

   public bqc(Supplier<bdp> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bqb $$1) {
      this.d.add(new brp($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bqb> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bqb $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(brp::h).forEach(brp::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(brp $$0, EnumSet<bqb.a> $$1) {
      for (bqb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(brp $$0, Map<bqb.a, brp> $$1) {
      for (bqb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bdp $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (brp $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bqb.a, brp>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bqb.a, brp> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (brp $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bqb.a $$5 : $$4.j()) {
               brp $$6 = this.c.getOrDefault($$5, b);
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
      bdp $$1 = this.e.get();
      $$1.a("goalTick");

      for (brp $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<brp> b() {
      return this.d;
   }

   public Stream<brp> c() {
      return this.d.stream().filter(brp::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bqb.a $$0) {
      this.f.add($$0);
   }

   public void b(bqb.a $$0) {
      this.f.remove($$0);
   }

   public void a(bqb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
