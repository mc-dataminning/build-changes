import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eyj<T> implements eym<T>, eyo<T> {
   private final List<eyk<T>> a = Lists.newArrayList();
   private final Set<eyk<?>> b = new ObjectOpenCustomHashSet(eyk.a);

   @Override
   public void a(eyl<T> $$0) {
      eyk<T> $$1 = new eyk<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eyk<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ir $$0, T $$1) {
      return this.b.contains(eyk.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vh b(long $$0, Function<T, String> $$1) {
      uq $$2 = new uq();

      for (eyk<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eyk<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eyj<T> a(uq $$0, Function<String, Optional<T>> $$1, dbh $$2) {
      eyj<T> $$3 = new eyj<>();
      eyk.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
