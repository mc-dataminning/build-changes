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

public class exl<T> implements exr<T>, ext<T> {
   private final Queue<exq<T>> a = new PriorityQueue<>(exq.a);
   @Nullable
   private List<exp<T>> b;
   private final Set<exq<?>> c = new ObjectOpenCustomHashSet(exq.c);
   @Nullable
   private BiConsumer<exl<T>, exq<T>> d;

   public exl() {
   }

   public exl(List<exp<T>> $$0) {
      this.b = $$0;

      for (exp<T> $$1 : $$0) {
         this.c.add(exq.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exl<T>, exq<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exq<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exq<T> c() {
      exq<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exq<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exq<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.c.contains(exq.a($$1, $$0));
   }

   public void a(Predicate<exq<T>> $$0) {
      Iterator<exq<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exq<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exq<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ud a(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();
      if (this.b != null) {
         for (exp<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exq<T> $$4 : this.a) {
         $$2.add(exp.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exp<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exl<T> a(ud $$0, Function<String, Optional<T>> $$1, dbk $$2) {
      Builder<exp<T>> $$3 = ImmutableList.builder();
      exp.a($$0, $$1, $$2, $$3::add);
      return new exl<>($$3.build());
   }
}
