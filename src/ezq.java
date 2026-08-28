import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.ArrayList;
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

public class ezq<T> implements ezw<T>, ezy<T> {
   private final Queue<ezv<T>> a = new PriorityQueue<>(ezv.a);
   @Nullable
   private List<ezu<T>> b;
   private final Set<ezv<?>> c = new ObjectOpenCustomHashSet(ezv.c);
   @Nullable
   private BiConsumer<ezq<T>, ezv<T>> d;

   public ezq() {
   }

   public ezq(List<ezu<T>> $$0) {
      this.b = $$0;

      for (ezu<T> $$1 : $$0) {
         this.c.add(ezv.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ezq<T>, ezv<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ezv<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ezv<T> c() {
      ezv<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ezv<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ezv<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(je $$0, T $$1) {
      return this.c.contains(ezv.a($$1, $$0));
   }

   public void a(Predicate<ezv<T>> $$0) {
      Iterator<ezv<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ezv<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ezv<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<ezu<T>> a(long $$0) {
      List<ezu<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (ezv<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public ul a(long $$0, Function<T, String> $$1) {
      ul $$2 = new ul();

      for (ezu<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ezu<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ezq<T> a(ul $$0, Function<String, Optional<T>> $$1, dcy $$2) {
      return new ezq<>(ezu.a($$0, $$1, $$2));
   }
}
