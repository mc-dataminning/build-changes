import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eks<T> implements ekv<T>, ekx<T> {
   private final List<ekt<T>> a = Lists.newArrayList();
   private final Set<ekt<?>> b = new ObjectOpenCustomHashSet(ekt.a);

   @Override
   public void a(eku<T> $$0) {
      ekt<T> $$1 = new ekt<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ekt<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ht $$0, T $$1) {
      return this.b.contains(ekt.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public sw b(long $$0, Function<T, String> $$1) {
      sf $$2 = new sf();

      for (ekt<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<ekt<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eks<T> a(sf $$0, Function<String, Optional<T>> $$1, cqz $$2) {
      eks<T> $$3 = new eks<>();
      ekt.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
