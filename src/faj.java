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

public class faj<T> implements fap<T>, far<T> {
   private final Queue<fao<T>> a = new PriorityQueue<>(fao.a);
   @Nullable
   private List<fan<T>> b;
   private final Set<fao<?>> c = new ObjectOpenCustomHashSet(fao.c);
   @Nullable
   private BiConsumer<faj<T>, fao<T>> d;

   public faj() {
   }

   public faj(List<fan<T>> $$0) {
      this.b = $$0;

      for (fan<T> $$1 : $$0) {
         this.c.add(fao.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<faj<T>, fao<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fao<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fao<T> c() {
      fao<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fao<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fao<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jf $$0, T $$1) {
      return this.c.contains(fao.a($$1, $$0));
   }

   public void a(Predicate<fao<T>> $$0) {
      Iterator<fao<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fao<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fao<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fan<T>> a(long $$0) {
      List<fan<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fao<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public um a(long $$0, Function<T, String> $$1) {
      um $$2 = new um();

      for (fan<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fan<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> faj<T> a(um $$0, Function<String, Optional<T>> $$1, ddp $$2) {
      return new faj<>(fan.a($$0, $$1, $$2));
   }
}
