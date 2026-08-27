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

public class eip<T> implements eiv<T>, eix<T> {
   private final Queue<eiu<T>> a = new PriorityQueue<>(eiu.a);
   @Nullable
   private List<eit<T>> b;
   private final Set<eiu<?>> c = new ObjectOpenCustomHashSet(eiu.c);
   @Nullable
   private BiConsumer<eip<T>, eiu<T>> d;

   public eip() {
   }

   public eip(List<eit<T>> $$0) {
      this.b = $$0;

      for (eit<T> $$1 : $$0) {
         this.c.add(eiu.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eip<T>, eiu<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eiu<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eiu<T> c() {
      eiu<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eiu<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eiu<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.c.contains(eiu.a($$1, $$0));
   }

   public void a(Predicate<eiu<T>> $$0) {
      Iterator<eiu<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eiu<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eiu<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public ra a(long $$0, Function<T, String> $$1) {
      ra $$2 = new ra();
      if (this.b != null) {
         for (eit<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eiu<T> $$4 : this.a) {
         $$2.add(eit.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eit<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eip<T> a(ra $$0, Function<String, Optional<T>> $$1, cox $$2) {
      Builder<eit<T>> $$3 = ImmutableList.builder();
      eit.a($$0, $$1, $$2, $$3::add);
      return new eip<>($$3.build());
   }
}
