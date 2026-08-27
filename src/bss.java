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

public class bss {
   private static final Logger a = LogUtils.getLogger();
   private static final buf b = new buf(Integer.MAX_VALUE, new bsr() {
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
   private final Map<bsr.a, buf> c = new EnumMap<>(bsr.a.class);
   private final Set<buf> d = Sets.newLinkedHashSet();
   private final Supplier<bgc> e;
   private final EnumSet<bsr.a> f = EnumSet.noneOf(bsr.a.class);
   private int g;
   private int h = 3;

   public bss(Supplier<bgc> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bsr $$1) {
      this.d.add(new buf($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bsr> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bsr $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(buf::h).forEach(buf::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(buf $$0, EnumSet<bsr.a> $$1) {
      for (bsr.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(buf $$0, Map<bsr.a, buf> $$1) {
      for (bsr.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bgc $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (buf $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bsr.a, buf>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bsr.a, buf> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (buf $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bsr.a $$5 : $$4.j()) {
               buf $$6 = this.c.getOrDefault($$5, b);
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
      bgc $$1 = this.e.get();
      $$1.a("goalTick");

      for (buf $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<buf> b() {
      return this.d;
   }

   public Stream<buf> c() {
      return this.d.stream().filter(buf::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bsr.a $$0) {
      this.f.add($$0);
   }

   public void b(bsr.a $$0) {
      this.f.remove($$0);
   }

   public void a(bsr.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
