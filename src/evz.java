import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class evz<T> implements ewc<T>, ewe<T> {
   private final List<ewa<T>> a = Lists.newArrayList();
   private final Set<ewa<?>> b = new ObjectOpenCustomHashSet(ewa.a);

   @Override
   public void a(ewb<T> $$0) {
      ewa<T> $$1 = new ewa<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ewa<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(io $$0, T $$1) {
      return this.b.contains(ewa.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public va b(long $$0, Function<T, String> $$1) {
      uj $$2 = new uj();

      for (ewa<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<ewa<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> evz<T> a(uj $$0, Function<String, Optional<T>> $$1, dae $$2) {
      evz<T> $$3 = new evz<>();
      ewa.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
