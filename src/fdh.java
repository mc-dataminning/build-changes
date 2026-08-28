import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fdh<T> implements fdk<T>, fdm<T> {
   private final List<fdi<T>> a = Lists.newArrayList();
   private final Set<fdi<?>> b = new ObjectOpenCustomHashSet(fdi.a);

   @Override
   public void a(fdj<T> $$0) {
      fdi<T> $$1 = new fdi<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fdi<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fdi.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fdi<T>> a(long $$0) {
      return this.a;
   }

   public List<fdi<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fdh<T> a(List<fdi<T>> $$0) {
      fdh<T> $$1 = new fdh<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
