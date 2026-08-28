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

public class exc<T> implements exi<T>, exk<T> {
   private final Queue<exh<T>> a = new PriorityQueue<>(exh.a);
   @Nullable
   private List<exg<T>> b;
   private final Set<exh<?>> c = new ObjectOpenCustomHashSet(exh.c);
   @Nullable
   private BiConsumer<exc<T>, exh<T>> d;

   public exc() {
   }

   public exc(List<exg<T>> $$0) {
      this.b = $$0;

      for (exg<T> $$1 : $$0) {
         this.c.add(exh.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exc<T>, exh<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exh<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exh<T> c() {
      exh<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exh<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exh<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.c.contains(exh.a($$1, $$0));
   }

   public void a(Predicate<exh<T>> $$0) {
      Iterator<exh<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exh<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exh<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ux a(long $$0, Function<T, String> $$1) {
      ux $$2 = new ux();
      if (this.b != null) {
         for (exg<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exh<T> $$4 : this.a) {
         $$2.add(exg.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exg<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exc<T> a(ux $$0, Function<String, Optional<T>> $$1, dbe $$2) {
      Builder<exg<T>> $$3 = ImmutableList.builder();
      exg.a($$0, $$1, $$2, $$3::add);
      return new exc<>($$3.build());
   }
}
