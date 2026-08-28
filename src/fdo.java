import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fdo<T> implements fdr<T>, fdt<T> {
   private final List<fdp<T>> a = Lists.newArrayList();
   private final Set<fdp<?>> b = new ObjectOpenCustomHashSet(fdp.a);

   @Override
   public void a(fdq<T> $$0) {
      fdp<T> $$1 = new fdp<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fdp<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fdp.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fdp<T>> a(long $$0) {
      return this.a;
   }

   public List<fdp<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fdo<T> a(List<fdp<T>> $$0) {
      fdo<T> $$1 = new fdo<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
