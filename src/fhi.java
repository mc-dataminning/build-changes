import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fhi<T> implements fhl<T>, fhn<T> {
   private final List<fhj<T>> a = Lists.newArrayList();
   private final Set<fhj<?>> b = new ObjectOpenCustomHashSet(fhj.a);

   @Override
   public void a(fhk<T> $$0) {
      fhj<T> $$1 = new fhj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fhj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iw $$0, T $$1) {
      return this.b.contains(fhj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fhj<T>> a(long $$0) {
      return this.a;
   }

   public List<fhj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fhi<T> a(List<fhj<T>> $$0) {
      fhi<T> $$1 = new fhi<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
