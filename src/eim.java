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

public class eim<T> implements eis<T>, eiu<T> {
   private final Queue<eir<T>> a = new PriorityQueue<>(eir.a);
   @Nullable
   private List<eiq<T>> b;
   private final Set<eir<?>> c = new ObjectOpenCustomHashSet(eir.c);
   @Nullable
   private BiConsumer<eim<T>, eir<T>> d;

   public eim() {
   }

   public eim(List<eiq<T>> $$0) {
      this.b = $$0;

      for (eiq<T> $$1 : $$0) {
         this.c.add(eir.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eim<T>, eir<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eir<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eir<T> c() {
      eir<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eir<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eir<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gv $$0, T $$1) {
      return this.c.contains(eir.a($$1, $$0));
   }

   public void a(Predicate<eir<T>> $$0) {
      Iterator<eir<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eir<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eir<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public qy a(long $$0, Function<T, String> $$1) {
      qy $$2 = new qy();
      if (this.b != null) {
         for (eiq<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eir<T> $$4 : this.a) {
         $$2.add(eiq.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eiq<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eim<T> a(qy $$0, Function<String, Optional<T>> $$1, cor $$2) {
      Builder<eiq<T>> $$3 = ImmutableList.builder();
      eiq.a($$0, $$1, $$2, $$3::add);
      return new eim<>($$3.build());
   }
}
