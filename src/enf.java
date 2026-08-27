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

public class enf<T> implements enl<T>, enn<T> {
   private final Queue<enk<T>> a = new PriorityQueue<>(enk.a);
   @Nullable
   private List<enj<T>> b;
   private final Set<enk<?>> c = new ObjectOpenCustomHashSet(enk.c);
   @Nullable
   private BiConsumer<enf<T>, enk<T>> d;

   public enf() {
   }

   public enf(List<enj<T>> $$0) {
      this.b = $$0;

      for (enj<T> $$1 : $$0) {
         this.c.add(enk.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<enf<T>, enk<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public enk<T> b() {
      return this.a.peek();
   }

   @Nullable
   public enk<T> c() {
      enk<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(enk<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(enk<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.c.contains(enk.a($$1, $$0));
   }

   public void a(Predicate<enk<T>> $$0) {
      Iterator<enk<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         enk<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<enk<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public st a(long $$0, Function<T, String> $$1) {
      st $$2 = new st();
      if (this.b != null) {
         for (enj<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (enk<T> $$4 : this.a) {
         $$2.add(enj.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (enj<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> enf<T> a(st $$0, Function<String, Optional<T>> $$1, csw $$2) {
      Builder<enj<T>> $$3 = ImmutableList.builder();
      enj.a($$0, $$1, $$2, $$3::add);
      return new enf<>($$3.build());
   }
}
