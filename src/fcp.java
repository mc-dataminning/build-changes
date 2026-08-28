import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fcp<T> implements fcs<T>, fcu<T> {
   private final List<fcq<T>> a = Lists.newArrayList();
   private final Set<fcq<?>> b = new ObjectOpenCustomHashSet(fcq.a);

   @Override
   public void a(fcr<T> $$0) {
      fcq<T> $$1 = new fcq<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fcq<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.b.contains(fcq.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fcq<T>> a(long $$0) {
      return this.a;
   }

   public List<fcq<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fcp<T> a(List<fcq<T>> $$0) {
      fcp<T> $$1 = new fcp<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
