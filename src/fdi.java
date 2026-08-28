import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fdi<T> implements fdl<T>, fdn<T> {
   private final List<fdj<T>> a = Lists.newArrayList();
   private final Set<fdj<?>> b = new ObjectOpenCustomHashSet(fdj.a);

   @Override
   public void a(fdk<T> $$0) {
      fdj<T> $$1 = new fdj<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fdj<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fdj.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fdj<T>> a(long $$0) {
      return this.a;
   }

   public List<fdj<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fdi<T> a(List<fdj<T>> $$0) {
      fdi<T> $$1 = new fdi<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
