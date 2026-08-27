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

public class eil<T> implements eir<T>, eit<T> {
   private final Queue<eiq<T>> a = new PriorityQueue<>(eiq.a);
   @Nullable
   private List<eip<T>> b;
   private final Set<eiq<?>> c = new ObjectOpenCustomHashSet(eiq.c);
   @Nullable
   private BiConsumer<eil<T>, eiq<T>> d;

   public eil() {
   }

   public eil(List<eip<T>> $$0) {
      this.b = $$0;

      for (eip<T> $$1 : $$0) {
         this.c.add(eiq.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eil<T>, eiq<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eiq<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eiq<T> c() {
      eiq<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eiq<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eiq<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.c.contains(eiq.a($$1, $$0));
   }

   public void a(Predicate<eiq<T>> $$0) {
      Iterator<eiq<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eiq<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eiq<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public qx a(long $$0, Function<T, String> $$1) {
      qx $$2 = new qx();
      if (this.b != null) {
         for (eip<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eiq<T> $$4 : this.a) {
         $$2.add(eip.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eip<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eil<T> a(qx $$0, Function<String, Optional<T>> $$1, cot $$2) {
      Builder<eip<T>> $$3 = ImmutableList.builder();
      eip.a($$0, $$1, $$2, $$3::add);
      return new eil<>($$3.build());
   }
}
