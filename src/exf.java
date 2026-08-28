import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exf<T> implements exi<T>, exk<T> {
   private final List<exg<T>> a = Lists.newArrayList();
   private final Set<exg<?>> b = new ObjectOpenCustomHashSet(exg.a);

   @Override
   public void a(exh<T> $$0) {
      exg<T> $$1 = new exg<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exg<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exg.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vo b(long $$0, Function<T, String> $$1) {
      ux $$2 = new ux();

      for (exg<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exg<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exf<T> a(ux $$0, Function<String, Optional<T>> $$1, dbe $$2) {
      exf<T> $$3 = new exf<>();
      exg.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
