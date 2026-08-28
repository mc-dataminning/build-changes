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

public class fgk<T> implements fgq<T>, fgs<T> {
   private final Queue<fgp<T>> a = new PriorityQueue<>(fgp.a);
   @Nullable
   private List<fgo<T>> b;
   private final Set<fgp<?>> c = new ObjectOpenCustomHashSet(fgp.c);
   @Nullable
   private BiConsumer<fgk<T>, fgp<T>> d;

   public fgk() {
   }

   public fgk(List<fgo<T>> $$0) {
      this.b = $$0;

      for (fgo<T> $$1 : $$0) {
         this.c.add(fgp.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fgk<T>, fgp<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fgp<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fgp<T> c() {
      fgp<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fgp<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fgp<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.c.contains(fgp.a($$1, $$0));
   }

   public void a(Predicate<fgp<T>> $$0) {
      Iterator<fgp<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fgp<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fgp<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fgo<T>> a(long $$0) {
      List<fgo<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fgp<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fgo<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }
}
