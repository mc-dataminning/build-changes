import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exe<T> implements exh<T>, exj<T> {
   private final List<exf<T>> a = Lists.newArrayList();
   private final Set<exf<?>> b = new ObjectOpenCustomHashSet(exf.a);

   @Override
   public void a(exg<T> $$0) {
      exf<T> $$1 = new exf<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exf<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exf.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vo b(long $$0, Function<T, String> $$1) {
      ux $$2 = new ux();

      for (exf<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exf<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exe<T> a(ux $$0, Function<String, Optional<T>> $$1, dbd $$2) {
      exe<T> $$3 = new exe<>();
      exf.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
