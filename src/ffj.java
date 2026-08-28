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

public class ffj<T> implements ffp<T>, ffr<T> {
   private final Queue<ffo<T>> a = new PriorityQueue<>(ffo.a);
   @Nullable
   private List<ffn<T>> b;
   private final Set<ffo<?>> c = new ObjectOpenCustomHashSet(ffo.c);
   @Nullable
   private BiConsumer<ffj<T>, ffo<T>> d;

   public ffj() {
   }

   public ffj(List<ffn<T>> $$0) {
      this.b = $$0;

      for (ffn<T> $$1 : $$0) {
         this.c.add(ffo.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<ffj<T>, ffo<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public ffo<T> b() {
      return this.a.peek();
   }

   @Nullable
   public ffo<T> c() {
      ffo<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(ffo<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(ffo<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.c.contains(ffo.a($$1, $$0));
   }

   public void a(Predicate<ffo<T>> $$0) {
      Iterator<ffo<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         ffo<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<ffo<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<ffn<T>> a(long $$0) {
      List<ffn<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (ffo<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public ud a(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();

      for (ffn<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (ffn<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> ffj<T> a(ud $$0, Function<String, Optional<T>> $$1, dhw $$2) {
      return new ffj<>(ffn.a($$0, $$1, $$2));
   }
}
