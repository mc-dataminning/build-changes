import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class elj<T> implements elm<T>, elo<T> {
   private final List<elk<T>> a = Lists.newArrayList();
   private final Set<elk<?>> b = new ObjectOpenCustomHashSet(elk.a);

   @Override
   public void a(ell<T> $$0) {
      elk<T> $$1 = new elk<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(elk<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.b.contains(elk.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public ta b(long $$0, Function<T, String> $$1) {
      sj $$2 = new sj();

      for (elk<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<elk<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> elj<T> a(sj $$0, Function<String, Optional<T>> $$1, crm $$2) {
      elj<T> $$3 = new elj<>();
      elk.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
