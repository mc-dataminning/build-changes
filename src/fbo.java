import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fbo<T> implements fbr<T>, fbt<T> {
   private final List<fbp<T>> a = Lists.newArrayList();
   private final Set<fbp<?>> b = new ObjectOpenCustomHashSet(fbp.a);

   @Override
   public void a(fbq<T> $$0) {
      fbp<T> $$1 = new fbp<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fbp<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fbp.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fbp<T>> a(long $$0) {
      return this.a;
   }

   public List<fbp<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fbo<T> a(List<fbp<T>> $$0) {
      fbo<T> $$1 = new fbo<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
