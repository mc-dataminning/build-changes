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

public class ejm<T> implements ejs<T>, eju<T> {
   private final Queue<ejr<T>> a = new PriorityQueue<>(ejr.a);
   @Nullable
   private List<ejq<T>> b;
   private final Set<ejr<?>> c = new ObjectOpenCustomHashSet(ejr.c);
   @Nullable
   private BiConsumer<ejm<T>, ejr<T>> d;

   public ejm() {
   }

   public ejm(List<ejq<T>> $$0) {
      this.b = $$0;

      for (ejq<T> $$1 : $$0) {
         this.c.add(ejr.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ejm<T>, ejr<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ejr<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ejr<T> c() {
      ejr<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ejr<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ejr<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.c.contains(ejr.a($$1, $$0));
   }

   public void a(Predicate<ejr<T>> $$0) {
      Iterator<ejr<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ejr<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ejr<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public rz a(long $$0, Function<T, String> $$1) {
      rz $$2 = new rz();
      if (this.b != null) {
         for (ejq<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (ejr<T> $$4 : this.a) {
         $$2.add(ejq.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ejq<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ejm<T> a(rz $$0, Function<String, Optional<T>> $$1, cqg $$2) {
      Builder<ejq<T>> $$3 = ImmutableList.builder();
      ejq.a($$0, $$1, $$2, $$3::add);
      return new ejm<>($$3.build());
   }
}
