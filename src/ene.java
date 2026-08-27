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

public class ene<T> implements enk<T>, enm<T> {
   private final Queue<enj<T>> a = new PriorityQueue<>(enj.a);
   @Nullable
   private List<eni<T>> b;
   private final Set<enj<?>> c = new ObjectOpenCustomHashSet(enj.c);
   @Nullable
   private BiConsumer<ene<T>, enj<T>> d;

   public ene() {
   }

   public ene(List<eni<T>> $$0) {
      this.b = $$0;

      for (eni<T> $$1 : $$0) {
         this.c.add(enj.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ene<T>, enj<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public enj<T> b() {
      return this.a.peek();
   }

   @Nullable
   public enj<T> c() {
      enj<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(enj<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(enj<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.c.contains(enj.a($$1, $$0));
   }

   public void a(Predicate<enj<T>> $$0) {
      Iterator<enj<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         enj<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<enj<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public st a(long $$0, Function<T, String> $$1) {
      st $$2 = new st();
      if (this.b != null) {
         for (eni<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (enj<T> $$4 : this.a) {
         $$2.add(eni.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eni<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ene<T> a(st $$0, Function<String, Optional<T>> $$1, csv $$2) {
      Builder<eni<T>> $$3 = ImmutableList.builder();
      eni.a($$0, $$1, $$2, $$3::add);
      return new ene<>($$3.build());
   }
}
