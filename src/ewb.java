import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class ewb<T> implements ewe<T>, ewg<T> {
   private final List<ewc<T>> a = Lists.newArrayList();
   private final Set<ewc<?>> b = new ObjectOpenCustomHashSet(ewc.a);

   @Override
   public void a(ewd<T> $$0) {
      ewc<T> $$1 = new ewc<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ewc<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(io $$0, T $$1) {
      return this.b.contains(ewc.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public va b(long $$0, Function<T, String> $$1) {
      uj $$2 = new uj();

      for (ewc<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<ewc<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ewb<T> a(uj $$0, Function<String, Optional<T>> $$1, dag $$2) {
      ewb<T> $$3 = new ewb<>();
      ewc.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
