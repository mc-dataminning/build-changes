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

public class ffv<T> implements fgb<T>, fgd<T> {
   private final Queue<fga<T>> a = new PriorityQueue<>(fga.a);
   @Nullable
   private List<ffz<T>> b;
   private final Set<fga<?>> c = new ObjectOpenCustomHashSet(fga.c);
   @Nullable
   private BiConsumer<ffv<T>, fga<T>> d;

   public ffv() {
   }

   public ffv(List<ffz<T>> $$0) {
      this.b = $$0;

      for (ffz<T> $$1 : $$0) {
         this.c.add(fga.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ffv<T>, fga<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fga<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fga<T> c() {
      fga<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fga<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fga<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.c.contains(fga.a($$1, $$0));
   }

   public void a(Predicate<fga<T>> $$0) {
      Iterator<fga<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fga<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fga<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<ffz<T>> a(long $$0) {
      List<ffz<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fga<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public uf a(long $$0, Function<T, String> $$1) {
      uf $$2 = new uf();

      for (ffz<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ffz<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ffv<T> a(uf $$0, Function<String, Optional<T>> $$1, dic $$2) {
      return new ffv<>(ffz.a($$0, $$1, $$2));
   }
}
