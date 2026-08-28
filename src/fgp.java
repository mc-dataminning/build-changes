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

public class fgp<T> implements fgv<T>, fgx<T> {
   private final Queue<fgu<T>> a = new PriorityQueue<>(fgu.a);
   @Nullable
   private List<fgt<T>> b;
   private final Set<fgu<?>> c = new ObjectOpenCustomHashSet(fgu.c);
   @Nullable
   private BiConsumer<fgp<T>, fgu<T>> d;

   public fgp() {
   }

   public fgp(List<fgt<T>> $$0) {
      this.b = $$0;

      for (fgt<T> $$1 : $$0) {
         this.c.add(fgu.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fgp<T>, fgu<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fgu<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fgu<T> c() {
      fgu<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fgu<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fgu<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.c.contains(fgu.a($$1, $$0));
   }

   public void a(Predicate<fgu<T>> $$0) {
      Iterator<fgu<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fgu<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fgu<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fgt<T>> a(long $$0) {
      List<fgt<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fgu<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fgt<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }
}
