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

public class fbe<T> implements fbk<T>, fbm<T> {
   private final Queue<fbj<T>> a = new PriorityQueue<>(fbj.a);
   @Nullable
   private List<fbi<T>> b;
   private final Set<fbj<?>> c = new ObjectOpenCustomHashSet(fbj.c);
   @Nullable
   private BiConsumer<fbe<T>, fbj<T>> d;

   public fbe() {
   }

   public fbe(List<fbi<T>> $$0) {
      this.b = $$0;

      for (fbi<T> $$1 : $$0) {
         this.c.add(fbj.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fbe<T>, fbj<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fbj<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fbj<T> c() {
      fbj<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fbj<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fbj<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.c.contains(fbj.a($$1, $$0));
   }

   public void a(Predicate<fbj<T>> $$0) {
      Iterator<fbj<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fbj<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fbj<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fbi<T>> a(long $$0) {
      List<fbi<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fbj<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public ut a(long $$0, Function<T, String> $$1) {
      ut $$2 = new ut();

      for (fbi<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fbi<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fbe<T> a(ut $$0, Function<String, Optional<T>> $$1, del $$2) {
      return new fbe<>(fbi.a($$0, $$1, $$2));
   }
}
