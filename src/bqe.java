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

public class bqe {
   private static final Logger a = LogUtils.getLogger();
   private static final brr b = new brr(Integer.MAX_VALUE, new bqd() {
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
   private final Map<bqd.a, brr> c = new EnumMap<>(bqd.a.class);
   private final Set<brr> d = Sets.newLinkedHashSet();
   private final Supplier<bdr> e;
   private final EnumSet<bqd.a> f = EnumSet.noneOf(bqd.a.class);
   private int g;
   private int h = 3;

   public bqe(Supplier<bdr> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bqd $$1) {
      this.d.add(new brr($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bqd> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bqd $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(brr::h).forEach(brr::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(brr $$0, EnumSet<bqd.a> $$1) {
      for (bqd.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(brr $$0, Map<bqd.a, brr> $$1) {
      for (bqd.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bdr $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (brr $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bqd.a, brr>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bqd.a, brr> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (brr $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bqd.a $$5 : $$4.j()) {
               brr $$6 = this.c.getOrDefault($$5, b);
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
      bdr $$1 = this.e.get();
      $$1.a("goalTick");

      for (brr $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.Q_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<brr> b() {
      return this.d;
   }

   public Stream<brr> c() {
      return this.d.stream().filter(brr::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bqd.a $$0) {
      this.f.add($$0);
   }

   public void b(bqd.a $$0) {
      this.f.remove($$0);
   }

   public void a(bqd.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
