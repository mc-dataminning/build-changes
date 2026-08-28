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

public class fgd<T> implements fgj<T>, fgl<T> {
   private final Queue<fgi<T>> a = new PriorityQueue<>(fgi.a);
   @Nullable
   private List<fgh<T>> b;
   private final Set<fgi<?>> c = new ObjectOpenCustomHashSet(fgi.c);
   @Nullable
   private BiConsumer<fgd<T>, fgi<T>> d;

   public fgd() {
   }

   public fgd(List<fgh<T>> $$0) {
      this.b = $$0;

      for (fgh<T> $$1 : $$0) {
         this.c.add(fgi.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<fgd<T>, fgi<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fgi<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fgi<T> c() {
      fgi<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fgi<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fgi<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.c.contains(fgi.a($$1, $$0));
   }

   public void a(Predicate<fgi<T>> $$0) {
      Iterator<fgi<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fgi<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fgi<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fgh<T>> a(long $$0) {
      List<fgh<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fgi<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public uf a(long $$0, Function<T, String> $$1) {
      uf $$2 = new uf();

      for (fgh<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fgh<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> fgd<T> a(uf $$0, Function<String, Optional<T>> $$1, dih $$2) {
      return new fgd<>(fgh.a($$0, $$1, $$2));
   }
}
