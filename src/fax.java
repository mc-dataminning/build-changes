import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fax<T> implements fba<T>, fbc<T> {
   private final List<fay<T>> a = Lists.newArrayList();
   private final Set<fay<?>> b = new ObjectOpenCustomHashSet(fay.a);

   @Override
   public void a(faz<T> $$0) {
      fay<T> $$1 = new fay<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fay<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jg $$0, T $$1) {
      return this.b.contains(fay.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fay<T>> a(long $$0) {
      return this.a;
   }

   public List<fay<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fax<T> a(List<fay<T>> $$0) {
      fax<T> $$1 = new fax<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
