import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
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

public class emy<T> implements ene<T>, eng<T> {
   private final Queue<end<T>> a = new PriorityQueue<>(end.a);
   @Nullable
   private List<enc<T>> b;
   private final Set<end<?>> c = new ObjectOpenCustomHashSet(end.c);
   @Nullable
   private BiConsumer<emy<T>, end<T>> d;

   public emy() {
   }

   public emy(List<enc<T>> $$0) {
      this.b = $$0;

      for (enc<T> $$1 : $$0) {
         this.c.add(end.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<emy<T>, end<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public end<T> b() {
      return this.a.peek();
   }

   @Nullable
   public end<T> c() {
      end<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(end<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(end<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.c.contains(end.a($$1, $$0));
   }

   public void a(Predicate<end<T>> $$0) {
      Iterator<end<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         end<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<end<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public sr a(long $$0, Function<T, String> $$1) {
      sr $$2 = new sr();
      if (this.b != null) {
         for (enc<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (end<T> $$4 : this.a) {
         $$2.add(enc.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (enc<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> emy<T> a(sr $$0, Function<String, Optional<T>> $$1, csp $$2) {
      Builder<enc<T>> $$3 = ImmutableList.builder();
      enc.a($$0, $$1, $$2, $$3::add);
      return new emy<>($$3.build());
   }
}
