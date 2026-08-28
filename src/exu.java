import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exu<T> implements exx<T>, exz<T> {
   private final List<exv<T>> a = Lists.newArrayList();
   private final Set<exv<?>> b = new ObjectOpenCustomHashSet(exv.a);

   @Override
   public void a(exw<T> $$0) {
      exv<T> $$1 = new exv<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exv<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.b.contains(exv.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uu b(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();

      for (exv<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exv<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exu<T> a(ud $$0, Function<String, Optional<T>> $$1, dbm $$2) {
      exu<T> $$3 = new exu<>();
      exv.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
