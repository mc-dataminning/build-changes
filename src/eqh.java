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

public class eqh<T> implements eqn<T>, eqp<T> {
   private final Queue<eqm<T>> a = new PriorityQueue<>(eqm.a);
   @Nullable
   private List<eql<T>> b;
   private final Set<eqm<?>> c = new ObjectOpenCustomHashSet(eqm.c);
   @Nullable
   private BiConsumer<eqh<T>, eqm<T>> d;

   public eqh() {
   }

   public eqh(List<eql<T>> $$0) {
      this.b = $$0;

      for (eql<T> $$1 : $$0) {
         this.c.add(eqm.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eqh<T>, eqm<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eqm<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eqm<T> c() {
      eqm<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eqm<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eqm<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.c.contains(eqm.a($$1, $$0));
   }

   public void a(Predicate<eqm<T>> $$0) {
      Iterator<eqm<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eqm<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eqm<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public te a(long $$0, Function<T, String> $$1) {
      te $$2 = new te();
      if (this.b != null) {
         for (eql<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eqm<T> $$4 : this.a) {
         $$2.add(eql.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eql<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eqh<T> a(te $$0, Function<String, Optional<T>> $$1, cvl $$2) {
      Builder<eql<T>> $$3 = ImmutableList.builder();
      eql.a($$0, $$1, $$2, $$3::add);
      return new eqh<>($$3.build());
   }
}
