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

public class fba<T> implements fbg<T>, fbi<T> {
   private final Queue<fbf<T>> a = new PriorityQueue<>(fbf.a);
   @Nullable
   private List<fbe<T>> b;
   private final Set<fbf<?>> c = new ObjectOpenCustomHashSet(fbf.c);
   @Nullable
   private BiConsumer<fba<T>, fbf<T>> d;

   public fba() {
   }

   public fba(List<fbe<T>> $$0) {
      this.b = $$0;

      for (fbe<T> $$1 : $$0) {
         this.c.add(fbf.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fba<T>, fbf<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fbf<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fbf<T> c() {
      fbf<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fbf<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fbf<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.c.contains(fbf.a($$1, $$0));
   }

   public void a(Predicate<fbf<T>> $$0) {
      Iterator<fbf<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fbf<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fbf<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fbe<T>> a(long $$0) {
      List<fbe<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fbf<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public uq a(long $$0, Function<T, String> $$1) {
      uq $$2 = new uq();

      for (fbe<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fbe<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fba<T> a(uq $$0, Function<String, Optional<T>> $$1, deh $$2) {
      return new fba<>(fbe.a($$0, $$1, $$2));
   }
}
