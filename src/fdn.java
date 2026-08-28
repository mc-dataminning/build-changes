import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fdn<T> implements fdq<T>, fds<T> {
   private final List<fdo<T>> a = Lists.newArrayList();
   private final Set<fdo<?>> b = new ObjectOpenCustomHashSet(fdo.a);

   @Override
   public void a(fdp<T> $$0) {
      fdo<T> $$1 = new fdo<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fdo<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.b.contains(fdo.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fdo<T>> a(long $$0) {
      return this.a;
   }

   public List<fdo<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fdn<T> a(List<fdo<T>> $$0) {
      fdn<T> $$1 = new fdn<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
