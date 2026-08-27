import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eqk<T> implements eqn<T>, eqp<T> {
   private final List<eql<T>> a = Lists.newArrayList();
   private final Set<eql<?>> b = new ObjectOpenCustomHashSet(eql.a);

   @Override
   public void a(eqm<T> $$0) {
      eql<T> $$1 = new eql<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eql<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.b.contains(eql.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tv b(long $$0, Function<T, String> $$1) {
      te $$2 = new te();

      for (eql<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eql<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eqk<T> a(te $$0, Function<String, Optional<T>> $$1, cvl $$2) {
      eqk<T> $$3 = new eqk<>();
      eql.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
