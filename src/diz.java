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

public class diz<T extends diu> {
   private final Class<T> a;
   private final Long2ObjectFunction<djh> b;
   private final Long2ObjectMap<diy<T>> c = new Long2ObjectOpenHashMap();
   private final LongSortedSet d = new LongAVLTreeSet();

   public diz(Class<T> $$0, Long2ObjectFunction<djh> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ehc $$0, aqq<diy<T>> $$1) {
      int $$2 = 2;
      int $$3 = hw.a($$0.a - 2.0);
      int $$4 = hw.a($$0.b - 4.0);
      int $$5 = hw.a($$0.c - 2.0);
      int $$6 = hw.a($$0.d + 2.0);
      int $$7 = hw.a($$0.e + 0.0);
      int $$8 = hw.a($$0.f + 2.0);

      for (int $$9 = $$3; $$9 <= $$6; $$9++) {
         long $$10 = hw.b($$9, 0, 0);
         long $$11 = hw.b($$9, -1, -1);
         LongIterator $$12 = this.d.subSet($$10, $$11 + 1L).iterator();

         while ($$12.hasNext()) {
            long $$13 = $$12.nextLong();
            int $$14 = hw.c($$13);
            int $$15 = hw.d($$13);
            if ($$14 >= $$4 && $$14 <= $$7 && $$15 >= $$5 && $$15 <= $$8) {
               diy<T> $$16 = (diy<T>)this.c.get($$13);
               if ($$16 != null && !$$16.a() && $$16.c().b() && $$1.accept($$16).a()) {
                  return;
               }
            }
         }
      }
   }

   public LongStream a(long $$0) {
      int $$1 = cpi.a($$0);
      int $$2 = cpi.b($$0);
      LongSortedSet $$3 = this.a($$1, $$2);
      if ($$3.isEmpty()) {
         return LongStream.empty();
      } else {
         OfLong $$4 = $$3.iterator();
         return StreamSupport.longStream(Spliterators.spliteratorUnknownSize($$4, 1301), false);
      }
   }

   private LongSortedSet a(int $$0, int $$1) {
      long $$2 = hw.b($$0, 0, $$1);
      long $$3 = hw.b($$0, -1, $$1);
      return this.d.subSet($$2, $$3 + 1L);
   }

   public Stream<diy<T>> b(long $$0) {
      return this.a($$0).<diy<T>>mapToObj(this.c::get).filter(Objects::nonNull);
   }

   private static long f(long $$0) {
      return cpi.c(hw.b($$0), hw.d($$0));
   }

   public diy<T> c(long $$0) {
      return (diy<T>)this.c.computeIfAbsent($$0, this::g);
   }

   @Nullable
   public diy<T> d(long $$0) {
      return (diy<T>)this.c.get($$0);
   }

   private diy<T> g(long $$0) {
      long $$1 = f($$0);
      djh $$2 = (djh)this.b.get($$1);
      this.d.add($$0);
      return new diy<>(this.a, $$2);
   }

   public LongSet a() {
      LongSet $$0 = new LongOpenHashSet();
      this.c.keySet().forEach($$1 -> $$0.add(f($$1)));
      return $$0;
   }

   public void b(ehc $$0, aqq<T> $$1) {
      this.a($$0, $$2 -> $$2.a($$0, $$1));
   }

   public <U extends T> void a(djb<T, U> $$0, ehc $$1, aqq<U> $$2) {
      this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public void e(long $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   @atd
   public int b() {
      return this.d.size();
   }
}
