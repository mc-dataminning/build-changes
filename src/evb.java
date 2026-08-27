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

public class evb<T> implements evh<T>, evj<T> {
   private final Queue<evg<T>> a = new PriorityQueue<>(evg.a);
   @Nullable
   private List<evf<T>> b;
   private final Set<evg<?>> c = new ObjectOpenCustomHashSet(evg.c);
   @Nullable
   private BiConsumer<evb<T>, evg<T>> d;

   public evb() {
   }

   public evb(List<evf<T>> $$0) {
      this.b = $$0;

      for (evf<T> $$1 : $$0) {
         this.c.add(evg.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<evb<T>, evg<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public evg<T> b() {
      return this.a.peek();
   }

   @Nullable
   public evg<T> c() {
      evg<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(evg<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(evg<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(in $$0, T $$1) {
      return this.c.contains(evg.a($$1, $$0));
   }

   public void a(Predicate<evg<T>> $$0) {
      Iterator<evg<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         evg<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<evg<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ug a(long $$0, Function<T, String> $$1) {
      ug $$2 = new ug();
      if (this.b != null) {
         for (evf<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (evg<T> $$4 : this.a) {
         $$2.add(evf.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (evf<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> evb<T> a(ug $$0, Function<String, Optional<T>> $$1, czk $$2) {
      Builder<evf<T>> $$3 = ImmutableList.builder();
      evf.a($$0, $$1, $$2, $$3::add);
      return new evb<>($$3.build());
   }
}
