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

public class eio<T> implements eiu<T>, eiw<T> {
   private final Queue<eit<T>> a = new PriorityQueue<>(eit.a);
   @Nullable
   private List<eis<T>> b;
   private final Set<eit<?>> c = new ObjectOpenCustomHashSet(eit.c);
   @Nullable
   private BiConsumer<eio<T>, eit<T>> d;

   public eio() {
   }

   public eio(List<eis<T>> $$0) {
      this.b = $$0;

      for (eis<T> $$1 : $$0) {
         this.c.add(eit.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eio<T>, eit<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eit<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eit<T> c() {
      eit<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eit<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eit<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.c.contains(eit.a($$1, $$0));
   }

   public void a(Predicate<eit<T>> $$0) {
      Iterator<eit<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eit<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eit<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public rc a(long $$0, Function<T, String> $$1) {
      rc $$2 = new rc();
      if (this.b != null) {
         for (eis<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eit<T> $$4 : this.a) {
         $$2.add(eis.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eis<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eio<T> a(rc $$0, Function<String, Optional<T>> $$1, cpi $$2) {
      Builder<eis<T>> $$3 = ImmutableList.builder();
      eis.a($$0, $$1, $$2, $$3::add);
      return new eio<>($$3.build());
   }
}
