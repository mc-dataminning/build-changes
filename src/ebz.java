import it.unimi.dsi.fastutil.longs.Long2ObjectFunction;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongAVLTreeSet;
import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.LongSortedSet;
import java.util.Objects;
import java.util.Spliterators;
import java.util.PrimitiveIterator.OfLong;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;

public class ebz<T extends ebu> {
   public static final int a = 2;
   public static final int b = 4;
   private final Class<T> c;
   private final Long2ObjectFunction<ecj> d;
   private final Long2ObjectMap<eby<T>> e = new Long2ObjectOpenHashMap();
   private final LongSortedSet f = new LongAVLTreeSet();

   public ebz(Class<T> $$0, Long2ObjectFunction<ecj> $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   public void a(fbs $$0, axl<eby<T>> $$1) {
      int $$2 = kk.a($$0.a - 2.0);
      int $$3 = kk.a($$0.b - 4.0);
      int $$4 = kk.a($$0.c - 2.0);
      int $$5 = kk.a($$0.d + 2.0);
      int $$6 = kk.a($$0.e + 0.0);
      int $$7 = kk.a($$0.f + 2.0);

      for (int $$8 = $$2; $$8 <= $$5; $$8++) {
         long $$9 = kk.b($$8, 0, 0);
         long $$10 = kk.b($$8, -1, -1);
         LongIterator $$11 = this.f.subSet($$9, $$10 + 1L).iterator();

         while ($$11.hasNext()) {
            long $$12 = $$11.nextLong();
            int $$13 = kk.c($$12);
            int $$14 = kk.d($$12);
            if ($$13 >= $$3 && $$13 <= $$6 && $$14 >= $$4 && $$14 <= $$7) {
               eby<T> $$15 = (eby<T>)this.e.get($$12);
               if ($$15 != null && !$$15.a() && $$15.c().b() && $$1.accept($$15).a()) {
                  return;
               }
            }
         }
      }
   }

   public LongStream a(long $$0) {
      int $$1 = dgg.a($$0);
      int $$2 = dgg.b($$0);
      LongSortedSet $$3 = this.a($$1, $$2);
      if ($$3.isEmpty()) {
         return LongStream.empty();
      } else {
         OfLong $$4 = $$3.iterator();
         return StreamSupport.longStream(Spliterators.spliteratorUnknownSize($$4, 1301), false);
      }
   }

   private LongSortedSet a(int $$0, int $$1) {
      long $$2 = kk.b($$0, 0, $$1);
      long $$3 = kk.b($$0, -1, $$1);
      return this.f.subSet($$2, $$3 + 1L);
   }

   public Stream<eby<T>> b(long $$0) {
      return this.a($$0).<eby<T>>mapToObj(this.e::get).filter(Objects::nonNull);
   }

   private static long f(long $$0) {
      return dgg.c(kk.b($$0), kk.d($$0));
   }

   public eby<T> c(long $$0) {
      return (eby<T>)this.e.computeIfAbsent($$0, this::g);
   }

   @Nullable
   public eby<T> d(long $$0) {
      return (eby<T>)this.e.get($$0);
   }

   private eby<T> g(long $$0) {
      long $$1 = f($$0);
      ecj $$2 = (ecj)this.d.get($$1);
      this.f.add($$0);
      return new eby<>(this.c, $$2);
   }

   public LongSet a() {
      LongSet $$0 = new LongOpenHashSet();
      this.e.keySet().forEach($$1 -> $$0.add(f($$1)));
      return $$0;
   }

   public void b(fbs $$0, axl<T> $$1) {
      this.a($$0, $$2 -> $$2.a($$0, $$1));
   }

   public <U extends T> void a(ecb<T, U> $$0, fbs $$1, axl<U> $$2) {
      this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public void e(long $$0) {
      this.e.remove($$0);
      this.f.remove($$0);
   }

   @bag
   public int b() {
      return this.f.size();
   }
}
