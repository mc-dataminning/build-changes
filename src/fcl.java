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

public class fcl<T> implements fcr<T>, fct<T> {
   private final Queue<fcq<T>> a = new PriorityQueue<>(fcq.a);
   @Nullable
   private List<fcp<T>> b;
   private final Set<fcq<?>> c = new ObjectOpenCustomHashSet(fcq.c);
   @Nullable
   private BiConsumer<fcl<T>, fcq<T>> d;

   public fcl() {
   }

   public fcl(List<fcp<T>> $$0) {
      this.b = $$0;

      for (fcp<T> $$1 : $$0) {
         this.c.add(fcq.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fcl<T>, fcq<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fcq<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fcq<T> c() {
      fcq<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fcq<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fcq<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.c.contains(fcq.a($$1, $$0));
   }

   public void a(Predicate<fcq<T>> $$0) {
      Iterator<fcq<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fcq<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fcq<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fcp<T>> a(long $$0) {
      List<fcp<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fcq<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public tw a(long $$0, Function<T, String> $$1) {
      tw $$2 = new tw();

      for (fcp<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fcp<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fcl<T> a(tw $$0, Function<String, Optional<T>> $$1, dfm $$2) {
      return new fcl<>(fcp.a($$0, $$1, $$2));
   }
}
