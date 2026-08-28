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

public class eym<T> implements eys<T>, eyu<T> {
   private final Queue<eyr<T>> a = new PriorityQueue<>(eyr.a);
   @Nullable
   private List<eyq<T>> b;
   private final Set<eyr<?>> c = new ObjectOpenCustomHashSet(eyr.c);
   @Nullable
   private BiConsumer<eym<T>, eyr<T>> d;

   public eym() {
   }

   public eym(List<eyq<T>> $$0) {
      this.b = $$0;

      for (eyq<T> $$1 : $$0) {
         this.c.add(eyr.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eym<T>, eyr<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eyr<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eyr<T> c() {
      eyr<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eyr<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eyr<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.c.contains(eyr.a($$1, $$0));
   }

   public void a(Predicate<eyr<T>> $$0) {
      Iterator<eyr<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eyr<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eyr<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public uh a(long $$0, Function<T, String> $$1) {
      uh $$2 = new uh();
      if (this.b != null) {
         for (eyq<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eyr<T> $$4 : this.a) {
         $$2.add(eyq.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eyq<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eym<T> a(uh $$0, Function<String, Optional<T>> $$1, dcd $$2) {
      Builder<eyq<T>> $$3 = ImmutableList.builder();
      eyq.a($$0, $$1, $$2, $$3::add);
      return new eym<>($$3.build());
   }
}
