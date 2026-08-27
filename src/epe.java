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

public class epe<T> implements epk<T>, epm<T> {
   private final Queue<epj<T>> a = new PriorityQueue<>(epj.a);
   @Nullable
   private List<epi<T>> b;
   private final Set<epj<?>> c = new ObjectOpenCustomHashSet(epj.c);
   @Nullable
   private BiConsumer<epe<T>, epj<T>> d;

   public epe() {
   }

   public epe(List<epi<T>> $$0) {
      this.b = $$0;

      for (epi<T> $$1 : $$0) {
         this.c.add(epj.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<epe<T>, epj<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public epj<T> b() {
      return this.a.peek();
   }

   @Nullable
   public epj<T> c() {
      epj<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(epj<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(epj<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hz $$0, T $$1) {
      return this.c.contains(epj.a($$1, $$0));
   }

   public void a(Predicate<epj<T>> $$0) {
      Iterator<epj<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         epj<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<epj<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public tc a(long $$0, Function<T, String> $$1) {
      tc $$2 = new tc();
      if (this.b != null) {
         for (epi<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (epj<T> $$4 : this.a) {
         $$2.add(epi.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (epi<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> epe<T> a(tc $$0, Function<String, Optional<T>> $$1, cuu $$2) {
      Builder<epi<T>> $$3 = ImmutableList.builder();
      epi.a($$0, $$1, $$2, $$3::add);
      return new epe<>($$3.build());
   }
}
