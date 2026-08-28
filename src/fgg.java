import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fgg<T> implements fgj<T>, fgl<T> {
   private final List<fgh<T>> a = Lists.newArrayList();
   private final Set<fgh<?>> b = new ObjectOpenCustomHashSet(fgh.a);

   @Override
   public void a(fgi<T> $$0) {
      fgh<T> $$1 = new fgh<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fgh<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.b.contains(fgh.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fgh<T>> a(long $$0) {
      return this.a;
   }

   public List<fgh<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fgg<T> a(List<fgh<T>> $$0) {
      fgg<T> $$1 = new fgg<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
