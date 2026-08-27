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

public class bmw {
   private static final Logger a = LogUtils.getLogger();
   private static final boj b = new boj(Integer.MAX_VALUE, new bmv() {
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
   private final Map<bmv.a, boj> c = new EnumMap<>(bmv.a.class);
   private final Set<boj> d = Sets.newLinkedHashSet();
   private final Supplier<ban> e;
   private final EnumSet<bmv.a> f = EnumSet.noneOf(bmv.a.class);
   private int g;
   private int h = 3;

   public bmw(Supplier<ban> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, bmv $$1) {
      this.d.add(new boj($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<bmv> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(bmv $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(boj::h).forEach(boj::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(boj $$0, EnumSet<bmv.a> $$1) {
      for (bmv.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(boj $$0, Map<bmv.a, boj> $$1) {
      for (bmv.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      ban $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (boj $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<bmv.a, boj>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<bmv.a, boj> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (boj $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (bmv.a $$5 : $$4.j()) {
               boj $$6 = this.c.getOrDefault($$5, b);
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
      ban $$1 = this.e.get();
      $$1.a("goalTick");

      for (boj $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.K_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<boj> b() {
      return this.d;
   }

   public Stream<boj> c() {
      return this.d.stream().filter(boj::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(bmv.a $$0) {
      this.f.add($$0);
   }

   public void b(bmv.a $$0) {
      this.f.remove($$0);
   }

   public void a(bmv.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
