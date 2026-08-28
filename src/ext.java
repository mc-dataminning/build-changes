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

public class ext<T> implements exz<T>, eyb<T> {
   private final Queue<exy<T>> a = new PriorityQueue<>(exy.a);
   @Nullable
   private List<exx<T>> b;
   private final Set<exy<?>> c = new ObjectOpenCustomHashSet(exy.c);
   @Nullable
   private BiConsumer<ext<T>, exy<T>> d;

   public ext() {
   }

   public ext(List<exx<T>> $$0) {
      this.b = $$0;

      for (exx<T> $$1 : $$0) {
         this.c.add(exy.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ext<T>, exy<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exy<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exy<T> c() {
      exy<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exy<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exy<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.c.contains(exy.a($$1, $$0));
   }

   public void a(Predicate<exy<T>> $$0) {
      Iterator<exy<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exy<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exy<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ud a(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();
      if (this.b != null) {
         for (exx<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exy<T> $$4 : this.a) {
         $$2.add(exx.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exx<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ext<T> a(ud $$0, Function<String, Optional<T>> $$1, dbn $$2) {
      Builder<exx<T>> $$3 = ImmutableList.builder();
      exx.a($$0, $$1, $$2, $$3::add);
      return new ext<>($$3.build());
   }
}
