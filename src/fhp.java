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

public class fhp<T> implements fhv<T>, fhx<T> {
   private final Queue<fhu<T>> a = new PriorityQueue<>(fhu.a);
   @Nullable
   private List<fht<T>> b;
   private final Set<fhu<?>> c = new ObjectOpenCustomHashSet(fhu.c);
   @Nullable
   private BiConsumer<fhp<T>, fhu<T>> d;

   public fhp() {
   }

   public fhp(List<fht<T>> $$0) {
      this.b = $$0;

      for (fht<T> $$1 : $$0) {
         this.c.add(fhu.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fhp<T>, fhu<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fhu<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fhu<T> c() {
      fhu<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fhu<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fhu<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iw $$0, T $$1) {
      return this.c.contains(fhu.a($$1, $$0));
   }

   public void a(Predicate<fhu<T>> $$0) {
      Iterator<fhu<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fhu<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fhu<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fht<T>> a(long $$0) {
      List<fht<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fhu<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fht<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }
}
