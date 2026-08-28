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

public class exb<T> implements exh<T>, exj<T> {
   private final Queue<exg<T>> a = new PriorityQueue<>(exg.a);
   @Nullable
   private List<exf<T>> b;
   private final Set<exg<?>> c = new ObjectOpenCustomHashSet(exg.c);
   @Nullable
   private BiConsumer<exb<T>, exg<T>> d;

   public exb() {
   }

   public exb(List<exf<T>> $$0) {
      this.b = $$0;

      for (exf<T> $$1 : $$0) {
         this.c.add(exg.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exb<T>, exg<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exg<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exg<T> c() {
      exg<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exg<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exg<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.c.contains(exg.a($$1, $$0));
   }

   public void a(Predicate<exg<T>> $$0) {
      Iterator<exg<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exg<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exg<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ux a(long $$0, Function<T, String> $$1) {
      ux $$2 = new ux();
      if (this.b != null) {
         for (exf<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exg<T> $$4 : this.a) {
         $$2.add(exf.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exf<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exb<T> a(ux $$0, Function<String, Optional<T>> $$1, dbd $$2) {
      Builder<exf<T>> $$3 = ImmutableList.builder();
      exf.a($$0, $$1, $$2, $$3::add);
      return new exb<>($$3.build());
   }
}
