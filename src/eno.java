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

public class eno<T> implements enu<T>, enw<T> {
   private final Queue<ent<T>> a = new PriorityQueue<>(ent.a);
   @Nullable
   private List<ens<T>> b;
   private final Set<ent<?>> c = new ObjectOpenCustomHashSet(ent.c);
   @Nullable
   private BiConsumer<eno<T>, ent<T>> d;

   public eno() {
   }

   public eno(List<ens<T>> $$0) {
      this.b = $$0;

      for (ens<T> $$1 : $$0) {
         this.c.add(ent.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eno<T>, ent<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ent<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ent<T> c() {
      ent<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ent<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ent<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.c.contains(ent.a($$1, $$0));
   }

   public void a(Predicate<ent<T>> $$0) {
      Iterator<ent<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ent<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ent<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public su a(long $$0, Function<T, String> $$1) {
      su $$2 = new su();
      if (this.b != null) {
         for (ens<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (ent<T> $$4 : this.a) {
         $$2.add(ens.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ens<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eno<T> a(su $$0, Function<String, Optional<T>> $$1, cte $$2) {
      Builder<ens<T>> $$3 = ImmutableList.builder();
      ens.a($$0, $$1, $$2, $$3::add);
      return new eno<>($$3.build());
   }
}
