import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fco<T> implements fcr<T>, fct<T> {
   private final List<fcp<T>> a = Lists.newArrayList();
   private final Set<fcp<?>> b = new ObjectOpenCustomHashSet(fcp.a);

   @Override
   public void a(fcq<T> $$0) {
      fcp<T> $$1 = new fcp<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fcp<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.b.contains(fcp.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fcp<T>> a(long $$0) {
      return this.a;
   }

   public List<fcp<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fco<T> a(List<fcp<T>> $$0) {
      fco<T> $$1 = new fco<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
