import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class ffy<T> implements fgb<T>, fgd<T> {
   private final List<ffz<T>> a = Lists.newArrayList();
   private final Set<ffz<?>> b = new ObjectOpenCustomHashSet(ffz.a);

   @Override
   public void a(fga<T> $$0) {
      ffz<T> $$1 = new ffz<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ffz<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(iu $$0, T $$1) {
      return this.b.contains(ffz.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<ffz<T>> a(long $$0) {
      return this.a;
   }

   public List<ffz<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ffy<T> a(List<ffz<T>> $$0) {
      ffy<T> $$1 = new ffy<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
