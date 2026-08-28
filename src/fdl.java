import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayList;
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

public class fdl<T> implements fdr<T>, fdt<T> {
   private final Queue<fdq<T>> a = new PriorityQueue<>(fdq.a);
   @Nullable
   private List<fdp<T>> b;
   private final Set<fdq<?>> c = new ObjectOpenCustomHashSet(fdq.c);
   @Nullable
   private BiConsumer<fdl<T>, fdq<T>> d;

   public fdl() {
   }

   public fdl(List<fdp<T>> $$0) {
      this.b = $$0;

      for (fdp<T> $$1 : $$0) {
         this.c.add(fdq.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fdl<T>, fdq<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fdq<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fdq<T> c() {
      fdq<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fdq<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fdq<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.c.contains(fdq.a($$1, $$0));
   }

   public void a(Predicate<fdq<T>> $$0) {
      Iterator<fdq<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fdq<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fdq<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fdp<T>> a(long $$0) {
      List<fdp<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fdq<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public vd a(long $$0, Function<T, String> $$1) {
      vd $$2 = new vd();

      for (fdp<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fdp<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fdl<T> a(vd $$0, Function<String, Optional<T>> $$1, dgo $$2) {
      return new fdl<>(fdp.a($$0, $$1, $$2));
   }
}
