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

public class btc {
   private static final Logger a = LogUtils.getLogger();
   private static final bup b = new bup(Integer.MAX_VALUE, new btb() {
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
   private final Map<btb.a, bup> c = new EnumMap<>(btb.a.class);
   private final Set<bup> d = Sets.newLinkedHashSet();
   private final Supplier<bgm> e;
   private final EnumSet<btb.a> f = EnumSet.noneOf(btb.a.class);
   private int g;
   private int h = 3;

   public btc(Supplier<bgm> $$0) {
      this.e = $$0;
   }

   public void a(int $$0, btb $$1) {
      this.d.add(new bup($$0, $$1));
   }

   @VisibleForTesting
   public void a(Predicate<btb> $$0) {
      this.d.removeIf($$1 -> $$0.test($$1.k()));
   }

   public void a(btb $$0) {
      this.d.stream().filter($$1 -> $$1.k() == $$0).filter(bup::h).forEach(bup::d);
      this.d.removeIf($$1 -> $$1.k() == $$0);
   }

   private static boolean a(bup $$0, EnumSet<btb.a> $$1) {
      for (btb.a $$2 : $$0.j()) {
         if ($$1.contains($$2)) {
            return true;
         }
      }

      return false;
   }

   private static boolean a(bup $$0, Map<btb.a, bup> $$1) {
      for (btb.a $$2 : $$0.j()) {
         if (!$$1.getOrDefault($$2, b).a($$0)) {
            return false;
         }
      }

      return true;
   }

   public void a() {
      bgm $$0 = this.e.get();
      $$0.a("goalCleanup");

      for (bup $$1 : this.d) {
         if ($$1.h() && (a($$1, this.f) || !$$1.b())) {
            $$1.d();
         }
      }

      Iterator<Entry<btb.a, bup>> $$2 = this.c.entrySet().iterator();

      while ($$2.hasNext()) {
         Entry<btb.a, bup> $$3 = $$2.next();
         if (!$$3.getValue().h()) {
            $$2.remove();
         }
      }

      $$0.c();
      $$0.a("goalUpdate");

      for (bup $$4 : this.d) {
         if (!$$4.h() && !a($$4, this.f) && a($$4, this.c) && $$4.a()) {
            for (btb.a $$5 : $$4.j()) {
               bup $$6 = this.c.getOrDefault($$5, b);
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
      bgm $$1 = this.e.get();
      $$1.a("goalTick");

      for (bup $$2 : this.d) {
         if ($$2.h() && ($$0 || $$2.T_())) {
            $$2.e();
         }
      }

      $$1.c();
   }

   public Set<bup> b() {
      return this.d;
   }

   public Stream<bup> c() {
      return this.d.stream().filter(bup::h);
   }

   public void a(int $$0) {
      this.h = $$0;
   }

   public void a(btb.a $$0) {
      this.f.add($$0);
   }

   public void b(btb.a $$0) {
      this.f.remove($$0);
   }

   public void a(btb.a $$0, boolean $$1) {
      if ($$1) {
         this.b($$0);
      } else {
         this.a($$0);
      }
   }
}
