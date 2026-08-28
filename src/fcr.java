import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fcr<T> implements fcu<T>, fcw<T> {
   private final List<fcs<T>> a = Lists.newArrayList();
   private final Set<fcs<?>> b = new ObjectOpenCustomHashSet(fcs.a);

   @Override
   public void a(fct<T> $$0) {
      fcs<T> $$1 = new fcs<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fcs<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.b.contains(fcs.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fcs<T>> a(long $$0) {
      return this.a;
   }

   public List<fcs<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fcr<T> a(List<fcs<T>> $$0) {
      fcr<T> $$1 = new fcr<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
