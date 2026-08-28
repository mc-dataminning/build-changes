import it.unimi.dsi.fastutil.longs.Long2LongMap;
import it.unimi.dsi.fastutil.longs.Long2LongMaps;
import it.unimi.dsi.fastutil.longs.Long2LongOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.Long2LongMap.Entry;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class exf<T> implements exe<T> {
   private static final Comparator<exd<?>> a = ($$0, $$1) -> exi.b.compare($$0.b(), $$1.b());
   private final LongPredicate b;
   private final Supplier<bni> c;
   private final Long2ObjectMap<exd<T>> d = new Long2ObjectOpenHashMap();
   private final Long2LongMap e = ac.a(new Long2LongOpenHashMap(), $$0x -> $$0x.defaultReturnValue(Long.MAX_VALUE));
   private final Queue<exd<T>> f = new PriorityQueue<>(a);
   private final Queue<exi<T>> g = new ArrayDeque<>();
   private final List<exi<T>> h = new ArrayList<>();
   private final Set<exi<?>> i = new ObjectOpenCustomHashSet(exi.c);
   private final BiConsumer<exd<T>, exi<T>> j = ($$0x, $$1x) -> {
      if ($$1x.equals($$0x.b())) {
         this.b($$1x);
      }
   };

   public exf(LongPredicate $$0, Supplier<bni> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(dbf $$0, exd<T> $$1) {
      long $$2 = $$0.a();
      this.d.put($$2, $$1);
      exi<T> $$3 = $$1.b();
      if ($$3 != null) {
         this.e.put($$2, $$3.c());
      }

      $$1.a(this.j);
   }

   public void a(dbf $$0) {
      long $$1 = $$0.a();
      exd<T> $$2 = (exd<T>)this.d.remove($$1);
      this.e.remove($$1);
      if ($$2 != null) {
         $$2.a(null);
      }
   }

   @Override
   public void a(exi<T> $$0) {
      long $$1 = dbf.a($$0.b());
      exd<T> $$2 = (exd<T>)this.d.get($$1);
      if ($$2 == null) {
         ac.b(new IllegalStateException("Trying to schedule tick in not loaded position " + $$0.b()));
      } else {
         $$2.a($$0);
      }
   }

   public void a(long $$0, int $$1, BiConsumer<iz, T> $$2) {
      bni $$3 = this.c.get();
      $$3.a("collect");
      this.a($$0, $$1, $$3);
      $$3.b("run");
      $$3.a("ticksToRun", this.g.size());
      this.a($$2);
      $$3.b("cleanup");
      this.c();
      $$3.c();
   }

   private void a(long $$0, int $$1, bni $$2) {
      this.a($$0);
      $$2.a("containersToTick", this.f.size());
      this.a($$0, $$1);
      this.b();
   }

   private void a(long $$0) {
      ObjectIterator<Entry> $$1 = Long2LongMaps.fastIterator(this.e);

      while ($$1.hasNext()) {
         Entry $$2 = (Entry)$$1.next();
         long $$3 = $$2.getLongKey();
         long $$4 = $$2.getLongValue();
         if ($$4 <= $$0) {
            exd<T> $$5 = (exd<T>)this.d.get($$3);
            if ($$5 == null) {
               $$1.remove();
            } else {
               exi<T> $$6 = $$5.b();
               if ($$6 == null) {
                  $$1.remove();
               } else if ($$6.c() > $$0) {
                  $$2.setValue($$6.c());
               } else if (this.b.test($$3)) {
                  $$1.remove();
                  this.f.add($$5);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1) {
      exd<T> $$2;
      while (this.a($$1) && ($$2 = this.f.poll()) != null) {
         exi<T> $$3 = $$2.c();
         this.c($$3);
         this.a(this.f, $$2, $$0, $$1);
         exi<T> $$4 = $$2.b();
         if ($$4 != null) {
            if ($$4.c() <= $$0 && this.a($$1)) {
               this.f.add($$2);
            } else {
               this.b($$4);
            }
         }
      }
   }

   private void b() {
      for (exd<T> $$0 : this.f) {
         this.b($$0.b());
      }
   }

   private void b(exi<T> $$0) {
      this.e.put(dbf.a($$0.b()), $$0.c());
   }

   private void a(Queue<exd<T>> $$0, exd<T> $$1, long $$2, int $$3) {
      if (this.a($$3)) {
         exd<T> $$4 = $$0.peek();
         exi<T> $$5 = $$4 != null ? $$4.b() : null;

         while (this.a($$3)) {
            exi<T> $$6 = $$1.b();
            if ($$6 == null || $$6.c() > $$2 || $$5 != null && exi.b.compare($$6, $$5) > 0) {
               break;
            }

            $$1.c();
            this.c($$6);
         }
      }
   }

   private void c(exi<T> $$0) {
      this.g.add($$0);
   }

   private boolean a(int $$0) {
      return this.g.size() < $$0;
   }

   private void a(BiConsumer<iz, T> $$0) {
      while (!this.g.isEmpty()) {
         exi<T> $$1 = this.g.poll();
         if (!this.i.isEmpty()) {
            this.i.remove($$1);
         }

         this.h.add($$1);
         $$0.accept($$1.b(), $$1.a());
      }
   }

   private void c() {
      this.g.clear();
      this.f.clear();
      this.h.clear();
      this.i.clear();
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      exd<T> $$2 = (exd<T>)this.d.get(dbf.a($$0));
      return $$2 != null && $$2.a($$0, $$1);
   }

   @Override
   public boolean b(iz $$0, T $$1) {
      this.d();
      return this.i.contains(exi.a($$1, $$0));
   }

   private void d() {
      if (this.i.isEmpty() && !this.g.isEmpty()) {
         this.i.addAll(this.g);
      }
   }

   private void a(eic $$0, exf.a<T> $$1) {
      int $$2 = kb.a((double)$$0.h());
      int $$3 = kb.a((double)$$0.j());
      int $$4 = kb.a((double)$$0.k());
      int $$5 = kb.a((double)$$0.m());

      for (int $$6 = $$2; $$6 <= $$4; $$6++) {
         for (int $$7 = $$3; $$7 <= $$5; $$7++) {
            long $$8 = dbf.c($$6, $$7);
            exd<T> $$9 = (exd<T>)this.d.get($$8);
            if ($$9 != null) {
               $$1.accept($$8, $$9);
            }
         }
      }
   }

   public void a(eic $$0) {
      Predicate<exi<T>> $$1 = $$1x -> $$0.b($$1x.b());
      this.a($$0, ($$1x, $$2) -> {
         exi<T> $$3 = $$2.b();
         $$2.a($$1);
         exi<T> $$4 = $$2.b();
         if ($$4 != $$3) {
            if ($$4 != null) {
               this.b($$4);
            } else {
               this.e.remove($$1x);
            }
         }
      });
      this.h.removeIf($$1);
      this.g.removeIf($$1);
   }

   public void a(eic $$0, kd $$1) {
      this.a(this, $$0, $$1);
   }

   public void a(exf<T> $$0, eic $$1, kd $$2) {
      List<exi<T>> $$3 = new ArrayList<>();
      Predicate<exi<T>> $$4 = $$1x -> $$1.b($$1x.b());
      $$0.h.stream().filter($$4).forEach($$3::add);
      $$0.g.stream().filter($$4).forEach($$3::add);
      $$0.a($$1, ($$2x, $$3x) -> $$3x.d().filter($$4).forEach($$3::add));
      LongSummaryStatistics $$5 = $$3.stream().mapToLong(exi::e).summaryStatistics();
      long $$6 = $$5.getMin();
      long $$7 = $$5.getMax();
      $$3.forEach($$3x -> this.a(new exi<>((T)$$3x.a(), $$3x.b().a($$2), $$3x.c(), $$3x.d(), $$3x.e() - $$6 + $$7 + 1L)));
   }

   @Override
   public int a() {
      return this.d.values().stream().mapToInt(exk::a).sum();
   }

   @FunctionalInterface
   interface a<T> {
      void accept(long var1, exd<T> var3);
   }
}
