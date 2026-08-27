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

public class elb<T> implements elh<T>, elj<T> {
   private final Queue<elg<T>> a = new PriorityQueue<>(elg.a);
   @Nullable
   private List<elf<T>> b;
   private final Set<elg<?>> c = new ObjectOpenCustomHashSet(elg.c);
   @Nullable
   private BiConsumer<elb<T>, elg<T>> d;

   public elb() {
   }

   public elb(List<elf<T>> $$0) {
      this.b = $$0;

      for (elf<T> $$1 : $$0) {
         this.c.add(elg.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<elb<T>, elg<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public elg<T> b() {
      return this.a.peek();
   }

   @Nullable
   public elg<T> c() {
      elg<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(elg<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(elg<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.c.contains(elg.a($$1, $$0));
   }

   public void a(Predicate<elg<T>> $$0) {
      Iterator<elg<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         elg<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<elg<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public sf a(long $$0, Function<T, String> $$1) {
      sf $$2 = new sf();
      if (this.b != null) {
         for (elf<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (elg<T> $$4 : this.a) {
         $$2.add(elf.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (elf<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> elb<T> a(sf $$0, Function<String, Optional<T>> $$1, crh $$2) {
      Builder<elf<T>> $$3 = ImmutableList.builder();
      elf.a($$0, $$1, $$2, $$3::add);
      return new elb<>($$3.build());
   }
}
