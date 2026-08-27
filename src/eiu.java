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

public class eiu<T> implements eja<T>, ejc<T> {
   private final Queue<eiz<T>> a = new PriorityQueue<>(eiz.a);
   @Nullable
   private List<eiy<T>> b;
   private final Set<eiz<?>> c = new ObjectOpenCustomHashSet(eiz.c);
   @Nullable
   private BiConsumer<eiu<T>, eiz<T>> d;

   public eiu() {
   }

   public eiu(List<eiy<T>> $$0) {
      this.b = $$0;

      for (eiy<T> $$1 : $$0) {
         this.c.add(eiz.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eiu<T>, eiz<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eiz<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eiz<T> c() {
      eiz<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eiz<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eiz<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.c.contains(eiz.a($$1, $$0));
   }

   public void a(Predicate<eiz<T>> $$0) {
      Iterator<eiz<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eiz<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eiz<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public rc a(long $$0, Function<T, String> $$1) {
      rc $$2 = new rc();
      if (this.b != null) {
         for (eiy<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eiz<T> $$4 : this.a) {
         $$2.add(eiy.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eiy<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eiu<T> a(rc $$0, Function<String, Optional<T>> $$1, cpc $$2) {
      Builder<eiy<T>> $$3 = ImmutableList.builder();
      eiy.a($$0, $$1, $$2, $$3::add);
      return new eiu<>($$3.build());
   }
}
