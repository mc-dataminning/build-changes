import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class exo<T> implements exr<T>, ext<T> {
   private final List<exp<T>> a = Lists.newArrayList();
   private final Set<exp<?>> b = new ObjectOpenCustomHashSet(exp.a);

   @Override
   public void a(exq<T> $$0) {
      exp<T> $$1 = new exp<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(exp<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ja $$0, T $$1) {
      return this.b.contains(exp.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uu b(long $$0, Function<T, String> $$1) {
      ud $$2 = new ud();

      for (exp<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<exp<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> exo<T> a(ud $$0, Function<String, Optional<T>> $$1, dbk $$2) {
      exo<T> $$3 = new exo<>();
      exp.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
