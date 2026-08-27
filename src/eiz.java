import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eiz<T> implements ejc<T>, eje<T> {
   private final List<eja<T>> a = Lists.newArrayList();
   private final Set<eja<?>> b = new ObjectOpenCustomHashSet(eja.a);

   @Override
   public void a(ejb<T> $$0) {
      eja<T> $$1 = new eja<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eja<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.b.contains(eja.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rs b(long $$0, Function<T, String> $$1) {
      re $$2 = new re();

      for (eja<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eja<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eiz<T> a(re $$0, Function<String, Optional<T>> $$1, cpe $$2) {
      eiz<T> $$3 = new eiz<>();
      eja.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
