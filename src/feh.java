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

public class feh<T> implements fen<T>, fep<T> {
   private final Queue<fem<T>> a = new PriorityQueue<>(fem.a);
   @Nullable
   private List<fel<T>> b;
   private final Set<fem<?>> c = new ObjectOpenCustomHashSet(fem.c);
   @Nullable
   private BiConsumer<feh<T>, fem<T>> d;

   public feh() {
   }

   public feh(List<fel<T>> $$0) {
      this.b = $$0;

      for (fel<T> $$1 : $$0) {
         this.c.add(fem.a($$1.a(), $$1.b()));
      }
   }

   public void a(@Nullable BiConsumer<feh<T>, fem<T>> $$0) {
      this.d = $$0;
   }

   @Nullable
   public fem<T> b() {
      return this.a.peek();
   }

   @Nullable
   public fem<T> c() {
      fem<T> $$0 = this.a.poll();
      if ($$0 != null) {
         this.c.remove($$0);
      }

      return $$0;
   }

   @Override
   public void a(fem<T> $$0) {
      if (this.c.add($$0)) {
         this.b($$0);
      }
   }

   private void b(fem<T> $$0) {
      this.a.add($$0);
      if (this.d != null) {
         this.d.accept(this, $$0);
      }
   }

   @Override
   public boolean a(jj $$0, T $$1) {
      return this.c.contains(fem.a($$1, $$0));
   }

   public void a(Predicate<fem<T>> $$0) {
      Iterator<fem<T>> $$1 = this.a.iterator();

      while ($$1.hasNext()) {
         fem<T> $$2 = $$1.next();
         if ($$0.test($$2)) {
            $$1.remove();
            this.c.remove($$2);
         }
      }
   }

   public Stream<fem<T>> d() {
      return this.a.stream();
   }

   @Override
   public int a() {
      return this.a.size() + (this.b != null ? this.b.size() : 0);
   }

   @Override
   public List<fel<T>> a(long $$0) {
      List<fel<T>> $$1 = new ArrayList<>(this.a.size());
      if (this.b != null) {
         $$1.addAll(this.b);
      }

      for (fem<T> $$2 : this.a) {
         $$1.add($$2.a($$0));
      }

      return $$1;
   }

   public uc a(long $$0, Function<T, String> $$1) {
      uc $$2 = new uc();

      for (fel<T> $$4 : this.a($$0)) {
         $$2.add($$4.a($$1));
      }

      return $$2;
   }

   public void b(long $$0) {
      if (this.b != null) {
         int $$1 = -this.b.size();

         for (fel<T> $$2 : this.b) {
            this.b($$2.a($$0, (long)($$1++)));
         }
      }

      this.b = null;
   }

   public static <T> feh<T> a(uc $$0, Function<String, Optional<T>> $$1, dgw $$2) {
      return new feh<>(fel.a($$0, $$1, $$2));
   }
}
