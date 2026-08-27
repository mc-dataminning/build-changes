import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eix<T> implements eja<T>, ejc<T> {
   private final List<eiy<T>> a = Lists.newArrayList();
   private final Set<eiy<?>> b = new ObjectOpenCustomHashSet(eiy.a);

   @Override
   public void a(eiz<T> $$0) {
      eiy<T> $$1 = new eiy<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eiy<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.b.contains(eiy.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rr b(long $$0, Function<T, String> $$1) {
      re $$2 = new re();

      for (eiy<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eiy<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eix<T> a(re $$0, Function<String, Optional<T>> $$1, cpc $$2) {
      eix<T> $$3 = new eix<>();
      eiy.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
