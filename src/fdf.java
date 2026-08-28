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

public class fdf<T> implements fdl<T>, fdn<T> {
   private final Queue<fdk<T>> a = new PriorityQueue<>(fdk.a);
   @Nullable
   private List<fdj<T>> b;
   private final Set<fdk<?>> c = new ObjectOpenCustomHashSet(fdk.c);
   @Nullable
   private BiConsumer<fdf<T>, fdk<T>> d;

   public fdf() {
   }

   public fdf(List<fdj<T>> $$0) {
      this.b = $$0;

      for (fdj<T> $$1 : $$0) {
         this.c.add(fdk.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fdf<T>, fdk<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fdk<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fdk<T> c() {
      fdk<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fdk<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fdk<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.c.contains(fdk.a($$1, $$0));
   }

   public void a(Predicate<fdk<T>> $$0) {
      Iterator<fdk<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fdk<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fdk<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fdj<T>> a(long $$0) {
      List<fdj<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fdk<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public vd a(long $$0, Function<T, String> $$1) {
      vd $$2 = new vd();

      for (fdj<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fdj<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fdf<T> a(vd $$0, Function<String, Optional<T>> $$1, dgg $$2) {
      return new fdf<>(fdj.a($$0, $$1, $$2));
   }
}
