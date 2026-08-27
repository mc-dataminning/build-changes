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

public class dxh<T extends dxc> {
   private final Class<T> a;
   private final Long2ObjectFunction<dxp> b;
   private final Long2ObjectMap<dxg<T>> c = new Long2ObjectOpenHashMap();
   private final LongSortedSet d = new LongAVLTreeSet();

   public dxh(Class<T> $$0, Long2ObjectFunction<dxp> $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public void a(ewp $$0, awz<dxg<T>> $$1) {
      int $$2 = 2;
      int $$3 = jt.a($$0.a - 2.0);
      int $$4 = jt.a($$0.b - 4.0);
      int $$5 = jt.a($$0.c - 2.0);
      int $$6 = jt.a($$0.d + 2.0);
      int $$7 = jt.a($$0.e + 0.0);
      int $$8 = jt.a($$0.f + 2.0);

      for (int $$9 = $$3; $$9 <= $$6; $$9++) {
         long $$10 = jt.b($$9, 0, 0);
         long $$11 = jt.b($$9, -1, -1);
         LongIterator $$12 = this.d.subSet($$10, $$11 + 1L).iterator();

         while ($$12.hasNext()) {
            long $$13 = $$12.nextLong();
            int $$14 = jt.c($$13);
            int $$15 = jt.d($$13);
            if ($$14 >= $$4 && $$14 <= $$7 && $$15 >= $$5 && $$15 <= $$8) {
               dxg<T> $$16 = (dxg<T>)this.c.get($$13);
               if ($$16 != null && !$$16.a() && $$16.c().b() && $$1.accept($$16).a()) {
                  return;
               }
            }
         }
      }
   }

   public LongStream a(long $$0) {
      int $$1 = dbh.a($$0);
      int $$2 = dbh.b($$0);
      LongSortedSet $$3 = this.a($$1, $$2);
      if ($$3.isEmpty()) {
         return LongStream.empty();
      } else {
         OfLong $$4 = $$3.iterator();
         return StreamSupport.longStream(Spliterators.spliteratorUnknownSize($$4, 1301), false);
      }
   }

   private LongSortedSet a(int $$0, int $$1) {
      long $$2 = jt.b($$0, 0, $$1);
      long $$3 = jt.b($$0, -1, $$1);
      return this.d.subSet($$2, $$3 + 1L);
   }

   public Stream<dxg<T>> b(long $$0) {
      return this.a($$0).<dxg<T>>mapToObj(this.c::get).filter(Objects::nonNull);
   }

   private static long f(long $$0) {
      return dbh.c(jt.b($$0), jt.d($$0));
   }

   public dxg<T> c(long $$0) {
      return (dxg<T>)this.c.computeIfAbsent($$0, this::g);
   }

   @Nullable
   public dxg<T> d(long $$0) {
      return (dxg<T>)this.c.get($$0);
   }

   private dxg<T> g(long $$0) {
      long $$1 = f($$0);
      dxp $$2 = (dxp)this.b.get($$1);
      this.d.add($$0);
      return new dxg<>(this.a, $$2);
   }

   public LongSet a() {
      LongSet $$0 = new LongOpenHashSet();
      this.c.keySet().forEach($$1 -> $$0.add(f($$1)));
      return $$0;
   }

   public void b(ewp $$0, awz<T> $$1) {
      this.a($$0, $$2 -> $$2.a($$0, $$1));
   }

   public <U extends T> void a(dxj<T, U> $$0, ewp $$1, awz<U> $$2) {
      this.a($$1, $$3 -> $$3.a($$0, $$1, $$2));
   }

   public void e(long $$0) {
      this.c.remove($$0);
      this.d.remove($$0);
   }

   @azp
   public int b() {
      return this.d.size();
   }
}
