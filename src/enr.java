import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class enr<T> implements enu<T>, enw<T> {
   private final List<ens<T>> a = Lists.newArrayList();
   private final Set<ens<?>> b = new ObjectOpenCustomHashSet(ens.a);

   @Override
   public void a(ent<T> $$0) {
      ens<T> $$1 = new ens<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ens<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.b.contains(ens.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tl b(long $$0, Function<T, String> $$1) {
      su $$2 = new su();

      for (ens<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<ens<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> enr<T> a(su $$0, Function<String, Optional<T>> $$1, cte $$2) {
      enr<T> $$3 = new enr<>();
      ens.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
