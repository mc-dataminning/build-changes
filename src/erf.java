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

public class erf<T> implements erl<T>, ern<T> {
   private final Queue<erk<T>> a = new PriorityQueue<>(erk.a);
   @Nullable
   private List<erj<T>> b;
   private final Set<erk<?>> c = new ObjectOpenCustomHashSet(erk.c);
   @Nullable
   private BiConsumer<erf<T>, erk<T>> d;

   public erf() {
   }

   public erf(List<erj<T>> $$0) {
      this.b = $$0;

      for (erj<T> $$1 : $$0) {
         this.c.add(erk.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<erf<T>, erk<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public erk<T> b() {
      return this.a.peek();
   }

   @Nullable
   public erk<T> c() {
      erk<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(erk<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(erk<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.c.contains(erk.a($$1, $$0));
   }

   public void a(Predicate<erk<T>> $$0) {
      Iterator<erk<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         erk<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<erk<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public tg a(long $$0, Function<T, String> $$1) {
      tg $$2 = new tg();
      if (this.b != null) {
         for (erj<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (erk<T> $$4 : this.a) {
         $$2.add(erj.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (erj<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> erf<T> a(tg $$0, Function<String, Optional<T>> $$1, cwi $$2) {
      Builder<erj<T>> $$3 = ImmutableList.builder();
      erj.a($$0, $$1, $$2, $$3::add);
      return new erf<>($$3.build());
   }
}
