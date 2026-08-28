import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exb<T> implements exe<T>, exg<T> {
   private final List<exc<T>> a = Lists.newArrayList();
   private final Set<exc<?>> b = new ObjectOpenCustomHashSet(exc.a);

   @Override
   public void a(exd<T> $$0) {
      exc<T> $$1 = new exc<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exc<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iz $$0, T $$1) {
      return this.b.contains(exc.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public vo b(long $$0, Function<T, String> $$1) {
      ux $$2 = new ux();

      for (exc<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exc<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exb<T> a(ux $$0, Function<String, Optional<T>> $$1, dba $$2) {
      exb<T> $$3 = new exb<>();
      exc.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
