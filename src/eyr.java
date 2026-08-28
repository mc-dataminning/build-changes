import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eyr<T> implements eyu<T>, eyw<T> {
   private final List<eys<T>> a = Lists.newArrayList();
   private final Set<eys<?>> b = new ObjectOpenCustomHashSet(eys.a);

   @Override
   public void a(eyt<T> $$0) {
      eys<T> $$1 = new eys<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eys<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jd $$0, T $$1) {
      return this.b.contains(eys.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public uy b(long $$0, Function<T, String> $$1) {
      uh $$2 = new uh();

      for (eys<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eys<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eyr<T> a(uh $$0, Function<String, Optional<T>> $$1, dcd $$2) {
      eyr<T> $$3 = new eyr<>();
      eys.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
