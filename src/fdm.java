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

public class fdm<T> implements fdl<T> {
   private static final Comparator<fdk<?>> a = ($$0, $$1) -> fdp.b.compare($$0.b(), $$1.b());
   private final LongPredicate b;
   private final Long2ObjectMap<fdk<T>> c = new Long2ObjectOpenHashMap();
   private final Long2LongMap d = ae.a(new Long2LongOpenHashMap(), $$0x -> $$0x.defaultReturnValue(Long.MAX_VALUE));
   private final Queue<fdk<T>> e = new PriorityQueue<>(a);
   private final Queue<fdp<T>> f = new ArrayDeque<>();
   private final List<fdp<T>> g = new ArrayList<>();
   private final Set<fdp<?>> h = new ObjectOpenCustomHashSet(fdp.c);
   private final BiConsumer<fdk<T>, fdp<T>> i = ($$0x, $$1) -> {
      if ($$1.equals($$0x.b())) {
         this.b($$1);
      }
   };

   public fdm(LongPredicate $$0) {
      this.b = $$0;
   }

   public void a(dgn $$0, fdk<T> $$1) {
      long $$2 = $$0.a();
      this.c.put($$2, $$1);
      fdp<T> $$3 = $$1.b();
      if ($$3 != null) {
         this.d.put($$2, $$3.c());
      }

      $$1.a(this.i);
   }

   public void a(dgn $$0) {
      long $$1 = $$0.a();
      fdk<T> $$2 = (fdk<T>)this.c.remove($$1);
      this.d.remove($$1);
      if ($$2 != null) {
         $$2.a(null);
      }
   }

   @Override
   public void a(fdp<T> $$0) {
      long $$1 = dgn.a($$0.b());
      fdk<T> $$2 = (fdk<T>)this.c.get($$1);
      if ($$2 == null) {
         ae.b("Trying to schedule tick in not loaded position " + $$0.b());
      } else {
         $$2.a($$0);
      }
   }

   public void a(long $$0, int $$1, BiConsumer<jh, T> $$2) {
      bps $$3 = bpr.a();
      $$3.a("collect");
      this.a($$0, $$1, $$3);
      $$3.b("run");
      $$3.a("ticksToRun", this.f.size());
      this.a($$2);
      $$3.b("cleanup");
      this.c();
      $$3.c();
   }

   private void a(long $$0, int $$1, bps $$2) {
      this.a($$0);
      $$2.a("containersToTick", this.e.size());
      this.a($$0, $$1);
      this.b();
   }

   private void a(long $$0) {
      ObjectIterator<Entry> $$1 = Long2LongMaps.fastIterator(this.d);

      while ($$1.hasNext()) {
         Entry $$2 = (Entry)$$1.next();
         long $$3 = $$2.getLongKey();
         long $$4 = $$2.getLongValue();
         if ($$4 <= $$0) {
            fdk<T> $$5 = (fdk<T>)this.c.get($$3);
            if ($$5 == null) {
               $$1.remove();
            } else {
               fdp<T> $$6 = $$5.b();
               if ($$6 == null) {
                  $$1.remove();
               } else if ($$6.c() > $$0) {
                  $$2.setValue($$6.c());
               } else if (this.b.test($$3)) {
                  $$1.remove();
                  this.e.add($$5);
               }
            }
         }
      }
   }

   private void a(long $$0, int $$1) {
      fdk<T> $$2;
      while (this.a($$1) && ($$2 = this.e.poll()) != null) {
         fdp<T> $$3 = $$2.c();
         this.c($$3);
         this.a(this.e, $$2, $$0, $$1);
         fdp<T> $$4 = $$2.b();
         if ($$4 != null) {
            if ($$4.c() <= $$0 && this.a($$1)) {
               this.e.add($$2);
            } else {
               this.b($$4);
            }
         }
      }
   }

   private void b() {
      for (fdk<T> $$0 : this.e) {
         this.b($$0.b());
      }
   }

   private void b(fdp<T> $$0) {
      this.d.put(dgn.a($$0.b()), $$0.c());
   }

