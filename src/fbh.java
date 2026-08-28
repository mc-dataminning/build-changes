import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fbh<T> implements fbk<T>, fbm<T> {
   private final List<fbi<T>> a = Lists.newArrayList();
   private final Set<fbi<?>> b = new ObjectOpenCustomHashSet(fbi.a);

   @Override
   public void a(fbj<T> $$0) {
      fbi<T> $$1 = new fbi<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fbi<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(jh $$0, T $$1) {
      return this.b.contains(fbi.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fbi<T>> a(long $$0) {
      return this.a;
   }

   public List<fbi<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fbh<T> a(List<fbi<T>> $$0) {
      fbh<T> $$1 = new fbh<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
