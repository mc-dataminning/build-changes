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

public class exr<T> implements exx<T>, exz<T> {
   private final Queue<exw<T>> a = new PriorityQueue<>(exw.a);
   @Nullable
   private List<exv<T>> b;
   private final Set<exw<?>> c = new ObjectOpenCustomHashSet(exw.c);
   @Nullable
   private BiConsumer<exr<T>, exw<T>> d;

   public exr() {
   }

   public exr(List<exv<T>> $$0) {
      this.b = $$0;

      for (exv<T> $$1 : $$0) {
         this.c.add(exw.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exr<T>, exw<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exw<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exw<T> c() {
      exw<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exw<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exw<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.c.contains(exw.a($$1, $$0));
   }

   public void a(Predicate<exw<T>> $$0) {
      Iterator<exw<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exw<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exw<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ud a(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();
      if (this.b != null) {
         for (exv<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exw<T> $$4 : this.a) {
         $$2.add(exv.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exv<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exr<T> a(ud $$0, Function<String, Optional<T>> $$1, dbm $$2) {
      Builder<exv<T>> $$3 = ImmutableList.builder();
      exv.a($$0, $$1, $$2, $$3::add);
      return new exr<>($$3.build());
   }
}
