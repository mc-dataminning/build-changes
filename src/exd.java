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

public class exd<T> implements exj<T>, exl<T> {
   private final Queue<exi<T>> a = new PriorityQueue<>(exi.a);
   @Nullable
   private List<exh<T>> b;
   private final Set<exi<?>> c = new ObjectOpenCustomHashSet(exi.c);
   @Nullable
   private BiConsumer<exd<T>, exi<T>> d;

   public exd() {
   }

   public exd(List<exh<T>> $$0) {
      this.b = $$0;

      for (exh<T> $$1 : $$0) {
         this.c.add(exi.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<exd<T>, exi<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public exi<T> b() {
      return this.a.peek();
   }

   @Nullable
   public exi<T> c() {
      exi<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(exi<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(exi<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.c.contains(exi.a($$1, $$0));
   }

   public void a(Predicate<exi<T>> $$0) {
      Iterator<exi<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         exi<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<exi<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   public uy a(long $$0, Function<T, String> $$1) {
      uy $$2 = new uy();
      if (this.b != null) {
         for (exh<T> $$3 : this.b) {
            $$2.add($$3.a($$1));
         }
      }

      for (exi<T> $$4 : this.a) {
         $$2.add(exh.a($$4, $$1, $$0));
      }

      return $$2;
   }

   public void a(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (exh<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> exd<T> a(uy $$0, Function<String, Optional<T>> $$1, dbf $$2) {
      Builder<exh<T>> $$3 = ImmutableList.builder();
      exh.a($$0, $$1, $$2, $$3::add);
      return new exd<>($$3.build());
   }
}
