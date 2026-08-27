import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eri<T> implements erl<T>, ern<T> {
   private final List<erj<T>> a = Lists.newArrayList();
   private final Set<erj<?>> b = new ObjectOpenCustomHashSet(erj.a);

   @Override
   public void a(erk<T> $$0) {
      erj<T> $$1 = new erj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(erj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.b.contains(erj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tx b(long $$0, Function<T, String> $$1) {
      tg $$2 = new tg();

      for (erj<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<erj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eri<T> a(tg $$0, Function<String, Optional<T>> $$1, cwi $$2) {
      eri<T> $$3 = new eri<>();
      erj.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
