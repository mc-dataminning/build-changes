import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class etp<T> implements ets<T>, etu<T> {
   private final List<etq<T>> a = Lists.newArrayList();
   private final Set<etq<?>> b = new ObjectOpenCustomHashSet(etq.a);

   @Override
   public void a(etr<T> $$0) {
      etq<T> $$1 = new etq<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(etq<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.b.contains(etq.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uj b(long $$0, Function<T, String> $$1) {
      ts $$2 = new ts();

      for (etq<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<etq<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> etp<T> a(ts $$0, Function<String, Optional<T>> $$1, cye $$2) {
      etp<T> $$3 = new etp<>();
      etq.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
