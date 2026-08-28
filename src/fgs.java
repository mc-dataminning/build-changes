import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fgs<T> implements fgv<T>, fgx<T> {
   private final List<fgt<T>> a = Lists.newArrayList();
   private final Set<fgt<?>> b = new ObjectOpenCustomHashSet(fgt.a);

   @Override
   public void a(fgu<T> $$0) {
      fgt<T> $$1 = new fgt<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fgt<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iv $$0, T $$1) {
      return this.b.contains(fgt.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fgt<T>> a(long $$0) {
      return this.a;
   }

   public List<fgt<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fgs<T> a(List<fgt<T>> $$0) {
      fgs<T> $$1 = new fgs<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
