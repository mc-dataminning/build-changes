import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fek<T> implements fen<T>, fep<T> {
   private final List<fel<T>> a = Lists.newArrayList();
   private final Set<fel<?>> b = new ObjectOpenCustomHashSet(fel.a);

   @Override
   public void a(fem<T> $$0) {
      fel<T> $$1 = new fel<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fel<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jj $$0, T $$1) {
      return this.b.contains(fel.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fel<T>> a(long $$0) {
      return this.a;
   }

   public List<fel<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fek<T> a(List<fel<T>> $$0) {
      fek<T> $$1 = new fek<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
