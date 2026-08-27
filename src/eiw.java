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

public class eiw<T> implements ejc<T>, eje<T> {
   private final Queue<ejb<T>> a = new PriorityQueue<>(ejb.a);
   @Nullable
   private List<eja<T>> b;
   private final Set<ejb<?>> c = new ObjectOpenCustomHashSet(ejb.c);
   @Nullable
   private BiConsumer<eiw<T>, ejb<T>> d;

   public eiw() {
   }

   public eiw(List<eja<T>> $$0) {
      this.b = $$0;

      for (eja<T> $$1 : $$0) {
         this.c.add(ejb.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eiw<T>, ejb<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ejb<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ejb<T> c() {
      ejb<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ejb<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ejb<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.c.contains(ejb.a($$1, $$0));
   }

   public void a(Predicate<ejb<T>> $$0) {
      Iterator<ejb<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ejb<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ejb<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public re a(long $$0, Function<T, String> $$1) {
      re $$2 = new re();
      if (this.b != null) {
         for (eja<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (ejb<T> $$4 : this.a) {
         $$2.add(eja.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eja<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eiw<T> a(re $$0, Function<String, Optional<T>> $$1, cpe $$2) {
      Builder<eja<T>> $$3 = ImmutableList.builder();
      eja.a($$0, $$1, $$2, $$3::add);
      return new eiw<>($$3.build());
   }
}
