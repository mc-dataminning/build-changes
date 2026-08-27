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

public class etv<T> implements eub<T>, eud<T> {
   private final Queue<eua<T>> a = new PriorityQueue<>(eua.a);
   @Nullable
   private List<etz<T>> b;
   private final Set<eua<?>> c = new ObjectOpenCustomHashSet(eua.c);
   @Nullable
   private BiConsumer<etv<T>, eua<T>> d;

   public etv() {
   }

   public etv(List<etz<T>> $$0) {
      this.b = $$0;

      for (etz<T> $$1 : $$0) {
         this.c.add(eua.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<etv<T>, eua<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public eua<T> b() {
      return this.a.peek();
   }

   @Nullable
   public eua<T> c() {
      eua<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(eua<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(eua<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(id $$0, T $$1) {
      return this.c.contains(eua.a($$1, $$0));
   }

   public void a(Predicate<eua<T>> $$0) {
      Iterator<eua<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         eua<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<eua<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public tu a(long $$0, Function<T, String> $$1) {
      tu $$2 = new tu();
      if (this.b != null) {
         for (etz<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (eua<T> $$4 : this.a) {
         $$2.add(etz.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (etz<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> etv<T> a(tu $$0, Function<String, Optional<T>> $$1, cyn $$2) {
      Builder<etz<T>> $$3 = ImmutableList.builder();
      etz.a($$0, $$1, $$2, $$3::add);
      return new etv<>($$3.build());
   }
}
