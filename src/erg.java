import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class erg<T> implements erj<T>, erl<T> {
   private final List<erh<T>> a = Lists.newArrayList();
   private final Set<erh<?>> b = new ObjectOpenCustomHashSet(erh.a);

   @Override
   public void a(eri<T> $$0) {
      erh<T> $$1 = new erh<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(erh<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ib $$0, T $$1) {
      return this.b.contains(erh.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public tx b(long $$0, Function<T, String> $$1) {
      tg $$2 = new tg();

      for (erh<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<erh<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> erg<T> a(tg $$0, Function<String, Optional<T>> $$1, cwg $$2) {
      erg<T> $$3 = new erg<>();
      erh.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
