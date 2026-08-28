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

public class exe<T> implements exk<T>, exm<T> {
   private final Queue<exj<T>> a = new PriorityQueue<>(exj.a);
   @Nullable
   private List<exi<T>> b;
   private final Set<exj<?>> c = new ObjectOpenCustomHashSet(exj.c);
   @Nullable
   private BiConsumer<exe<T>, exj<T>> d;

   public exe() {
   }

   public exe(List<exi<T>> $$0) {
      this.b = $$0;

      for (exi<T> $$1 : $$0) {
         this.c.add(exj.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exe<T>, exj<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exj<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exj<T> c() {
      exj<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exj<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exj<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.c.contains(exj.a($$1, $$0));
   }

   public void a(Predicate<exj<T>> $$0) {
      Iterator<exj<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exj<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exj<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public uy a(long $$0, Function<T, String> $$1) {
      uy $$2 = new uy();
      if (this.b != null) {
         for (exi<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exj<T> $$4 : this.a) {
         $$2.add(exi.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exi<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exe<T> a(uy $$0, Function<String, Optional<T>> $$1, dbg $$2) {
      Builder<exi<T>> $$3 = ImmutableList.builder();
      exi.a($$0, $$1, $$2, $$3::add);
      return new exe<>($$3.build());
   }
}
