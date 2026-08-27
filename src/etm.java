import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class etm<T> implements ets<T>, etu<T> {
   private final Queue<etr<T>> a = new PriorityQueue<>(etr.a);
   @Nullable
   private List<etq<T>> b;
   private final Set<etr<?>> c = new ObjectOpenCustomHashSet(etr.c);
   @Nullable
   private BiConsumer<etm<T>, etr<T>> d;

   public etm() {
   }

   public etm(List<etq<T>> $$0) {
      this.b = $$0;

      for (etq<T> $$1 : $$0) {
         this.c.add(etr.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<etm<T>, etr<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public etr<T> b() {
      return this.a.peek();
   }

   @Nullable
   public etr<T> c() {
      etr<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(etr<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(etr<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.c.contains(etr.a($$1, $$0));
   }

   public void a(Predicate<etr<T>> $$0) {
      Iterator<etr<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         etr<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<etr<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ts a(long $$0, Function<T, String> $$1) {
      ts $$2 = new ts();
      if (this.b != null) {
         for (etq<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (etr<T> $$4 : this.a) {
         $$2.add(etq.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (etq<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> etm<T> a(ts $$0, Function<String, Optional<T>> $$1, cye $$2) {
      Builder<etq<T>> $$3 = ImmutableList.builder();
      etq.a($$0, $$1, $$2, $$3::add);
      return new etm<>($$3.build());
   }
}
