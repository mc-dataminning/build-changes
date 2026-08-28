import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fbd<T> implements fbg<T>, fbi<T> {
   private final List<fbe<T>> a = Lists.newArrayList();
   private final Set<fbe<?>> b = new ObjectOpenCustomHashSet(fbe.a);

   @Override
   public void a(fbf<T> $$0) {
      fbe<T> $$1 = new fbe<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fbe<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fbe.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fbe<T>> a(long $$0) {
      return this.a;
   }

   public List<fbe<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fbd<T> a(List<fbe<T>> $$0) {
      fbd<T> $$1 = new fbd<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
