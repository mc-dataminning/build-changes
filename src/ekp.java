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

public class ekp<T> implements ekv<T>, ekx<T> {
   private final Queue<eku<T>> a = new PriorityQueue<>(eku.a);
   @Nullable
   private List<ekt<T>> b;
   private final Set<eku<?>> c = new ObjectOpenCustomHashSet(eku.c);
   @Nullable
   private BiConsumer<ekp<T>, eku<T>> d;

   public ekp() {
   }

   public ekp(List<ekt<T>> $$0) {
      this.b = $$0;

      for (ekt<T> $$1 : $$0) {
         this.c.add(eku.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ekp<T>, eku<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eku<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eku<T> c() {
      eku<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eku<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eku<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.c.contains(eku.a($$1, $$0));
   }

   public void a(Predicate<eku<T>> $$0) {
      Iterator<eku<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eku<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eku<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public sf a(long $$0, Function<T, String> $$1) {
      sf $$2 = new sf();
      if (this.b != null) {
         for (ekt<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eku<T> $$4 : this.a) {
         $$2.add(ekt.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ekt<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ekp<T> a(sf $$0, Function<String, Optional<T>> $$1, cqz $$2) {
      Builder<ekt<T>> $$3 = ImmutableList.builder();
      ekt.a($$0, $$1, $$2, $$3::add);
      return new ekp<>($$3.build());
   }
}
