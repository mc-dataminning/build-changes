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

public class eyi<T> implements eyo<T>, eyq<T> {
   private final Queue<eyn<T>> a = new PriorityQueue<>(eyn.a);
   @Nullable
   private List<eym<T>> b;
   private final Set<eyn<?>> c = new ObjectOpenCustomHashSet(eyn.c);
   @Nullable
   private BiConsumer<eyi<T>, eyn<T>> d;

   public eyi() {
   }

   public eyi(List<eym<T>> $$0) {
      this.b = $$0;

      for (eym<T> $$1 : $$0) {
         this.c.add(eyn.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eyi<T>, eyn<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eyn<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eyn<T> c() {
      eyn<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eyn<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eyn<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.c.contains(eyn.a($$1, $$0));
   }

   public void a(Predicate<eyn<T>> $$0) {
      Iterator<eyn<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eyn<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eyn<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ug a(long $$0, Function<T, String> $$1) {
      ug $$2 = new ug();
      if (this.b != null) {
         for (eym<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eyn<T> $$4 : this.a) {
         $$2.add(eym.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eym<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eyi<T> a(ug $$0, Function<String, Optional<T>> $$1, dcb $$2) {
      Builder<eym<T>> $$3 = ImmutableList.builder();
      eym.a($$0, $$1, $$2, $$3::add);
      return new eyi<>($$3.build());
   }
}
