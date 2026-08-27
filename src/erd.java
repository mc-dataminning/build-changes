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

public class erd<T> implements erj<T>, erl<T> {
   private final Queue<eri<T>> a = new PriorityQueue<>(eri.a);
   @Nullable
   private List<erh<T>> b;
   private final Set<eri<?>> c = new ObjectOpenCustomHashSet(eri.c);
   @Nullable
   private BiConsumer<erd<T>, eri<T>> d;

   public erd() {
   }

   public erd(List<erh<T>> $$0) {
      this.b = $$0;

      for (erh<T> $$1 : $$0) {
         this.c.add(eri.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<erd<T>, eri<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eri<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eri<T> c() {
      eri<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eri<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eri<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.c.contains(eri.a($$1, $$0));
   }

   public void a(Predicate<eri<T>> $$0) {
      Iterator<eri<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eri<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eri<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public tg a(long $$0, Function<T, String> $$1) {
      tg $$2 = new tg();
      if (this.b != null) {
         for (erh<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eri<T> $$4 : this.a) {
         $$2.add(erh.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (erh<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> erd<T> a(tg $$0, Function<String, Optional<T>> $$1, cwg $$2) {
      Builder<erh<T>> $$3 = ImmutableList.builder();
      erh.a($$0, $$1, $$2, $$3::add);
      return new erd<>($$3.build());
   }
}
