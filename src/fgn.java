import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fgn<T> implements fgq<T>, fgs<T> {
   private final List<fgo<T>> a = Lists.newArrayList();
   private final Set<fgo<?>> b = new ObjectOpenCustomHashSet(fgo.a);

   @Override
   public void a(fgp<T> $$0) {
      fgo<T> $$1 = new fgo<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fgo<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.b.contains(fgo.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fgo<T>> a(long $$0) {
      return this.a;
   }

   public List<fgo<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fgn<T> a(List<fgo<T>> $$0) {
      fgn<T> $$1 = new fgn<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
