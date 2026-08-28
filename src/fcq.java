import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Set;

public class fcq<T> implements fct<T>, fcv<T> {
   private final List<fcr<T>> a = Lists.newArrayList();
   private final Set<fcr<?>> b = new ObjectOpenCustomHashSet(fcr.a);

   @Override
   public void a(fcs<T> $$0) {
      fcr<T> $$1 = new fcr<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(fcr<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(ji $$0, T $$1) {
      return this.b.contains(fcr.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public List<fcr<T>> a(long $$0) {
      return this.a;
   }

   public List<fcr<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> fcq<T> a(List<fcr<T>> $$0) {
      fcq<T> $$1 = new fcq<>();
      $$0.forEach($$1::a);
      return $$1;
   }
}
