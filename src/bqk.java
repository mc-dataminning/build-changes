import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class bqk<U> implements Iterable<U> {
   protected final List<bqk.a<U>> a;
   private final auu b = auu.a();

   public bqk() {
      this.a = Lists.newArrayList();
   }

   private bqk(List<bqk.a<U>> $$0) {
      this.a = Lists.newArrayList($$0);
   }

   public static <U> Codec<bqk<U>> a(Codec<U> $$0) {
      return bqk.a.a($$0).listOf().xmap(bqk::new, $$0x -> $$0x.a);
   }

   public bqk<U> a(U $$0, int $$1) {
      this.a.add(new bqk.a<>($$0, $$1));
      return this;
   }

   public bqk<U> a() {
      this.a.forEach($$0 -> $$0.a(this.b.i()));
      this.a.sort(Comparator.comparingDouble(bqk.a::c));
      return this;
   }

   public Stream<U> b() {
      return this.a.stream().map(bqk.a::a);
   }

   @Override
   public Iterator<U> iterator() {
      return Iterators.transform(this.a.iterator(), bqk.a::a);
   }

   @Override
   public String toString() {
      return "ShufflingList[" + this.a + "]";
   }

   public static class a<T> {
      final T a;
      final int b;
      private double c;

      a(T $$0, int $$1) {
         this.b = $$1;
         this.a = $$0;
      }

      private double c() {
         return this.c;
      }

      void a(float $$0) {
         this.c = -Math.pow((double)$$0, (double)(1.0F / (float)this.b));
      }

      public T a() {
         return this.a;
      }

      public int b() {
         return this.b;
      }

      @Override
      public String toString() {
         return this.b + ":" + this.a;
      }

      public static <E> Codec<bqk.a<E>> a(final Codec<E> $$0) {
         return new Codec<bqk.a<E>>() {
            public <T> DataResult<Pair<bqk.a<E>, T>> decode(DynamicOps<T> $$0x, T $$1) {
               Dynamic<T> $$2 = new Dynamic($$0, $$1);
               return $$2.get("data").flatMap($$0::parse).map($$1x -> new bqk.a<>($$1x, $$2.get("weight").asInt(1))).map($$1x -> Pair.of($$1x, $$0.empty()));
            }

            public <T> DataResult<T> a(bqk.a<E> $$0x, DynamicOps<T> $$1, T $$2) {
               return $$1.mapBuilder().add("weight", $$1.createInt($$0.b)).add("data", $$0.encodeStart($$1, $$0.a)).build($$2);
            }
         };
      }
   }
}
