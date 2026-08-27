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

public class ewa<T> implements evz<T> {
   private static final Comparator<evy<?>> a = ($$0, $$1) -> ewd.b.compare($$0.b(), $$1.b());
   private final LongPredicate b;
   private final Supplier<bmk> c;
   private final Long2ObjectMap<evy<T>> d = new Long2ObjectOpenHashMap();
   private final Long2LongMap e = ac.a(new Long2LongOpenHashMap(), $$0x -> $$0x.defaultReturnValue(Long.MAX_VALUE));
   private final Queue<evy<T>> f = new PriorityQueue<>(a);
   private final Queue<ewd<T>> g = new ArrayDeque<>();
   private final List<ewd<T>> h = new ArrayList<>();
   private final Set<ewd<?>> i = new ObjectOpenCustomHashSet(ewd.c);
   private final BiConsumer<evy<T>, ewd<T>> j = ($$0x, $$1x) -> {
      if ($$1x.equals($$0x.b())) {
         this.b($$1x);
      }
   };

   public ewa(LongPredicate $$0, Supplier<bmk> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public void a(dag $$0, evy<T> $$1) {
      long $$2 = $$0.a();
      this.d.put($$2, $$1);
      ewd<T> $$3 = $$1.b();
      if ($$3 != null) {
         this.e.put($$2, $$3.c());
      }

      $$1.a(this.j);
   }

   public void a(dag $$0) {
      long $$1 = $$0.a();
      evy<T> $$2 = (evy<T>)this.d.remove($$1);
      this.e.remove($$1);
      if ($$2 != null) {
         $$2.a(null);
      }
   }

   @Override
   public void a(ewd<T> $$0) {
      long $$1 = dag.a($$0.b());
      evy<T> $$2 = (evy<T>)this.d.get($$1);
      if ($$2 == null) {
         ac.b(new IllegalStateException("Trying to schedule tick in not loaded position " + $$0.b()));
      } else {
         $$2.a($$0);
      }
   }

   public void a(long $$0, int $$1, BiConsumer<io, T> $$2) {
      bmk $$3 = this.c.get();
      $$3.a("collect");
      this.a($$0, $$1, $$3);
      $$3.b("run");
      $$3.a("ticksToRun", this.g.size());
      this.a($$2);
      $$3.b("cleanup");
      this.c();
      $$3.c();
   }

   private void a(long $$0, int $$1, bmk $$2) {
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
            evy<T> $$5 = (evy<T>)this.d.get($$3);
            if ($$5 == null) {
               $$1.remove();
            } else {
               ewd<T> $$6 = $$5.b();
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
      evy<T> $$2;
      while (this.a($$1) && ($$2 = this.f.poll()) != null) {
         ewd<T> $$3 = $$2.c();
         this.c($$3);
         this.a(this.f, $$2, $$0, $$1);
         ewd<T> $$4 = $$2.b();
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
      for (evy<T> $$0 : this.f) {
         this.b($$0.b());
      }
   }

   private void b(ewd<T> $$0) {
      this.e.put(dag.a($$0.b()), $$0.c());
   }

   private void a(Queue<evy<T>> $$0, evy<T> $$1, long $$2, int $$3) {
      if (this.a($$3)) {
         evy<T> $$4 = $$0.peek();
         ewd<T> $$5 = $$4 != null ? $$4.b() : null;

         while (this.a($$3)) {
            ewd<T> $$6 = $$1.b();
            if ($$6 == null || $$6.c() > $$2 || $$5 != null && ewd.b.compare($$6, $$5) > 0) {
               break;
            }

            $$1.c();
            this.c($$6);
         }
      }
   }

   private void c(ewd<T> $$0) {
      this.g.add($$0);
   }

   private boolean a(int $$0) {
      return this.g.size() < $$0;
   }

   private void a(BiConsumer<io, T> $$0) {
      while (!this.g.isEmpty()) {
         ewd<T> $$1 = this.g.poll();
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
   public boolean a(io $$0, T $$1) {
      evy<T> $$2 = (evy<T>)this.d.get(dag.a($$0));
      return $$2 != null && $$2.a($$0, $$1);
   }

   @Override
   public boolean b(io $$0, T $$1) {
      this.d();
      return this.i.contains(ewd.a($$1, $$0));
   }

   private void d() {
      if (this.i.isEmpty() && !this.g.isEmpty()) {
         this.i.addAll(this.g);
      }
   }

   private void a(ehd $$0, ewa.a<T> $$1) {
      int $$2 = jq.a((double)$$0.h());
      int $$3 = jq.a((double)$$0.j());
      int $$4 = jq.a((double)$$0.k());
      int $$5 = jq.a((double)$$0.m());

      for (int $$6 = $$2; $$6 <= $$4; $$6++) {
         for (int $$7 = $$3; $$7 <= $$5; $$7++) {
            long $$8 = dag.c($$6, $$7);
            evy<T> $$9 = (evy<T>)this.d.get($$8);
            if ($$9 != null) {
               $$1.accept($$8, $$9);
            }
         }
      }
   }

   public void a(ehd $$0) {
      Predicate<ewd<T>> $$1 = $$1x -> $$0.b($$1x.b());
      this.a($$0, ($$1x, $$2) -> {
         ewd<T> $$3 = $$2.b();
         $$2.a($$1);
         ewd<T> $$4 = $$2.b();
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

   public void a(ehd $$0, js $$1) {
      this.a(this, $$0, $$1);
   }

   public void a(ewa<T> $$0, ehd $$1, js $$2) {
      List<ewd<T>> $$3 = new ArrayList<>();
      Predicate<ewd<T>> $$4 = $$1x -> $$1.b($$1x.b());
      $$0.h.stream().filter($$4).forEach($$3::add);
      $$0.g.stream().filter($$4).forEach($$3::add);
      $$0.a($$1, ($$2x, $$3x) -> $$3x.d().filter($$4).forEach($$3::add));
      LongSummaryStatistics $$5 = $$3.stream().mapToLong(ewd::e).summaryStatistics();
      long $$6 = $$5.getMin();
      long $$7 = $$5.getMax();
      $$3.forEach($$3x -> this.a(new ewd<>((T)$$3x.a(), $$3x.b().a($$2), $$3x.c(), $$3x.d(), $$3x.e() - $$6 + $$7 + 1L)));
   }

   @Override
   public int a() {
      return this.d.values().stream().mapToInt(ewf::a).sum();
   }

   @FunctionalInterface
   interface a<T> {
      void accept(long var1, evy<T> var3);
   }
}
