import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectOpenCustomHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;

public class eir<T> implements eiu<T>, eiw<T> {
   private final List<eis<T>> a = Lists.newArrayList();
   private final Set<eis<?>> b = new ObjectOpenCustomHashSet(eis.a);

   @Override
   public void a(eit<T> $$0) {
      eis<T> $$1 = new eis<>($$0.a(), $$0.b(), 0, $$0.d());
      this.a($$1);
   }

   private void a(eis<T> $$0) {
      if (this.b.add($$0)) {
         this.a.add($$0);
      }
   }

   @Override
   public boolean a(gw $$0, T $$1) {
      return this.b.contains(eis.a($$1, $$0));
   }

   @Override
   public int a() {
      return this.a.size();
   }

   @Override
   public rq b(long $$0, Function<T, String> $$1) {
      rc $$2 = new rc();

      for (eis<T> $$3 : this.a) {
         $$2.add($$3.a($$1));
      }

      return $$2;
   }

   public List<eis<T>> b() {
      return List.copyOf(this.a);
   }

   public static <T> eir<T> a(rc $$0, Function<String, Optional<T>> $$1, cpi $$2) {
      eir<T> $$3 = new eir<>();
      eis.a($$0, $$1, $$2, $$3::a);
      return $$3;
   }
}
