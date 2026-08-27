import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class enb<T> implements ene<T>, eng<T> {
   private final List<enc<T>> a = Lists.newArrayList();
   private final Set<enc<?>> b = new ObjectOpenCustomHashSet(enc.a);

   @Override
   public void a(end<T> $$0) {
      enc<T> $$1 = new enc<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(enc<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(hx $$0, T $$1) {
      return this.b.contains(enc.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public ti b(long $$0, Function<T, String> $$1) {
      sr $$2 = new sr();

      for (enc<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<enc<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> enb<T> a(sr $$0, Function<String, Optional<T>> $$1, csp $$2) {
      enb<T> $$3 = new enb<>();
      enc.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
