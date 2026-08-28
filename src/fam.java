import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fam<T> implements fap<T>, far<T> {
   private final List<fan<T>> a = Lists.newArrayList();
   private final Set<fan<?>> b = new ObjectOpenCustomHashSet(fan.a);

   @Override
   public void a(fao<T> $$0) {
      fan<T> $$1 = new fan<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fan<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jf $$0, T $$1) {
      return this.b.contains(fan.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fan<T>> a(long $$0) {
      return this.a;
   }

   public List<fan<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fam<T> a(List<fan<T>> $$0) {
      fam<T> $$1 = new fam<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
