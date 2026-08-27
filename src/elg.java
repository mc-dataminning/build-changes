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

public class elg<T> implements elm<T>, elo<T> {
   private final Queue<ell<T>> a = new PriorityQueue<>(ell.a);
   @Nullable
   private List<elk<T>> b;
   private final Set<ell<?>> c = new ObjectOpenCustomHashSet(ell.c);
   @Nullable
   private BiConsumer<elg<T>, ell<T>> d;

   public elg() {
   }

   public elg(List<elk<T>> $$0) {
      this.b = $$0;

      for (elk<T> $$1 : $$0) {
         this.c.add(ell.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<elg<T>, ell<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ell<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ell<T> c() {
      ell<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ell<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ell<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.c.contains(ell.a($$1, $$0));
   }

   public void a(Predicate<ell<T>> $$0) {
      Iterator<ell<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ell<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ell<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public sj a(long $$0, Function<T, String> $$1) {
      sj $$2 = new sj();
      if (this.b != null) {
         for (elk<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (ell<T> $$4 : this.a) {
         $$2.add(elk.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (elk<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> elg<T> a(sj $$0, Function<String, Optional<T>> $$1, crm $$2) {
      Builder<elk<T>> $$3 = ImmutableList.builder();
      elk.a($$0, $$1, $$2, $$3::add);
      return new elg<>($$3.build());
   }
}
