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

public class eur<T> implements eux<T>, euz<T> {
   private final Queue<euw<T>> a = new PriorityQueue<>(euw.a);
   @Nullable
   private List<euv<T>> b;
   private final Set<euw<?>> c = new ObjectOpenCustomHashSet(euw.c);
   @Nullable
   private BiConsumer<eur<T>, euw<T>> d;

   public eur() {
   }

   public eur(List<euv<T>> $$0) {
      this.b = $$0;

      for (euv<T> $$1 : $$0) {
         this.c.add(euw.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eur<T>, euw<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public euw<T> b() {
      return this.a.peek();
   }

   @Nullable
   public euw<T> c() {
      euw<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(euw<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(euw<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(im $$0, T $$1) {
      return this.c.contains(euw.a($$1, $$0));
   }

   public void a(Predicate<euw<T>> $$0) {
      Iterator<euw<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         euw<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<euw<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ue a(long $$0, Function<T, String> $$1) {
      ue $$2 = new ue();
      if (this.b != null) {
         for (euv<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (euw<T> $$4 : this.a) {
         $$2.add(euv.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (euv<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eur<T> a(ue $$0, Function<String, Optional<T>> $$1, czb $$2) {
      Builder<euv<T>> $$3 = ImmutableList.builder();
      euv.a($$0, $$1, $$2, $$3::add);
      return new eur<>($$3.build());
   }
}
