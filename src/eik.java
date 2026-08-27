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

public class eik<T> implements eiq<T>, eis<T> {
   private final Queue<eip<T>> a = new PriorityQueue<>(eip.a);
   @Nullable
   private List<eio<T>> b;
   private final Set<eip<?>> c = new ObjectOpenCustomHashSet(eip.c);
   @Nullable
   private BiConsumer<eik<T>, eip<T>> d;

   public eik() {
   }

   public eik(List<eio<T>> $$0) {
      this.b = $$0;

      for (eio<T> $$1 : $$0) {
         this.c.add(eip.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<eik<T>, eip<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eip<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eip<T> c() {
      eip<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eip<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eip<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(gu $$0, T $$1) {
      return this.c.contains(eip.a($$1, $$0));
   }

   public void a(Predicate<eip<T>> $$0) {
      Iterator<eip<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eip<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eip<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public qx a(long $$0, Function<T, String> $$1) {
      qx $$2 = new qx();
      if (this.b != null) {
         for (eio<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eip<T> $$4 : this.a) {
         $$2.add(eio.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (eio<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> eik<T> a(qx $$0, Function<String, Optional<T>> $$1, cos $$2) {
      Builder<eio<T>> $$3 = ImmutableList.builder();
      eio.a($$0, $$1, $$2, $$3::add);
      return new eik<>($$3.build());
   }
}
