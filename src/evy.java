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

public class evy<T> implements ewe<T>, ewg<T> {
   private final Queue<ewd<T>> a = new PriorityQueue<>(ewd.a);
   @Nullable
   private List<ewc<T>> b;
   private final Set<ewd<?>> c = new ObjectOpenCustomHashSet(ewd.c);
   @Nullable
   private BiConsumer<evy<T>, ewd<T>> d;

   public evy() {
   }

   public evy(List<ewc<T>> $$0) {
      this.b = $$0;

      for (ewc<T> $$1 : $$0) {
         this.c.add(ewd.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<evy<T>, ewd<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ewd<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ewd<T> c() {
      ewd<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ewd<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ewd<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(io $$0, T $$1) {
      return this.c.contains(ewd.a($$1, $$0));
   }

   public void a(Predicate<ewd<T>> $$0) {
      Iterator<ewd<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ewd<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ewd<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public uj a(long $$0, Function<T, String> $$1) {
      uj $$2 = new uj();
      if (this.b != null) {
         for (ewc<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (ewd<T> $$4 : this.a) {
         $$2.add(ewc.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ewc<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> evy<T> a(uj $$0, Function<String, Optional<T>> $$1, dag $$2) {
      Builder<ewc<T>> $$3 = ImmutableList.builder();
      ewc.a($$0, $$1, $$2, $$3::add);
      return new evy<>($$3.build());
   }
}
