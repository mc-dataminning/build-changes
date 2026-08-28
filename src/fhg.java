import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fhg<T> implements fhj<T>, fhl<T> {
   private final List<fhh<T>> a = Lists.newArrayList();
   private final Set<fhh<?>> b = new ObjectOpenCustomHashSet(fhh.a);

   @Override
   public void a(fhi<T> $$0) {
      fhh<T> $$1 = new fhh<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fhh<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.b.contains(fhh.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fhh<T>> a(long $$0) {
      return this.a;
   }

   public List<fhh<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fhg<T> a(List<fhh<T>> $$0) {
      fhg<T> $$1 = new fhg<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
