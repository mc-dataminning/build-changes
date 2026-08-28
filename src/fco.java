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

public class fco<T> implements fcu<T>, fcw<T> {
   private final Queue<fct<T>> a = new PriorityQueue<>(fct.a);
   @Nullable
   private List<fcs<T>> b;
   private final Set<fct<?>> c = new ObjectOpenCustomHashSet(fct.c);
   @Nullable
   private BiConsumer<fco<T>, fct<T>> d;

   public fco() {
   }

   public fco(List<fcs<T>> $$0) {
      this.b = $$0;

      for (fcs<T> $$1 : $$0) {
         this.c.add(fct.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fco<T>, fct<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fct<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fct<T> c() {
      fct<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fct<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fct<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.c.contains(fct.a($$1, $$0));
   }

   public void a(Predicate<fct<T>> $$0) {
      Iterator<fct<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fct<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fct<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fcs<T>> a(long $$0) {
      List<fcs<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fct<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public tw a(long $$0, Function<T, String> $$1) {
      tw $$2 = new tw();

      for (fcs<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fcs<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fco<T> a(tw $$0, Function<String, Optional<T>> $$1, dfp $$2) {
      return new fco<>(fcs.a($$0, $$1, $$2));
   }
}