   private void a(Queue<fdk<T>> $$0, fdk<T> $$1, long $$2, int $$3) {
      if (this.a($$3)) {
         fdk<T> $$4 = $$0.peek();
         fdp<T> $$5 = $$4 != null ? $$4.b() : null;

         while (this.a($$3)) {
            fdp<T> $$6 = $$1.b();
            if ($$6 == null || $$6.c() > $$2 || $$5 != null && fdp.b.compare($$6, $$5) > 0) {
               break;
            }

            $$1.c();
            this.c($$6);
         }
      }
   }

   private void c(fdp<T> $$0) {
      this.f.add($$0);
   }

   private boolean a(int $$0) {
      return this.f.size() < $$0;
   }

   private void a(BiConsumer<jh, T> $$0) {
      while (!this.f.isEmpty()) {
         fdp<T> $$1 = this.f.poll();
         if (!this.h.isEmpty()) {
            this.h.remove($$1);
         }

         this.g.add($$1);
         $$0.accept($$1.b(), $$1.a());
      }
   }

   private void c() {
      this.f.clear();
      this.e.clear();
      this.g.clear();
      this.h.clear();
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      fdk<T> $$2 = (fdk<T>)this.c.get(dgn.a($$0));
      return $$2 != null && $$2.a($$0, $$1);
   }

   @Override
   public boolean b(jh $$0, T $$1) {
      this.d();
      return this.h.contains(fdp.a($$1, $$0));
   }

   private void d() {
      if (this.h.isEmpty() && !this.f.isEmpty()) {
         this.h.addAll(this.f);
      }
   }

   private void a(eob $$0, fdm.a<T> $$1) {
      int $$2 = kj.a((double)$$0.h());
      int $$3 = kj.a((double)$$0.j());
      int $$4 = kj.a((double)$$0.k());
      int $$5 = kj.a((double)$$0.m());

      for (int $$6 = $$2; $$6 <= $$4; $$6++) {
         for (int $$7 = $$3; $$7 <= $$5; $$7++) {
            long $$8 = dgn.c($$6, $$7);
            fdk<T> $$9 = (fdk<T>)this.c.get($$8);
            if ($$9 != null) {
               $$1.accept($$8, $$9);
            }
         }
      }
   }

   public void a(eob $$0) {
      Predicate<fdp<T>> $$1 = $$1x -> $$0.b($$1x.b());
      this.a($$0, ($$1x, $$2) -> {
         fdp<T> $$3 = $$2.b();
         $$2.a($$1);
         fdp<T> $$4 = $$2.b();
         if ($$4 != $$3) {
            if ($$4 != null) {
               this.b($$4);
            } else {
               this.d.remove($$1x);
            }
         }
      });
      this.g.removeIf($$1);
      this.f.removeIf($$1);
   }

   public void a(eob $$0, kl $$1) {
      this.a(this, $$0, $$1);
   }

   public void a(fdm<T> $$0, eob $$1, kl $$2) {
      List<fdp<T>> $$3 = new ArrayList<>();
      Predicate<fdp<T>> $$4 = $$1x -> $$1.b($$1x.b());
      $$0.g.stream().filter($$4).forEach($$3::add);
      $$0.f.stream().filter($$4).forEach($$3::add);
      $$0.a($$1, ($$2x, $$3x) -> $$3x.d().filter($$4).forEach($$3::add));
      LongSummaryStatistics $$5 = $$3.stream().mapToLong(fdp::e).summaryStatistics();
      long $$6 = $$5.getMin();
      long $$7 = $$5.getMax();
      $$3.forEach($$3x -> this.a(new fdp<>((T)$$3x.a(), $$3x.b().a($$2), $$3x.c(), $$3x.d(), $$3x.e() - $$6 + $$7 + 1L)));
   }

   @Override
   public int a() {
      return this.c.values().stream().mapToInt(fdr::a).sum();
   }

   @FunctionalInterface
   interface a<T> {
      void accept(long var1, fdk<T> var3);
   }
}
