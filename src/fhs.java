import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fhs<T> implements fhv<T>, fhx<T> {
   private final List<fht<T>> a = Lists.newArrayList();
   private final Set<fht<?>> b = new ObjectOpenCustomHashSet(fht.a);

   @Override
   public void a(fhu<T> $$0) {
      fht<T> $$1 = new fht<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fht<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iw $$0, T $$1) {
      return this.b.contains(fht.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fht<T>> a(long $$0) {
      return this.a;
   }

   public List<fht<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fhs<T> a(List<fht<T>> $$0) {
      fhs<T> $$1 = new fhs<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
