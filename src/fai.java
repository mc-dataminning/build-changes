import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fai<T> implements fal<T>, fan<T> {
   private final List<faj<T>> a = Lists.newArrayList();
   private final Set<faj<?>> b = new ObjectOpenCustomHashSet(faj.a);

   @Override
   public void a(fak<T> $$0) {
      faj<T> $$1 = new faj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(faj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(je $$0, T $$1) {
      return this.b.contains(faj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<faj<T>> a(long $$0) {
      return this.a;
   }

   public List<faj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fai<T> a(List<faj<T>> $$0) {
      fai<T> $$1 = new fai<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
