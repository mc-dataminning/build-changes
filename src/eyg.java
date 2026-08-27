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

public class eyg<T> implements eym<T>, eyo<T> {
   private final Queue<eyl<T>> a = new PriorityQueue<>(eyl.a);
   @Nullable
   private List<eyk<T>> b;
   private final Set<eyl<?>> c = new ObjectOpenCustomHashSet(eyl.c);
   @Nullable
   private BiConsumer<eyg<T>, eyl<T>> d;

   public eyg() {
   }

   public eyg(List<eyk<T>> $$0) {
      this.b = $$0;

      for (eyk<T> $$1 : $$0) {
         this.c.add(eyl.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eyg<T>, eyl<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eyl<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eyl<T> c() {
      eyl<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eyl<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eyl<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ir $$0, T $$1) {
      return this.c.contains(eyl.a($$1, $$0));
   }

   public void a(Predicate<eyl<T>> $$0) {
      Iterator<eyl<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eyl<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eyl<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public uq a(long $$0, Function<T, String> $$1) {
      uq $$2 = new uq();
      if (this.b != null) {
         for (eyk<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eyl<T> $$4 : this.a) {
         $$2.add(eyk.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eyk<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eyg<T> a(uq $$0, Function<String, Optional<T>> $$1, dbh $$2) {
      Builder<eyk<T>> $$3 = ImmutableList.builder();
      eyk.a($$0, $$1, $$2, $$3::add);
      return new eyg<>($$3.build());
   }
}
