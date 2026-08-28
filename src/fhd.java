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

public class fhd<T> implements fhj<T>, fhl<T> {
   private final Queue<fhi<T>> a = new PriorityQueue<>(fhi.a);
   @Nullable
   private List<fhh<T>> b;
   private final Set<fhi<?>> c = new ObjectOpenCustomHashSet(fhi.c);
   @Nullable
   private BiConsumer<fhd<T>, fhi<T>> d;

   public fhd() {
   }

   public fhd(List<fhh<T>> $$0) {
      this.b = $$0;

      for (fhh<T> $$1 : $$0) {
         this.c.add(fhi.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fhd<T>, fhi<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fhi<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fhi<T> c() {
      fhi<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fhi<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fhi<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.c.contains(fhi.a($$1, $$0));
   }

   public void a(Predicate<fhi<T>> $$0) {
      Iterator<fhi<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fhi<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fhi<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fhh<T>> a(long $$0) {
      List<fhh<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fhi<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fhh<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }
}
