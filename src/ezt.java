import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class ezt<T> implements ezw<T>, ezy<T> {
   private final List<ezu<T>> a = Lists.newArrayList();
   private final Set<ezu<?>> b = new ObjectOpenCustomHashSet(ezu.a);

   @Override
   public void a(ezv<T> $$0) {
      ezu<T> $$1 = new ezu<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(ezu<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(je $$0, T $$1) {
      return this.b.contains(ezu.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<ezu<T>> a(long $$0) {
      return this.a;
   }

   public List<ezu<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> ezt<T> a(List<ezu<T>> $$0) {
      ezt<T> $$1 = new ezt<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
