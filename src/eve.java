import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eve<T> implements evh<T>, evj<T> {
   private final List<evf<T>> a = Lists.newArrayList();
   private final Set<evf<?>> b = new ObjectOpenCustomHashSet(evf.a);

   @Override
   public void a(evg<T> $$0) {
      evf<T> $$1 = new evf<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(evf<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(in $$0, T $$1) {
      return this.b.contains(evf.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public ux b(long $$0, Function<T, String> $$1) {
      ug $$2 = new ug();

      for (evf<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<evf<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eve<T> a(ug $$0, Function<String, Optional<T>> $$1, czk $$2) {
      eve<T> $$3 = new eve<>();
      evf.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
