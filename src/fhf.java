import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class fhf<T> implements fhl<T>, fhn<T> {
   private final Queue<fhk<T>> a = new PriorityQueue<>(fhk.a);
   @Nullable
   private List<fhj<T>> b;
   private final Set<fhk<?>> c = new ObjectOpenCustomHashSet(fhk.c);
   @Nullable
   private BiConsumer<fhf<T>, fhk<T>> d;

   public fhf() {
   }

   public fhf(List<fhj<T>> $$0) {
      this.b = $$0;

      for (fhj<T> $$1 : $$0) {
         this.c.add(fhk.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fhf<T>, fhk<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fhk<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fhk<T> c() {
      fhk<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fhk<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fhk<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iw $$0, T $$1) {
      return this.c.contains(fhk.a($$1, $$0));
   }

   public void a(Predicate<fhk<T>> $$0) {
      Iterator<fhk<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fhk<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fhk<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fhj<T>> a(long $$0) {
      List<fhj<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fhk<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fhj<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }
}
