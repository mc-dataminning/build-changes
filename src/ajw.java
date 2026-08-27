import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class ajw<T> {
   public static final int a = aju.a + 2;
   private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> b = IntStream.range(0, a)
      .mapToObj($$0x -> new Long2ObjectLinkedOpenHashMap())
      .collect(Collectors.toList());
   private volatile int c = a;
   private final String d;
   private final LongSet e = new LongOpenHashSet();
   private final int f;

   public ajw(String $$0, int $$1) {
      this.d = $$0;
      this.f = $$1;
   }

   protected void a(int $$0, cos $$1, int $$2) {
      if ($$0 < a) {
         Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$3 = this.b.get($$0);
         List<Optional<T>> $$4 = (List<Optional<T>>)$$3.remove($$1.a());
         if ($$0 == this.c) {
            while (this.b() && this.b.get(this.c).isEmpty()) {
               this.c++;
            }
         }

         if ($$4 != null && !$$4.isEmpty()) {
            ((List)this.b.get($$2).computeIfAbsent($$1.a(), $$0x -> Lists.newArrayList())).addAll($$4);
            this.c = Math.min(this.c, $$2);
         }
      }
   }

   protected void a(Optional<T> $$0, long $$1, int $$2) {
      ((List)this.b.get($$2).computeIfAbsent($$1, $$0x -> Lists.newArrayList())).add($$0);
      this.c = Math.min(this.c, $$2);
   }

   protected void a(long $$0, boolean $$1) {
      for (Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$2 : this.b) {
         List<Optional<T>> $$3 = (List<Optional<T>>)$$2.get($$0);
         if ($$3 != null) {
            if ($$1) {
               $$3.clear();
            } else {
               $$3.removeIf($$0x -> $$0x.isEmpty());
            }

            if ($$3.isEmpty()) {
               $$2.remove($$0);
            }
         }
      }

      while (this.b() && this.b.get(this.c).isEmpty()) {
         this.c++;
      }

      this.e.remove($$0);
   }

   private Runnable a(long $$0) {
      return () -> this.e.add($$0);
   }

   @Nullable
   public Stream<Either<T, Runnable>> a() {
      if (this.e.size() >= this.f) {
         return null;
      } else if (!this.b()) {
         return null;
      } else {
         int $$0 = this.c;
         Long2ObjectLinkedOpenHashMap<List<Optional<T>>> $$1 = this.b.get($$0);
         long $$2 = $$1.firstLongKey();
         List<Optional<T>> $$3 = (List<Optional<T>>)$$1.removeFirst();

         while (this.b() && this.b.get(this.c).isEmpty()) {
            this.c++;
         }

         return $$3.stream().map($$1x -> $$1x.map(Either::left).orElseGet(() -> Either.right(this.a($$2))));
      }
   }

   public boolean b() {
      return this.c < a;
   }

   @Override
   public String toString() {
      return this.d + " " + this.c + "...";
   }

   @VisibleForTesting
   LongSet c() {
      return new LongOpenHashSet(this.e);
   }
}
